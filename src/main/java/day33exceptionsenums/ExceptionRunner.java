package day33exceptionsenums;

public class ExceptionRunner {
    /*
    1-To declare your own strict rules in your app, you can create your own "Exception Classes"
    For example, if using negative values in your app is dangerous, you can cretae "IllegalAgeException Class" and
    you can throw "IllegalAgeException" when the age is negative.
    2-When you name a Custom Exception Class use "Exception" word at the end of the exception class name
    3-If you want to create "Custom Checked Exception" extend to "Exception Class"
    4- Every Exception class must have "Constructor" and the constructor should use the parent constructor as well.

    5-If you want to create "Unchecked Exception" you should extend your Custom class to RunTimeException Class

     */

    public static void main(String[] args) throws IllegalAgeException {

        printAge(12);
        printAge(-45);

        printAge2(34);
        //printAge2(-10);
        printMathGrades(70);
       // printMathGrades(1000);

    }
    //Example 1: Create a method to print user's age

    //1.way:
    public static void printAge(int age){

        if(age<0){
            try {
                throw new IllegalAgeException("Age cannot be negative");
            } catch (IllegalAgeException e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Your age is " + age);
        }

    }
    //2.way:
    public static void printAge2(int age) throws IllegalAgeException {
        if (age<0){

            throw new IllegalAgeException("Age cannot be negative");

        }
        System.out.println("Your age is " + age);

    }

    //Example 2: Create a method that prints students' math grades

    public static void printMathGrades(int mathGrade){

        if(mathGrade<0 || mathGrade>100){

            throw new IllegalGradeException("Grade can not be less than 0 or greater than 100");
        }
        System.out.println("Your grade is " +mathGrade);

    }






}
