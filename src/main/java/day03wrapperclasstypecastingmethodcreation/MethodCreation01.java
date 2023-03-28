package day03wrapperclasstypecastingmethodcreation;

public class MethodCreation01 {

    public static void main(String[] args) {

        System.out.println(add(3, 5));//8
        System.out.println(add(10, 20));//30

        System.out.println(multiply(5, 7, 10));//350
        System.out.println(getPerimeterOfRectangle(4, 5.6));
        System.out.println(getSurfaceAreaOfARectangularPrism(-2, 3.5, 5));//69.0
        printNameWithExclamationMark("Tom");

        //once you assign the values for the given parameters in the method parenthesis these are called "arguments"

    }
    public static int add(int a, int b){
      return a+b;
    }

    //Example 1: Create a method multiplies 3 integers
    public static int multiply(int num1, int num2, int num3){

       return num1*num2*num3;
    }

    //Example 2: Create a method that calculates the perimeter of a rectangle

    public static double getPerimeterOfRectangle(double edgeA, double edgeB){

        return 2*edgeA + 2*edgeB;
    }

    //Example 3: Create a method that calculates the surface area of a rectangular prism.

    public static double getSurfaceAreaOfARectangularPrism(double a, double b, double c){

        return 2*b*c + 2*a*c + 2*a*b;

    }

    //Example 4: Create a method that prints the given name on the console with a "!" at the end
    public static void printNameWithExclamationMark(String name){

        System.out.println(name + "!");

    }















}
