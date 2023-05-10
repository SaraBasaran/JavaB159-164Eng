package day19arraylistsandvarargs;

public class Varargs01 {
    public static void main(String[] args) {

        System.out.println(add(3)); //-->arguments

        System.out.println(add(3, 5));
        System.out.println(add(15, 21, 100, 7000, 123, 75, 275));

    }

//    public static int add(int a, int b){ // parameters
//
//      return a+b;
//
//    }
//    public static int add(int a, int b, int c){ // parameters
//
//        return a+b+c;
//
//    }
    public static int add(int ... v){ // parameters


        int sum=0;
        for (int w: v){
            sum= sum+w;
        }

        return sum;
    }
    //1)Putting a parameter after varargs is a mistake.
    //2)Putting a parameter before varargs is okay.
    //3)Putting multiple varargs as parameter is a mistake.
    //Note: Varargs must be used just once at the end.
    //Note: Containers used in method parenthesis are called "Parameters"
    //      Actual data used in method parenthesis are called "Argument"




}
