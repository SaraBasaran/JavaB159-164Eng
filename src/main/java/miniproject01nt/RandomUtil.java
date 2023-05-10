package miniproject01nt;

import java.util.Random;

public class RandomUtil {
    public static void main(String[] args) {

        //1.way
        Random rand = new Random();
        int upperbound = 30;
        int lowerbound=2;
        int random_integer = rand.nextInt(upperbound-lowerbound) + lowerbound;
        System.out.println(random_integer);
        
        //2.way
        Random r = new Random();
        int fourDigit = 1000 + r.nextInt(10000);
        System.out.println(fourDigit);
    }
}
