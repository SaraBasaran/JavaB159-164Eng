package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda03 {

    /*
    1)We learned so far "Structural Programming" so far, today we will learn "Functional Programming Language"
    2)"Functional Programming" uses Java methods mostly to type codes.

     */
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        printEvenElements(nums);
        System.out.println();
        printEvenEles2(nums);
        System.out.println();
        printSquareOfDistinctOddEles(nums);
        System.out.println();
        System.out.println(findSumOfCubeOfDistinctEles(nums));
        System.out.println(nums);
        System.out.println();
        System.out.println(findMax(nums));
        System.out.println();
        System.out.println(findMax2(nums));
        System.out.println();
        System.out.println(findMin(nums));
        System.out.println(findMin2(nums));
        System.out.println(findMultiplication(nums));
        System.out.println(isLessThanSpecificNumber(nums, 4));
        System.out.println(isNoneNegative(nums));
        System.out.println(isAnyElHasThreeDigits(nums));
    }

    //Example 1: Create a method to print even elements on the console

    //1.way: using "Structural Programming Language"
    public static void printEvenElements(List<Integer> myList){
        for (Integer w: myList){
            if (w%2==0){
                System.out.print(w + " ");
            }//12 14 10 4 12

        }
    }

    //2.way: using "Functional Programming"
    public static void printEvenEles2(List<Integer> myList){

        myList.
                stream().
                filter(Utils::checkToBeEven).
                forEach(Utils::printInTheSameLineWithSpace);//12 14 10 4 12


    }
    //Example 2: Create a method to print square of distinct odd elements

    public static void printSquareOfDistinctOddEles(List<Integer> myList){

        myList.
                stream().
                distinct().
                filter(Utils::checkToBeOdd).
                map(Utils::getSquare).
                forEach(Utils::printInTheSameLineWithSpace);//81 17161 225
    }

    //Example 3: Create a method to find the sum of the cube of the different even elements in a list
    public static int findSumOfCubeOfDistinctEles(List<Integer> myList){

        return   myList.
                stream().
                distinct().
                filter(Utils::checkToBeEven).
                map(t-> t*t*t).
                reduce(Math::addExact).get();//5536

    }

    //Example 4: Create a method to find the element whose value is the maximum

    public static int findMax(List<Integer> myList){

        //1.way:
        //[12, 9, 131, 14, 9, 10, 4, 12, 15]

        return myList.
                stream().
                distinct().
                reduce(Math::max).get();//131

    }
    //2.way:
    public static int findMax2(List<Integer> myList){

        return myList.
                stream().
                distinct().
                sorted(Comparator.reverseOrder()).findFirst().get();


    }

    //Example 5: Create a method to find the element whose value is the minimum

    //1.way:
    public static int findMin(List<Integer> myList){
        //[12, 9, 131, 14, 9, 10, 4, 12, 15]

        return myList.
                stream().
                distinct().
                reduce(Math::min).get();

    }
    public static int findMin2(List<Integer> myList){

        return myList.
                stream().
                distinct().
                sorted().
                findFirst().
                get();

    }
    //Example 6: Create a method to find the multiplication of the elements less than 15 and even
    public static int findMultiplication(List<Integer> myList){

        return myList.
                stream().
                filter(t-> t<15).
                filter(Utils::checkToBeEven).
                reduce(Math::multiplyExact).
                get();

    }
    //Example 7: Create a method to check if all elements are less than 140 or not.

    public static boolean isLessThanSpecificNumber(List<Integer> myList, int num){


        return myList.stream().allMatch(t-> t<num);

    }

    //Example 8: Create a method to check if no element is negative or not.

    public static boolean isNoneNegative(List<Integer> myList){

        return   myList.stream().noneMatch(t-> t<0);
    }
    //Example 9: Create a method to check if any element has 3 digits

    public static boolean isAnyElHasThreeDigits(List<Integer> myList){

        return myList.stream().distinct().anyMatch(t-> t>99 && t<1000);
    }



}





















