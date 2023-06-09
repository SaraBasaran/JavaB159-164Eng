package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Michale");
        names.add("Alex");
        names.add("Alberto");
        names.add("Chris");

        System.out.println(getSquareOfLengthsInListEleDistinctly(names));
        System.out.println();
        printIntegers(3, 11);
        System.out.println();
        printIntegers2(3,11);
        System.out.println();
        System.out.println(getFactorial(10));
        System.out.println(findTheSumOfIntegersBetweenTwoGivenInts(7, 4));
        System.out.println(getTheSumOfDigitsInTheGivenRange(45, 47));


    }

    //Example 1: Create a method takes the square of lengths of Strings, puts them in a list in reverse order distinctly

    public static List<Integer> getSquareOfLengthsInListEleDistinctly(List<String> names){

        return names.
                stream().
                map(String::length).//map(t-> t.length()) can be used well
                distinct().
                map(Utils::getSquare). //map(t-> t*t) can be used well
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());//[49, 25, 16]

    }
    /*
    Normally we use Set for the usage of distinct elements. But "collect(Collectors.toSet())" does not allow you to sort
     the elements, but according to the task we need to sort the elements in reverse order. That is why we preferred not to use
     "collect(Collectors.toSet())" we used collect(Collectors.toList()) with distinct()
     */

    //Example 2: Create a method prints the integers from 3 to 11
    //1 way: by using loop
    public static void printIntegers(int start, int end){

        for (int i=start; i<=end; i++){
            System.out.print(i + " ");
        }
    }

    public static void printIntegers2(int start, int end){
        IntStream.
                rangeClosed(start, end).
                forEach(Utils::printInTheSameLineWithSpace);//    forEach(t-> System.out.print(t + " "));
    }

    //Example 3: Create a method to calculate the factorial of a given number
    //           5! ==> 1*2*3*4*5 = 120        3! ==> 1*2*3 = 6     0! = 1   No factorial for negative integers
    public static int getFactorial(int num){

        if (num==0){
            return 1;
        }else if (num<0){
            System.out.println("No factorial for negative integers");
           return 0;
        }


        return  IntStream.rangeClosed(1, num).reduce(Math::multiplyExact).getAsInt();
    }

    //Example 4: Create a method to find the sum of integers from 4 to 7

    public static int findTheSumOfIntegersBetweenTwoGivenInts(int start, int end){

        if (start>end){
            int temp= start;
            start=end;
           
            end=temp;
        }

      return IntStream.rangeClosed(start, end).reduce(Math::addExact).getAsInt();

    }

    //Example 5: Create a method to find the sum of the digits of integers from 45 to 47
    //           4+5+4+6+4+7=30

    //1 way:
    public static int getTheSumOfDigitsInTheGivenRange(int a, int b){

       return IntStream.rangeClosed(a, b).map(Utils::getSumOfDigits).reduce(Math::addExact).getAsInt();

    }

    //2 way:
    public static int getTheSumOfDigitsInTheGivenRange2(int a, int b){

        return IntStream.rangeClosed(a, b).map(Utils::getSumOfDigits).sum();

    }





}
