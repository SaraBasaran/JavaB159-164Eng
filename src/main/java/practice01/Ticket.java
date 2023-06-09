package practice01;

public class Ticket {

    public int distance;

    public int typeNo;

    public double price;

    public int seatNo;

    public void printBilet(Bus bus){
        System.out.println("Total Price: "+price);
        System.out.println("---Ticket Details---");
        System.out.println("Bus Plate: "+bus.numberPlate);
        System.out.println("Distance:" +distance);
        System.out.println("Type Of Travel: "+(typeNo==1 ? "One Direction" : "Travel and Return"));
        System.out.println("Seat no:"+seatNo);
        System.out.println("Have a nice travel...");

    }

}
