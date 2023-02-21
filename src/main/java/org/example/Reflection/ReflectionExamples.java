package org.example.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

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
}
