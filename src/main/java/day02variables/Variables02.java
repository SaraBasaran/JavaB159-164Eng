package day02variables;

public class Variables02 {


    //Primitive data types: They can be created by Java ONLY.
    //Non-Primitive data types: They can be created by Java like String, Arrays, Scanner,...
    //                          They can be created by developers as well. Like Variable01, Variables02, etc.
    //  So the Non-Primitive data types are infinitely many.

    //String data type is used to store multiple characters.
    //We should use double quotes to store the value.
    public String nameOfStd= "Tom Hanks";

    //What is the difference between Primitive data types and Non-Primitive data types?
    /*
    1) Primitive data types created by Java, developers can not create Primitive data types.
    but Non-Primitive data types can be created both by Java and developers

    2) Primitive data type names start with lower-case and Non-Primitive data types start with upper-cases.
    3) Non-Primitive data types are infinitely many whereas Primitive data types are 8 only.
    4) Primitive-data types are stored in "stack memory" and Non-Primitive data types are stored in "Heap Memory"
    5) Note: "Stack Memory" stores i) Primitive data type objects      ii) addresses (references) of non-primitive data type objects
             "Heap Memory" stores Non-Primitive data type objects

    6) Non-Primitive data type objects have methods together with the value but primitive data type objects have just
     values they do not have any actions/methods with them.

     */

    //Primitive
    public int num= 45;


    //Non-Primitive
    public String city= "Miami";

    //"main method" works first in an application, like the engine of the car
    //Every application needs a main method, if you donot have a main method application cannot run.

    //How to create the main method?

    public static void main(String [] args){

        String countryName= "Germany";

        System.out.println(countryName.toUpperCase());

        int num2= 45;


    }




}
