package miniproject01nt;

import java.util.Scanner;

public class VehicleInsuranceApp {
    /*
        Project: Auto Insurance Payment Calculator
        Vehicle types: car, truck, bus, motorcycle
                      -bus: 18-30 seats or 31 and above seats
       Tariff period: December 2022, June 2022
       1st term: June 2022                      2nd term: December 2022
          cars: 2000                            cars: 2500
          truck: 3000                           truck: 3500
          bus: type1: 4000 type2: 5000          bus: type1: 4500 type2: 5500
          motorcycle: 1500                      motorcycle: 1750
        In case of incorrect entry, the calculation failed warning should be given to the user and the menu should be shown again.
        Give the option of calculation for payment after successfull entrance and calculation process to be able to let user
        see option of calculation once more.
 */
    public static void main(String[] args) {
        startCalculationOfPayment();

    }

    public static void startCalculationOfPayment(){
        boolean isFailed;
        Scanner input= new Scanner(System.in);

        do {

            isFailed=false;
            //show menu and options for terms to the user

            System.out.println("---Vehicle Insurance Payment Calculation---");
            System.out.println("Please choose the term for payment: ");
            System.out.println("1.Term: June 2023");
            System.out.println("2.Term: December 2023");

            int term= input.nextInt();

            //check if the term is chosen in the correct way --> expected -->1 or 2
            //if not give warning to the user and start the calculation process again
            if (term==1 || term==2){

                //Create a vehicle variable
                Vehicle objVehicle=new Vehicle();

                System.out.println("Enter the type of vehicle: ");
                System.out.println("Car, Truck, Bus, Motorcycle");
                objVehicle.type=input.next().toLowerCase();

                objVehicle.payment= objVehicle.countPayment(term);

                //if payment is greater than 0 the calculation is done successfully
                //if payment is less than 0 or equal to 0 the calculation failed and new option to the process again

                int select;
                String termName= term==1 ? "June 2023" : "December 2023";

                if (objVehicle.payment>0){

                    System.out.println("Payment: ");
                    System.out.println("Vehicle type: " + objVehicle.type);
                    System.out.println("Term: "+ termName);
                    System.out.println("Your vehicle related with the given term payment is: " + objVehicle.payment);
                    System.out.println("Press 1 to Restart, Press 0 to Exit: ");
                    select= input.nextInt();

                    if (select==1){
                        isFailed=true;

                    }else {
                        isFailed=false;
                    }

                }else {
                    System.out.println("Payment calculation failed. Please try again.");
                    System.out.println("Press 1 to Restart, Press 0 to Exit: ");
                    select= input.nextInt();

                    if (select==1){

                        isFailed=true;

                    }else {

                        isFailed=false;
                    }
                }





            }else {
                System.out.println("Incorrect data entrance! ");
                isFailed=true;
            }

        }while(isFailed);






    }


}
