package day07ifstatements;

public class IfStatement01 {

    public static void main(String[] args) {

        //If it rains, I will cancel the picnic




        //Example 1: Type code to check if a number is even or odd.

        int num= 13;

        if(num%2==0){
            System.out.println("Even");
        }
        if(num%2!=0){

            System.out.println("Odd");


        }
        //Example 2: Type code to check if initial of a String object is in uppercase or not

        /*
        ||  --> OR operator  optimistic once one of the conditions is true java executes the remaining part of coding syntax
        &&  --> AND operator pessimistic once one of the conditions is false java will not execute the remaining part of coding
         */

        String s= "miami";

      //1.way:

       if(s.charAt(0)>='A' && s.charAt(0)<='Z'){

           System.out.println("It is uppercase");

       }
       if(s.charAt(0)<'A' || s.charAt(0)>'Z'){

           System.out.println("Not upper case");

       }

       //2.way:
        if(s.charAt(0)>='A' && s.charAt(0)<='Z'){

            System.out.println("It is uppercase");

        }else{
            System.out.println("Not upper case");

        }

       //Example 3: Type code to check if a number is positive, negative or neutral(0)


       int number= 23;

        if(number>0){
            System.out.println("Positive");
        }else if(number==0){
            System.out.println("Neutral");

        }else{
            System.out.println("Negative");
        }


        //Example 4: Type code to print day name when you enter the day number

        int dayNumber= -34;

        if (dayNumber==1){
            System.out.println("Sunday");
        }else if(dayNumber==2){
            System.out.println("Monday");
        }else if(dayNumber==3){
            System.out.println("Tuesday");
        }else if(dayNumber==4){
            System.out.println("Wednesday");
        }else if(dayNumber==5){
            System.out.println("Thursday");
        }else if (dayNumber==6){
            System.out.println("Friday");
        }else if(dayNumber==7){
            System.out.println("Saturday");
        }else{
            System.out.println("Invalid day number, please enter a valid number 1-7");
        }


































    }




}
