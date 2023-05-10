package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {


    //Example 1: Type code lets user enter many student names into an array.
    //           Whenever user wants he should be able to quit
    //           When I quit or complete I should see all elements on the console.
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number of the students you want to insert...");
        int n= input.nextInt();
        String[] names = new String[n];

        for (int i=0; i<n; i++){

            System.out.println("Please enter "+ (i+1) +". student name, to quit press 'Q'");
            String stdName= input.next();

            if (!stdName.equalsIgnoreCase("Q")){

                names[i]= stdName;
            }else {
                break;
            }


        }
        for(String w : names){
            if(w==null){
                break;
            }
            System.out.print(w + " ");
        }


    }




}
