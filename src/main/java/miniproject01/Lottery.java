package miniproject01;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    /*
Project: Numerical Lotto Application
   Let n random numbers be generated for the ticket.
   Let the lottery result be generated with n random numbers.
   There should be no repeated numbers in the numerical lottery.

   Ask user to enter n(number of digits) also min and max values for numbers


   compare result of matching digits and ticket, how many matches there are
   notify the user.

*/
    public static void main(String[] args) {

        startLoto();
    }

    public static void startLoto() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number of digits you want to receive: ");
        int numOfDigits = inp.nextInt();
        System.out.print("Enter the minimum value for the digits ");
        int min = inp.nextInt();
        System.out.print("Enter the maximum value for the digits");
        int max = inp.nextInt();

        int[] lottoArr = new int[numOfDigits];
        int[] ticketArr = new int[numOfDigits];

        int randomNumber1 = 0;
        int randomNumber2 = 0;
        Random random = new Random();
        boolean isRepeated;
        for (int i = 0; i < numOfDigits; i++) {
            do {
                isRepeated = false;

                randomNumber1 = random.nextInt(max + 1 - min) + min;

                for (int j = 0; j < i; j++) {
                    if (lottoArr[j] == randomNumber1) {
                        isRepeated = true;
                        break;
                    }
                }

            } while (isRepeated);
            lottoArr[i] = randomNumber1;

            do {
                isRepeated = false;

                randomNumber2 = random.nextInt(max + 1 - min) + min;

                for (int j = 0; j < i; j++) {
                    if (ticketArr[j] == randomNumber2) {
                        isRepeated = true;
                        break;
                    }
                }

            } while (isRepeated);
            ticketArr[i] = randomNumber2;
        }
        System.out.println("My ticket: ");
        for (int i = 0; i < ticketArr.length; i++) {
            System.out.print(ticketArr[i] + " ");
        }
        System.out.println();
        System.out.println("Lottery: ");
        for (int i = 0; i < lottoArr.length; i++) {
            System.out.print(lottoArr[i] + " ");


        }
        System.out.println();
        int result=compareArr(ticketArr, lottoArr);

        if (result>0){
            System.out.println("Congratulations! "+ result + " matching number");
        }else{
            System.out.println("Unfortunately NO Matching numbers");
        }

    }
    public static int compareArr(int[] arr, int []brr){

        int counter=0;
     for(int i=0; i<arr.length; i++){

         for (int j=0; j< brr.length; j++){

             if (arr[i] == brr[j]) {

                counter++;
             }

         }
     }
       return counter;

    }





}