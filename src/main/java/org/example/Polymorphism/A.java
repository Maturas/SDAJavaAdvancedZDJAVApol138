package org.example.Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class A {
    public void introduce() {
        System.out.println("Hello, I am A!");
    }

    public static void example() {
        // Left side - perceived type (how we look at the object)
        // Right side - actual type (what the object actually is)

        // Perceived type of object can be changed (declared by the variable/parameter)
        // Actual type of object cannot be changed (declared when using the constructor)
        A aObj = new A();
        B bObj = new B(); // Object of type B can be assigned to a variable of type A, because A is a superclass of B
        C cObj = new C(); // Object of type C can be assigned to a variable of type A, because A is a superclass of C

        B bAsB = new B(); // This has access to members of A (superclass) and B (actual and perceived type)
        A bAsA = new B(); // This has access only to members of A (superclass and perceived type). Members of B (actual type) are hidden.

        bAsB.uniqueBMethod(); // can call uniqueBMethod because I perceive this object as B
        // bAsA.uniqueBMethod(); // can't call uniqueBMethod because I perceive this object as A (I don't know that this is B)

        aObj.introduce();
        bObj.introduce();
        cObj.introduce();

        List<A> aList = new ArrayList<>();
        aList.add(aObj);
        aList.add(bObj);
        aList.add(cObj);
        for (A obj : aList) {
            obj.introduce();
        }
    }
}
