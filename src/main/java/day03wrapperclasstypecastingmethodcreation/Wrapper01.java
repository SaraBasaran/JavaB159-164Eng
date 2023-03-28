package day03wrapperclasstypecastingmethodcreation;

public class Wrapper01 {

    /*
    1) Java created Wrapper class for every primitive data type by adding methods next to the primitive value.
    2)Wrapper classes are non-primitives that is why they are stored in heap memory
    3) byte  --> Byte
       short --> Short
       int   --> Integer
       long  --> Long
       float  --> Float
       double --> Double
       char    --> Character
       boolean --> Boolean


     */

    public static void main(String[] args) {

        byte age= 12;//primitives can not have any methods with them
        Byte stdAge= 13;//wrapper classes are non-primitives and they can have methods with them

        System.out.println(Byte.MIN_VALUE); //-128
        System.out.println(Byte.MAX_VALUE);//127

        //Find the sum of the min value and max value of short data type

        System.out.println(Short.MIN_VALUE + Short.MAX_VALUE);//-1
        //Find the size of the int and float

        System.out.println(Integer.SIZE);//32
        System.out.println(Float.SIZE);//32

        //Note: MIN_VALUE, MAX_VALUE, SIZE are "constant variables" that contains "constant value"
        //If a variable has a constant value use just wrapper class by typing the initial in uppercase only
        // and use the constant variable in uppercase only and adding "_" between the multple words

        System.out.println(Integer.max(12, 43));//43
        System.out.println(Integer.min(23, 243));

        String num= "234";
        System.out.println(Integer.parseInt("234") +1);//235

        //How to convert "primitive data type" to its "wrapper class" or how to convert "wrapper class" to its "primitive data type

        //Converting "primitive data type" to its wrapper class is called "Auto boxing"

       int num1= 25;

       Integer wrapperNum= num1;


       //Converting "wrapper class" objects to its primitive data type is called "Unboxing"

        Short s= 245;

        short primitiveS= s;



    }





}
