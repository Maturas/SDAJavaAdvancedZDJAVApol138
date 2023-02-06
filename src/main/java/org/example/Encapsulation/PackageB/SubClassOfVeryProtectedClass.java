package org.example.Encapsulation.PackageB;

import org.example.Encapsulation.PackageA.VeryProtectedClass;

public class SubClassOfVeryProtectedClass extends VeryProtectedClass {
    public static void example() {
        SubClassOfVeryProtectedClass subObj = new SubClassOfVeryProtectedClass();
        subObj.word = "";
        subObj.number = 7777.78;
        subObj.myNonStaticMethod();
        VeryProtectedClass.myStaticMethod();
    }
}
