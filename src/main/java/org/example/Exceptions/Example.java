package org.example.Exceptions;

public class Example {
    public static void commonExceptions() {
        // NullPointerException - thrown when attempting to read a value or invoke a method on a null-referenced variable
        Object someObj = null;
        System.out.println(someObj.toString());

        // ArrayIndexOutOfBoundsException - thrown when attempting to read from an index outside of array's bounds
        Integer[] ints = new Integer[3];
        System.out.println(ints[3]);

        // ClassCastException - thrown when attempting to cast an object into a mismatched type
        String s = "Hello!";
        Object o = s;
        Integer n = (Integer) o;

        // Arithmetic Exception - thrown when attempting to break laws of mathematics
        Integer x = 10 / 0;
    }

    // Prevention - let's try our best to write code in a way which doesn't throw exception

    public static void tryCatchBlock() {
        Integer n = 0;

        try {
            // Tries to execute these lines
            Object someObj = null;
            System.out.println(someObj.toString());

            String s = "Hello!";
            Object o = s;
            n = (Integer) o;
        }
        catch (NullPointerException e) {
            // We jump to this block, if any of the try-block lines throw a NullPointerException
        }
        catch (ClassCastException e) {
            // We jump to this block, if any of the try-block lines throw a ClassCastException
        }
        catch (Exception e) {
            // We jump to this block, if any of the try-block lines throw any Exception
        }
        finally {
            // This block will ALWAYS execute, either after block try has ended, or after any of the catch bloks have ended
        }

        System.out.println("Continuing work: " + n);
    }
}
