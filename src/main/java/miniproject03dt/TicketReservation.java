package miniproject03dt;

import java.util.Scanner;

public class TicketReservation {
    /*  Project: app that calculates bus ticket price based on distance and conditions
         Distance from User (KM), age and trip type (OneDirection, Going&Returning )
         Get seat number information.

         Take the payment as 1 USD / km per distance. (*2 for Going&Returning trip)
         First, calculate the total price of the trip and then apply the following rules to the customer according to the conditions;
         All buses should have a seat number in total "32".
       Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
        Otherwise, "You Have Entered Wrong Data!" A warning should be given.

       1- If the person has chosen the "Journey Type" Going&Returning trip, 20% discount is applied on the ticket price.
       2-Age discount:
        If the person is younger than 12 years old, 50% discount is applied on the ticket price.
        If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
        If the person is over 65 years old, a 30% discount is applied on the ticket price.
       3-Single Seat Fee:
        If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.

 */
    public static void main(String[] args) {
       //create a bus object
        Bus bus=new Bus("34 IST 34");

        //create a ticket object
        Ticket ticket=new Ticket();

         start(bus, ticket);

    }

    public static void start(Bus bus, Ticket ticket){

        Scanner scan=new Scanner(System.in);
        int select;

       do {

           //take the data from the user
           System.out.println("-----Welcome to Our Ticket Reservation Service-----------");
           System.out.println("Enter the distance as KM: ");
           double distance= scan.nextDouble();
           System.out.println("Enter the Type Of Journey: ");
           System.out.println("1-One Direction \n 2-Round Trip");
           int type= scan.nextInt();

           System.out.println("Enter your age please");
           int age=scan.nextInt();
           System.out.println("Please select the Seat No");
           System.out.println("Single Seats are more expensive 20% than the other seats");
           System.out.println(bus.seats);

           int seat= scan.nextByte();

           //remove the seat chosen by the user
           bus.seats.remove(String.valueOf(seat));

           //check if the user enters valid data
           boolean check= type==1 || type==2;

           if (distance>0 && age>0 && check){
               //calculate the price
               ticket.distance=distance;
               ticket.typeNo=type;
               ticket.seatNo=seat;
               ticket.price=getTotal(ticket, age);
               ticket.printTicket(bus);


           }else{
               System.out.println("You Have Entered Wrong Data!");
           }

           System.out.println("Press Any Number to Restart or Press 0 to Quit");
           select= scan.nextInt();

       }while(select!=0);

        System.out.println("Have a Nice Day...");
    }

    private static double getTotal(Ticket ticket, int age){

        double dist=ticket.distance;
        int type=ticket.typeNo;
        int seat=ticket.seatNo;

        double total=0;

        switch (type){
            case 1:
                if (seat%3==0){
                    total=dist*1.2;
                }else {
                    total=dist*1;
                }
                System.out.println("Total Price:" + total);
                break;

            case 2:
                if (seat%3==0){
                    total=dist*2.4;
                }else {
                    total=dist*2;
                }
                System.out.println("Total Price:" +total);
                total=total*0.8;
                System.out.println("Total Price with discount: " +total);
                break;

        }
        if (age<12){
              total=total*0.5;  //50% discount
            System.out.println("Total Price With Discount:" + total);
        }else if(age>=12 && age<25){
            total=total*0.9;
            System.out.println("Total Price With Discount:" + total);
        }else if (age>65){
            total=total*0.7;
            System.out.println("Total Price With Discount:" + total);
        }

        return total;

    }





}


