package miniproject03dt;

import java.util.ArrayList;
import java.util.List;

public class Bus {

    //plateNumber, seatNo
    public String plateNumber;

    public List<String> seats=new ArrayList<>();

    public Bus(String plateNumber) {
        this.plateNumber = plateNumber;
        for (int i=1; i<=32; i++){

            this.seats.add(i+"");//String.valueOf(i)

        }
    }
}
