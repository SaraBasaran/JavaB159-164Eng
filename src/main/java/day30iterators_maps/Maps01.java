package day30iterators_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {

    /*
    1)Maps are used to store multiple data
    2)Maps use "Key=Value" structure to store multiple
    3)"key"s are unique, "value"s can be repeated
    4)Every map element is called "Entry"
    5)All map elements are called "EntrySet"
    6)All map elements are unique because the key part is unique
    7)There are 3 types of Map in Java;
      i)HashMap:
      a)HashMap puts the elements in "random" so it is so fast
      b)HashMap accepts "null" as a "key" for only once
      c)HashMap accepts "null" as a "value" for multiple times
      

      ii)HashTable
      iii)TreeMap

     */
    public static void main(String[] args) {

        HashMap<String, Integer> cp= new HashMap<>();
        
        cp.put("USA", 500);
        cp.put("Germany", 80);
        cp.put("Albania", 5);
        cp.put("Turkey", 85);
        cp.put("Germany", 87);

        System.out.println("cp = " + cp); //= {USA=500, Turkey=85, Germany=80, Albania=5}

        //Example 1: Find the average population of the given countries

        Collection<Integer> values= cp.values();

        System.out.println("values = " + values);// [500, 85, 80, 5]

        double sum=0;

        for (Integer w: values){//values() gives you all "value" s in a map 

            sum+=w;

        }

       double avg=sum/ values.size();

        System.out.println(avg);//167.5

        //Example 2: Print the country names containing "r"

        Set<String> keys= cp.keySet();//keySet() gives you all key's in a map

        for (String w: keys){

            if (w.contains("r")){
                System.out.print(w+ " ");
            }
        }

        //How to get value of a specific key
        
        int populationOfAlbania= cp.get("Albania");
        System.out.println("populationOfAlbania = " + populationOfAlbania);

        //How to check if keys a specific key

        boolean isExist1=cp.containsKey("Belgium");
        System.out.println("isExist1 = " + isExist1);

        //How to check if values have specific value in them
        
        boolean isExist2= cp.containsValue(85);
        System.out.println("isExist2 = " + isExist2);

        //Note: If you use same "key" with a different value with put(), it means you are updating the value
        //      cp.put("Germany", 80); then cp.put("Germany", 87); means you updated 80 to 87 for Java

        //How to update value of a key

        cp.replace("Germany", 99);

        System.out.println(cp);//{USA=500, Turkey=85, Germany=99, Albania=5}
        
        
        cp.replace("Germany", 99, 100);
        System.out.println(cp);//{USA=500, Turkey=85, Germany=100, Albania=5}

        // How to get all entries in a Set

        Set<Map.Entry<String,Integer>> allEntries= cp.entrySet();


        for (Map.Entry<String,Integer> w: allEntries){

            System.out.println(w.getValue()+ " - " + w.getKey());

        }



        











    }


}
