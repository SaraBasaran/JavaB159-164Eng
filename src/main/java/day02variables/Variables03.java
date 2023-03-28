package day02variables;

public class Variables03 {

    public static void main(String[] args) {

        //Example 1: Create two short variables and print their sum on the console

        short s1= 12;
        short s2= 23;
        System.out.print(s1 + s2);

        //Example 2: Create two variables for prices and print their sum on the console
        double shirtPrice= 12.99;
        double shoesPrice= 124.99;
        System.out.println(shirtPrice + shoesPrice);//137.98

        //Example 3: Create a variable for student's age and another variable for population of a country.
        //           Print their difference on the console.

        byte stdAge= 13;
        int populationOfCountry= 83000000;
        System.out.println(populationOfCountry - stdAge);//82999987

        System.out.println(6/5);

        System.out.println(6/5.0);

        //Note: If you use different data types in a Math operation the result will be in the largest dat type
        // 6/5 -- 1       6/5.0 --> 1.2

        //Example 1: Estimate the result of the given operation
        //           (2 + 4.6) / 3 - 4 * 2
        //paranthesis is done first in maths
        //*  and / done secondly
        // + and -  are done last


        //-5.800000000000001
        System.out.println((2 + 4.6) / 3 - 4 * 2);


    }


}
