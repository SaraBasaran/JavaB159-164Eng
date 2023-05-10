package day33exceptionsenums;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception01 {
    /*
    1-If you get red underline while you type code it means compaile time exception or checked exception
    2-To handle checked exception you can use "try-catch" block
    3-If you use multiple catch-clocks after try block and the Exception Classes have parent -child relationship
    Child Exception class must be typed first, Parent Exception should be typed later.

     Interview Question:
     What is the difference between "throw" and "throws"?
     i)"throw" is used in the method body, "throws" keyword can be used in the method signature line
     ii) "throw" can be used many times in a method body, but "throws" can be used just once
     iii)after using "throw" keyword we create an Exception Class object, but after using "throws" we just type the name of the Exception Class
     iv)After using "throw" keyword we can use just one "Exception Class" but after using "throws" we can use multiple Exception Classes.
     v)"throw" keyword handles the exception and lets next codes to be executed, but "throws" keyword makes the app be stopped once the exception is caught.


     */


    //Example 1: Create method that reads text in a text-file.

    public static void main(String[] args) {
        readTextFile();

        try {
            readTextFile2();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

    //1.way:
        public static void readTextFile(){

        try {
            FileInputStream fis= new FileInputStream("src/main/java/day33exceptionsenumsX/MyTextFile.txt");

            int k=0;
            while ((k=fis.read())!=-1){

                System.out.print((char) k);

            }

        } catch (FileNotFoundException e) {//FileNotFoundException is for path checking and the existence of the file(CompileTimeException OR CheckedException)
            System.out.println("There is an issue in the path or the file deleted");
        }
        catch (IOException e) {//IOException is for all issues related with input and Output for Java(CompileTimeException OR CheckedException)
            System.out.println("Some characters are not in English");
        }

            System.out.println("App did not stop");

    }

    //2.way: by using "throws" keyword

    public static void readTextFile2() throws IOException {

        FileInputStream fis= new FileInputStream("src/main/java/day33exceptionsenumsX/MyTextFile.txt");
        int k=0;
        while ((k=fis.read())!=-1){

            System.out.print((char) k);

        }
        System.out.println("App stopped!");


    }









}
