package day28interfacecollections;

import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        /*
        In Arraylist we have all elements with indexes.
        When you use ArrayList removing or adding elements makes the other elements
        re-indexed. This is not good practice because reindexing elements means too much work for Java.
        As a result ArrayList is not successful in removing and adding elements.

        That is why Java created a structure called "LinkedList".

        When you use LinkedList to remove or add elements it will
        change the pointer, it will not need to do reindexing for all other elements.
         As a result LinkedList is not successful in removing and adding elements.

         3)Search Operations are so easy in ArrayLists because every element has index like an address
         4)LinkedList is not successful in Search Operations because LinkedList does not use indexes which means
         elements do not have addresses but pointer for the following element/data


         */
        //How to create LinkedList

        LinkedList<Character> m= new LinkedList<>();

        //How to add "node"s in a LinkedList
        m.add('A');
        m.add(0, 'H');
        m.addFirst('K');
        m.addLast('R');


        System.out.println(m);

        LinkedList<Character> n=new LinkedList<>();

        n.add('s');
        n.add('b');
        n.add('z');

        m.addAll(n);
        m.addAll(2, n);

        System.out.println(m);//[K, H, A, R, s, b, z]

        //Retrieves and removes the head (first element) of this list.
        //Returns:the head of this list
        //Throws:NoSuchElementException – if this list is empty
        System.out.println(m.remove());//K
        System.out.println(m);//[H, s, b, z, A, R, s, b, z]

        System.out.println(m.remove((Character) 'R'));//true
        System.out.println(m);

        System.out.println(m.remove((Character) 'X'));//false
        System.out.println(m);//[H, s, b, z, A, s, b, z]

        m.remove(4);
        System.out.println(m);//[H, s, b, z, s, b, z]

        System.out.println(m.removeFirstOccurrence('s'));
        System.out.println(m);

        System.out.println(m.removeLastOccurrence('z'));//true

        System.out.println(m);//[H, b, z, s, b]

        //Removes and returns the first element from this list.
        //Returns:the first element from this list
        //Throws:NoSuchElementException – if this list is empty

        m.removeFirst();
        System.out.println(m);

        LinkedList<Integer> r=new LinkedList<>();

        r.add(12);
        r.add(5);
        r.add(14);
        r.add(12);
        r.add(1);

        System.out.println(r);

        //pop()
        //removes and returns the first element of this list.
        //This method is equivalent to removeFirst().
        //Returns:the element at the front of this list (which is the top of the stack represented by this list)
        //Throws:NoSuchElementException – if this list is empty
        //As a result removeFirst(), remove(), pop() do the same functionality

        System.out.println(r.pop());
        //Retrieves, but does not remove, the head (first element) of this list.
        //Returns:the head of this list
        //Throws:NoSuchElementException – if this list is empty
        r.element();

        //Retrieves and removes the head (first element) of this list.
        //Retrieves and removes the head (first element) of this list.
        //Returns:the head of this list, or null if this list is empty
        r.poll();


        //peek()
        //Retrieves, but does not remove, the head (first element) of this list.
        //Returns:the head of this list, or null if this list is empty
        r.peek();








    }


}
