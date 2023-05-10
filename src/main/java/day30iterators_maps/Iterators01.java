package day30iterators_maps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Iterators01 {

    /*
    1)Iterators do the same with the loops
    2)Loops have the risk of being "infinite loop"
    3)There are 2 types of iterators
       i)Iterator:
         You can just "remove" the elements, it is impossible to "update" or to "add" new elements
         You can use elements from first to the last index. It has one direction.
       ii)ListIterator:
          You can "remove, update, add" elements by using ListIterator.
          You can use elements from the first to the last index or vice-versa It is bi-directional.
     */
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");

        System.out.println("myList = " + myList);//[Tom, Jim, Clara, Angie, Mark]

        Iterator<String> itr= myList.iterator();// [ I Tom, Jim, Clara, Angie, Mark]

        while(itr.hasNext()){ //hasNext() asks the pointer if there is any element after the pointer or not

            itr.next();// next() takes the pointer to the right and returns the element

            itr.remove();//remove() removes the element that is given by next()

        }
        System.out.println(myList);//[]

        //How to use ListIterator

        List<String> yourList = new ArrayList<>();

        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");

        System.out.println(yourList);   //[Tom, Jim, Clara, Angie]

       ListIterator<String> lr= yourList.listIterator();// [  Tom, Jim, Clara, Angie  ]

        while(lr.hasNext()){
            lr.next();
        }

        while (lr.hasPrevious()){
           String el= lr.previous();
           lr.set(el+ "!");

        }
        System.out.println(yourList);

















        
        
        
        
        
    }


}
