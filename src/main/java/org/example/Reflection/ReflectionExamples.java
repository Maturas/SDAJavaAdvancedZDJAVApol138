package org.example.Reflection;

import java.lang.reflect.*;
import java.util.Arrays;

public class ReflectionExamples {
    public static void example(Object obj) {
        example(obj.getClass());
    }

    public static void example(Class<?> clazz) {
        System.out.println("Name:");
        printClassName(clazz);
        System.out.println();
        System.out.println("Fields:");
        printClassFields(clazz);
        System.out.println();
        System.out.println("Methods:");
        printClassMethods(clazz);
        System.out.println();
        System.out.println("Constructors:");
        printClassConstructors(clazz);
    }

    public static void printClassName(Class<?> clazz) {
        System.out.println("Class Name: " + clazz.getSimpleName());
        System.out.println("Package Name: " + clazz.getPackageName());
        System.out.println("Full Name: " + clazz.getName());
    }

    // getClass - available in every object, returns the type of this object
    // getType - available in every Field object, returns the type of the field represented by this object

    public static void printClassFields(Class<?> clazz) {
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
    }

    public static void printClassMethods(Class<?> clazz) {
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getReturnType().getSimpleName() + " " + method.getName());

            Parameter[] parameters = method.getParameters();

            if (parameters.length > 0) {
                System.out.println("Parameters: ");
                for (Parameter parameter : method.getParameters()) {
                    System.out.println(parameter.getType().getSimpleName() + " " + parameter.getName());
                }
            }
        }
    }

    public static void printClassConstructors(Class<?> clazz) {
        Constructor<?>[] ctors = clazz.getConstructors();
        Integer counter = 1;
        for (Constructor<?> ctor : ctors) {
            System.out.println("Construtor #" + counter);
            counter++;

            Parameter[] parameters = ctor.getParameters();

            if (parameters.length > 0) {
                System.out.println("Parameters: ");
                for (Parameter parameter : ctor.getParameters()) {
                    System.out.println(parameter.getType().getSimpleName() + " " + parameter.getName());
                }
            }
        }
    }

    public static void printAllFieldsWithCurrentValues(Object obj) {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            try {
                String name = field.getName();
                String type = field.getType().getSimpleName();
                field.setAccessible(true);
                Object value = field.get(obj);
                String currentValue = value.toString();

                System.out.println(type + " " + name + " " + currentValue);
            } catch (IllegalAccessException e) {
                System.out.println("Accessing field failed.");
            }
        }
    }

    public static void changeFieldValue(Object obj, String fieldName, Object newValue) {
        try {
            Class<?> clazz = obj.getClass();
            Field field = clazz.getDeclaredField(fieldName);

            if (field.getType().equals(newValue.getClass())) {
                field.setAccessible(true);
                field.set(obj, newValue);
            }
            else {
                System.out.println("New value type mismatch! Field type: "
                        + field.getType().getSimpleName() + " Value type: "
                        + newValue.getClass().getSimpleName());
            }
        } catch (NoSuchFieldException e) {
            System.out.println("Field with name " + fieldName + " not found!");
        } catch (IllegalAccessException e) {
            System.out.println("Accessing field failed.");
        }
    }

    public static void invokeMethod(Object obj, String methodName) {
        try {
            Class<?> clazz = obj.getClass();
            Method method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);
            method.invoke(obj);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            System.out.println("Method invokation error!");
        }
    }

    public static void invokeMethodWithReturnValue(Object obj, String methodName) {
        try {
            Class<?> clazz = obj.getClass();
            Method method = clazz.getDeclaredMethod(methodName);
            method.setAccessible(true);
            Object returnValue = method.invoke(obj);
            System.out.println("Returned value: " + returnValue);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            System.out.println("Method invokation error!");
        }
    }

    public static void invokeMethodWithParametersAndReturnValue(Object obj, String methodName, Object[] parameters) {
        try {
            Class<?> clazz = obj.getClass();
            Class<?>[] parameterTypes = Arrays.stream(parameters).map(Object::getClass).toArray(Class<?>[]::new);
            Method method = clazz.getDeclaredMethod(methodName, parameterTypes);
            method.setAccessible(true);
            Object returnValue = method.invoke(obj, parameters);
            System.out.println("Returned value: " + returnValue);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            System.out.println("Method invokation error!");
        }
    }

    public static void createNewInstanceOfClass(Class<?> clazz, Object[] ctorParams) {
        try {
            Class<?>[] parameterTypes = Arrays.stream(ctorParams).map(Object::getClass).toArray(Class<?>[]::new);
            Constructor<?> ctor = clazz.getDeclaredConstructor(parameterTypes);
            ctor.setAccessible(true);
            Object newObj = ctor.newInstance(ctorParams);
            System.out.println(newObj);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException |IllegalAccessException e) {
            System.out.println("Constructor invokation error!");
        }
    }
}
