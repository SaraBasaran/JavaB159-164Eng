package day09nestedternary;

import java.util.Scanner;

public class Switch04 {
    public static void main(String[] args) {
        /*
        Switch Statement can be used with String, int, char but cannot be used with long, double, float, boolean
     */
        //Example 1: Create a calculator does +, -, *, /, %

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the operation  +, -, *, /, % ");

        char opr= input.next().charAt(0);

        System.out.println("Enter two numbers to do operation");
        int a= input.nextInt();
        int b= input.nextInt();

        switch (opr){

            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a*b/100);
                break;
            default:
                System.out.println("Undefined operation");
        }



    }

}
