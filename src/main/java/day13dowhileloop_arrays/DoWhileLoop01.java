package day13dowhileloop_arrays;

import java.util.Scanner;

public class DoWhileLoop01 {

    //while loop
    public static void main(String[] args) {

        int i=1;

        while (i<1){
            System.out.println("I am while loop");
            i++;
        }

        System.out.println();
        int k= 1;
        do{
            System.out.println("I am do while loop");
            k++;

        }while (k<1);

        /*

        Note: while loop checks the first condition then execute the loop body
        If the condition is false loop body will not be executed even once
        Zero execution is possible in while loop

        Note: Do while loop execute the loop body then checks the condition
             if the condition is false loop body will be executed at least for once
             Zero execution is impossible in do-while loop
         */

         /*
              Example 1:  Ask user to enter an integer.
                          If the integer is less than 100, tell user "Won!"
                          Otherwise, tell user "Lost!"
	    */

        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter an integer");
            int num = input.nextInt();
                if (num<100){
                    System.out.println("Won!");

                }else{
                    System.out.println("Lost");
                    break;
                }
        }while(true);





    }


}
