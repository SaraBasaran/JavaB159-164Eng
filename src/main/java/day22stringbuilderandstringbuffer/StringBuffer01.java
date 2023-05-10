package day22stringbuilderandstringbuffer;



public class StringBuffer01 {

    public static void main(String[] args) {


        /*
        1)StringBuffer is a class in Java, it gives us String
        2)StringBuffer is "mutable" like StringBuilder
        3)StringBuffer is "thread-safe" and "synchronized" but StringBuilder is neither "thread-safe" nor "synchronized"
        4)StringBuffer was created in Java5, StringBuilder was created after StringBuffer.
        5) StringBuilder has fewer features than StringBuffer that is why it works faster than the StringBuffer

        If you need to store a String we have 3 options in Java
        i) String Class: It gives you "immutable" Strings
        ii) StringBuilder: It gives you "mutable", "non-thread-safe" , "non-synchronized" Strings
        iii)StringBuffer:  It gives you "mutable", "thread-safe" , "synchronized" Strings

         */

        StringBuffer sbf1= new StringBuffer("Python");
        StringBuffer sbf2= new StringBuffer("python");
        /*
        If the Strings are completely same, compareTo() returns zero
        If the first String value comes after the second string value the result will be positive
        If the String comes before the second string value then the result will be negative
         */

        int r1= sbf1.compareTo(sbf2);

        System.out.println("r1 = " + r1);

        sbf1.setCharAt(2, 'T');
        System.out.println(sbf1);//PyThon

        CharSequence r2= sbf1.subSequence(1,4);
        System.out.println("r2 = " + r2);//yTh
        


        

    }
}
