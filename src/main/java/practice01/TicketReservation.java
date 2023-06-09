package practice01;


      /*  Project: app that calculates bus ticket price based on distance and conditions
         Distance from User (KM), age and trip type (One Way, Round-Round)
         Get seat number information.

         Take the fare as 1 TL / km per distance. (*2 for round trip)
         First, calculate the total price of the trip and then apply the following rules to the customer according to the conditions;

        Values received from the user must be valid (distance and age are positive numbers, trip type is 1 or 2).
        Otherwise, "You Have Entered Wrong Data!" A warning should be given.

       1- If the person has chosen the "Journey Type" round trip, 20% discount is applied on the ticket price.
       2-Age discount:
        If the person is younger than 12 years old, 50% discount is applied on the ticket price.
        If the person is between the ages of 12-24, a 10% discount is applied on the ticket price.
        If the person is over 65 years old, a 30% discount is applied on the ticket price.
       3-Single Seat Fee:
        If the seat number is 3 or a multiple of 3, the ticket price is increased by 20%.

 */



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketReservation {

    public static void main(String[] args) {
        List<String> seatNo=new ArrayList<>();
        for(int i=1;i<33;i++) {
            seatNo.add(String.valueOf(i));//["1","2","3".....]
        }
       Ticket ticket=new Ticket();
        Bus bus=new Bus("34 IST 78",seatNo);
        start(ticket,bus);

    }
    public static void start(Ticket ticket, Bus bus){
        Scanner scan=new Scanner(System.in);
        int select;
        do {
            System.out.println("Welcome To Ticket Reservation Service");
            System.out.println("Please enter the distance you want to go: ");
            ticket.distance=scan.nextInt();
            System.out.println("Please enter your age: ");
            int age= scan.nextInt();
            System.out.println("Please select the type of travel: ");
            System.out.println("1) One-Direction\n 2) Travel and Return");
            ticket.typeNo=scan.nextInt();
            System.out.println("Please select the seat number: ");
            System.out.println("(Single Seat are %20 more expensive.)");
            System.out.println(bus.seats);
            ticket.seatNo=scan.nextInt();
            bus.seats.remove(String.valueOf(ticket.seatNo));// "3"
            boolean check=ticket.typeNo==1 || ticket.typeNo==2;
            //boolean check=(ticket.typeNo==1 || ticket.typeNo==2) && ticket.distance>0 && age>0;
            if(ticket.distance>0 && age>0 && check){
                ticket.price=getTotal(ticket, age);
                ticket.printBilet(bus);
            }else{
                System.out.println("Incorrect data entrance");
            }
            System.out.println("Press any number to Restart, To Quit Press 0: ");
            select=scan.nextInt();
        }while(select!=0);
        System.out.println("We wish you a good day...");


    }

    public static double getTotal(Ticket ticket,int age){
        double total=0;
        int dist=ticket.distance;
        int seatNo= ticket.seatNo;
        int type= ticket.typeNo;

        switch (type){
            case 1:
                if(seatNo%3==0){
                    total=dist*1.2;
                }else{
                    total=dist*1;
                }
                System.out.println("Tutar:"+total);
                break;
            case 2:
                if(seatNo%3==0){
                    total=dist*2.4;
                }else{
                    total=dist*2;
                }
                System.out.println("Total:"+total);
                total=total*0.8;
                System.out.println("Total with 'Travel and Return discount': "+total);
                break;
        }
        if(age<=12){
            total=total/2;
            System.out.println("Total with age discaount: "+total);
        } else if (age>12 && age<=24) {
            total=total*0.9;
            System.out.println("Total with age discaount: "+total);
        } else if (age>66) {
            total=total*0.7;
            System.out.println("Total with age discaount: "+total);
        }
        return total;
    }








}
