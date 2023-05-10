package day18arraylists;

public class Interview01 {
    public static void main(String[] args) {

        //Example 1: Swap the given two integers
        //           int a = 12; and int b = 5; ==> a = 5 and b = 12

        int a = 12;
        int b = 5;

        System.out.println(a + " " + b);
        //1.way:
        int temp=0;

        //1.step
        temp=a;
        //2.step:
        a=b;

        //3.step:
        b=temp;
        System.out.println(a + " " + b);

        //2.way:

        int c=12;
        int d= 5;
        System.out.println(c+ " "+ d);

        c= c+d;
        d= c-d;
        c= c-d;

        System.out.println(c+ " " +d);

    }

}
