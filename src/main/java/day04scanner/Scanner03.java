package day04scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter two numbers then do addition and multiplication operations with the numbers

        //1.step:Create a Scanner class object

        Scanner input= new Scanner(System.in);

        //2.step: Give a message to the user

        System.out.println("Enter first number please...");

        double num1= input.nextDouble();

        System.out.println("Enter the second number please..");

        double num2= input.nextDouble();

        System.out.println("The sum is " + (num1+num2));

        System.out.println("The multiplication is " + num1*num2);



    }



}
