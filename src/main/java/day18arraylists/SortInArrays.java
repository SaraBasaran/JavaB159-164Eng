package day18arraylists;

import java.util.Arrays;

public class SortInArrays {
    public static void main(String[] args) {

        char[] arr= {'b', 'e', 'a', 'd'};

        //How to sort the elements in natural order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[a, b, d, e]

        //How to check if a specific element exists in an array or not
        //To check if a specific element exists in an array or not use binarySearch()

        int[] brr= {12, 3, 5, 10, 2};

        //1.Step: sort the array elements
        Arrays.sort(brr);
        System.out.println(Arrays.toString(brr));//[2, 3, 5, 10, 12]

        //2.Step: Use binarySearch()

        int r1= Arrays.binarySearch(brr, 12);//4 -->
        // If the output of the binarySearch() comes with a valid index(from 0 to ...), it means in the array that element exists

        System.out.println(r1);

        int r2= Arrays.binarySearch(brr, 4);//As the element does not exist in the array we receive -3 because if "4" existed in the array it would be in the 3.order

        System.out.println(r2);


    }
}
