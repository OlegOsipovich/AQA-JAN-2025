package org.prog.exceptions;


import java.io.FileNotFoundException;

//TODO: write a method which ca cause NullPointerException
// TODO: write try-catc-finally to catch NPE
// TODO: on exception -> print "EXCEPTION CAUGHT!"
// TODO: always print "DONE TRY-CATCH-FINALLY"  asd
public class ExceptionsHomework {
    public static void main(String[] args) {


        try {
            Integer num = 10;
            Integer num2 = null;

            System.out.println(num2.equals(num));

        } catch (NullPointerException npe) {
            System.out.println("EXCEPTION CAUGHT!");

        } finally {
            System.out.println("DONE TRY-CATCH-FINALLY");
        }
    }




}











