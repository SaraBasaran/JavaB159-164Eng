package day35lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");
        names.add("Brad");

        printLessThanFiveCharsUpperCase(names);
        System.out.println();
        printDistinctSortedByLengthLowerCase(names);



    }
    //Example 1: Print the elements which have less than 5 characters in upper cases on the console
    public static void printLessThanFiveCharsUpperCase(List<String> names){

        names.
                stream().
                filter(t-> t.length()<5).
                map(String::toUpperCase).
                forEach(Utils::printInTheSameLineWithSpace);

    }
    //Example 2: Print the elements on the console by ordering them according to their lengths in lower cases and un-repeatedly
    public static void printDistinctSortedByLengthLowerCase(List<String> names){

        names.
                stream().
                distinct().
                sorted(Comparator.comparing(String::length)).
                map(String::toLowerCase).forEach(Utils::printInTheSameLineWithSpace);

    }





}
