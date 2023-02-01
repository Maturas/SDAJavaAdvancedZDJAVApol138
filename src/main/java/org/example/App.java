package org.example;

import org.example.EnumExample.Product;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );

        Product myProduct = Product.BACON;

        if (myProduct.equals(Product.SAUSAGE)) {
            System.out.println("This is a sausage!");
        }
        else {
            System.out.println("This is not a sausage!");
        }

        System.out.println(myProduct.getPrice());
        System.out.println(myProduct.getVatRate());
    }
}
