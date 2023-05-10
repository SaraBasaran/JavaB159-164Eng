package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
        /*
        Array can contain just "primitive" data types and "references" of non-primitives
         */
        
        //Example 1: Create an integer array with 4 elements then find the sum of all elements
        
        int nums[]=new int[4];

        System.out.println(Arrays.toString(nums));//

        nums[0]=12;
        nums[1]=8;
        nums[2]=10;
        nums[3]=7;

        System.out.println(Arrays.toString(nums));//[12, 8, 10, 7]

        int sum=0;
        
        for (int w: nums){
            
            sum= sum+w;

        }

        System.out.println("sum = " + sum);

        //Example 2:Create a String array with length 5 print the elements whose length is more than 6 on the console

        String cities[]= new String[5];

        System.out.println(Arrays.toString(cities));//[null, null, null, null, null]

        cities[0]="Miami";
        cities[1]="New York";
        cities[2]="Jacksonville";
        cities[3]="California";
        cities[4]="Tampa";

        System.out.println(Arrays.toString(cities));//[Miami, New York, Jacksonville, California, Tampa]

        for (String w: cities){

            if (w.length()>6){

                System.out.print(w + " ");
            }

        }

        //Example 3:Create a String array with length 5 print the elements before California including it
        //[Miami, New York, Jacksonville, California, Tampa]

        String cities2[]= new String[5];

        System.out.println(Arrays.toString(cities2));//[null, null, null, null, null]

        cities2[0]="Miami";
        cities2[1]="New York";
        cities2[2]="Jacksonville";
        cities2[3]="California";
        cities2[4]="Tampa";

        System.out.println(Arrays.toString(cities2));//[Miami, New York, Jacksonville, California, Tampa]

        for (String w: cities2){

            System.out.print(w + " ");

            if (w.equals("California")){

                break;

            }



        }
        //Example 4:Create a String array with length 5 print the elements except California and Miami
        //[Miami, New York, Jacksonville, California, Tampa]

        String cities3[]= new String[5];

        System.out.println(Arrays.toString(cities3));//[null, null, null, null, null]

        cities3[0]="Miami";
        cities3[1]="New York";
        cities3[2]="Jacksonville";
        cities3[3]="California";
        cities3[4]="Tampa";

        System.out.println(Arrays.toString(cities3));//[Miami, New York, Jacksonville, California, Tampa]

        for (String w: cities3){

            if (w.equals("California") || w.equals("Miami")){

                continue;

            }
            System.out.print(w +" ");
        }



















    }
}
