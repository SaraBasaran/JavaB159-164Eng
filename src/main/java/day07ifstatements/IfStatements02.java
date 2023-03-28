package day07ifstatements;

import java.util.Scanner;

public class IfStatements02 {

    public static void main(String[] args) {

        //Example 1: Ask user to enter day name then print if the day name is week day or weekend day
        //           Monday --> Weekday    Sunday --> Weekend day

        Scanner input= new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName= input.next();

        //1.way:
        if(dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Week end");
        } else if(dayName.equalsIgnoreCase("Monday")){
            System.out.println("Week day");
        } else if(dayName.equalsIgnoreCase("Tuesday")){
            System.out.println("Week day");
        } else if(dayName.equalsIgnoreCase("Wednesday")){
            System.out.println("Week day");
        } else if(dayName.equalsIgnoreCase("Thursday")){
            System.out.println("Week day");
        } else if(dayName.equalsIgnoreCase("Friday")){
            System.out.println("Week day");
        } else if(dayName.equalsIgnoreCase("Saturday")){
            System.out.println("Week end");
        } else{
            System.out.println("Invalid entry, please enter one of the day names");
        }

        //2.way

        boolean isWeekDay=dayName.equalsIgnoreCase("Monday") ||
                          dayName.equalsIgnoreCase("Tuesday") ||
                          dayName.equalsIgnoreCase("Wednesday") ||
                          dayName.equalsIgnoreCase("Thursday") ||
                           dayName.equalsIgnoreCase("Friday");

        boolean isWeekend= dayName.equalsIgnoreCase("Sunday") || dayName.equalsIgnoreCase("Saturday");

        if (isWeekend){
            System.out.println("Week end");
        }else if(isWeekDay){
            System.out.println("Week day");
        }else {
            System.out.println("Invalid entry, please enter one of the day names");
        }






    }





}
