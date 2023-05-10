package day13dowhileloop_arrays;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {

          /*
            Username is "admin", Password is "pwd123"

            Ask user to enter username and password
            User should see "Enter your username and password" message

            If user enters correct credentials, he should get "You are in your account!" message

            Otherwise, he should see "Enter your username and password" message 3 times
            After 3 times he should get "Your account is blocked" message

	    */

        Scanner input= new Scanner(System.in);

        int counter=0;

        do{
            if (counter==3){
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your username and password");
            String userName= input.next();
            String pwd= input.next();

            if (userName.equals("admin") && pwd.equals("pwd123")){
                System.out.println("You are in your account!");
                break;
            }else {
                System.out.println("Your credentials are wrong");
            }

            counter++;

        }while (true);

    }


}
