package day03wrapperclasstypecastingmethodcreation;

public class TypeCasting01 {

    public static void main(String[] args) {

        //TypeCasting means "AutoWidening" and "Explicitly Narrowing"
        //AutoWidening
        //byte - short -int - long  -   float  - double
        byte b = 25;
        short s = b; //When you want to store a "smaller data type object" into a "greater data type" container this is called "Auto Widening".
        // Auto-widening is done by Java without any complaints

        long l = 456;
        double d = l;

        //Explicitly Narrowing
        //byte - short -int - long  -   float    - double
        //When you want to store a "a greater data type object" into a "smaller data type" container this is called "Explicitly Narrowing".
        // Explicitly Narrowing is done manually.
        long n = 5673;
        short h = (short) n;
        float f = 12.78f;
        int i = (int) f;
        System.out.println(i);//12


    }


}
