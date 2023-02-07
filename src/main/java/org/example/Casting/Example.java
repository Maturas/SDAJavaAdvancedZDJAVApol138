package org.example.Casting;

public class Example {
    public static void howToCheckTheActualTypeOfAnObject() {
        A aAsA = new A();
        A bAsA = new B();

        // if the actual type of this object is B
        if (bAsA instanceof B) {
            // yes, this is an instance of B
        }
        else {
            // No, this is not an instance of B
        }
    }

    // Casting - changing the perceived type of object

    // Upcasting vs Downcasting
    // Implicit casting vs Explicit casting

    // Upcasting is casting an object into a type higher in the class hierarchy (superclass, implemented interface)
    // Upcasting is implicit, because it's safe

    // Downcasting is casting an object into a type lower in the class hierarchy (subclass, class implementing given interface)
    // Downcasting is explicit, because it's unsafe

    // Implicit casting is casting, which happens automatically (implicitly), doesn't require any additional syntax
    // Explicit casting is casting, which happens manually, requires extra syntax (is explicit)

    public static void upcasting() {
        B bObj = new B();

        A bAsA = bObj; // Upcasting - we're casting object of type B into its superclass - A
    }

    public static void downcasting() {
        B bObj = new B();
        A bAsA = bObj;

        B bAsB = (B) bAsA; // Downcasting - we're casting object from type A into its subclass - B
        // It's unsafe, because, it isn't guaranteed, that this cast will succeed
        // For example, if bAsA, is actually an A object, this will fail - throw an ClassCastException
    }

    public static void safeDowncastingWithInstanceof() {
        B bObj = new B();
        A bAsA = bObj;

        if (bAsA instanceof B) {
            B bAsB = (B) bAsA; // This is guaranteed to succeed!
        }
        else {
            // That cast is impossible!
        }
    }

    public static void safeDowncastingWithTryCatch() {
        B bObj = new B();
        A bAsA = bObj;

        try {
            B bAsB = (B) bAsA; // Let's try this cast and see if it succeeds

            // At this point, we know it succeeded
        }
        catch (ClassCastException e) {
            // BOOM! It failed!
        }
    }
}
