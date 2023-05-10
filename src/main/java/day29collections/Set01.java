package day29collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set01 {
    /*

    Set is used to store "unique data" like email addresses, ids.
    There are 3 Sets
                  i)HashSet:
                    "Hash"ing is a technique to create unique code for data.
                    HashSet puts the elements randomly, it does not use any indexing.
                    HashSet is so fast because it does not spend time to order the elements.
                    You can store just a single "null" in HashSet.

                 ii)LinkedHashSet:
                  puts the elements in insertion order
                  is slower than HashSet because it spends time in ordering elements

                iii)TreeSet:
                    TreeSet puts the elements in natural order
                    TreeSet is too slow it needs time to put the elements in natural order
                    TreeSet does not accept "null" values as an element

     */

    public static void main(String[] args) {



        LinkedHashSet<Integer> lhs= new LinkedHashSet<>();

        lhs.add(12);
        lhs.add(5);
        lhs.add(19);
        lhs.add(15);
        lhs.add(6);
        lhs.add(12);
        lhs.add(23);
        lhs.add(null);
        System.out.println(lhs);//[12, 5, 19, 15, 6, 23, null]

       // lhs.retainAll()
        LinkedHashSet<Integer> mhs= new LinkedHashSet<>();

        mhs.add(43);
        mhs.add(19);
        mhs.add(6);
        mhs.add(50);
        mhs.add(23);
        mhs.add(65);

        //[12, 5, 19, 15, 6, 23, null]

        lhs.retainAll(mhs);
        System.out.println(lhs);//[19, 6, 23]
        System.out.println(mhs);//[43, 19, 6, 50, 23, 65]

        long t1=System.nanoTime();
        HashSet<String> hs= new HashSet<>();

        hs.add("Germany");
        hs.add("Albania");
        hs.add("Belgium");
        hs.add("USA");
        hs.add("UK");
        hs.add("Albania");//When you add a data repeatedly, Java does not give error, but it accepts just one of them
        hs.add("Turkey");
        hs.add(null);
        System.out.println(hs);//[USA, Turkey, Belgium, UK, Germany, Albania]

        long t2=System.nanoTime();

        //TreeSet
        TreeSet<String> ts=new TreeSet<>();

        ts.add("Germany");
        ts.add("Albania");
        ts.add("Belgium");
        ts.add("USA");
        hs.add("UK");
        ts.add("Albania");
        ts.add("Turkey");

        System.out.println(ts);
        /*
        If you need to store "unique elements" in natural order do not use TeeSet to add elements because it is too slow.
        Use HashSet to add the elements then convert to HashSet to TreeSet.
        So you will have "unique elements" in "natural order".
         */

        long t3=System.nanoTime();
        HashSet<String> hs2= new HashSet<>();

        hs2.add("Germany");
        hs2.add("Albania");
        hs2.add("Belgium");
        hs2.add("USA");
        hs2.add("UK");
        hs2.add("Albania");
        hs2.add("Turkey");
        System.out.println(hs2);

        TreeSet<String> ts2= new TreeSet<>(hs2);
        long t4= System.nanoTime();

        System.out.println(ts2);
        System.out.println(t2-t1);//57700

        System.out.println(t4-t3);//












    }


}
