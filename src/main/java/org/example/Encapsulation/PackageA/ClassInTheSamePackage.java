package org.example.Encapsulation.PackageA;

// public class - can be used anywhere
// class - can be used only in this package
// private and protected modifiers do not apply to classes
public class ClassInTheSamePackage {
    public static void example() {
        VeryDefaultClass defaultObj = new VeryDefaultClass();
        defaultObj.name = "Text";
        defaultObj.number = 2222;
        defaultObj.doSomethingNonStatic();
        VeryDefaultClass.doSomethingStatic();

        VeryProtectedClass protectedObj = new VeryProtectedClass();
        protectedObj.word = "Some";
        protectedObj.number = 1111.0;
        protectedObj.myNonStaticMethod();
        VeryProtectedClass.myStaticMethod();
    }
}
