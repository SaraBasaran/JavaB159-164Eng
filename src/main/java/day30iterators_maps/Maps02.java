package day30iterators_maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps02 {

    //Example 1: Type code to find the number of occurrences of the words in a sentence
    //           Java, I like Java Java. ==> Java=3, I=1, like=1

    public static void main(String[] args) {

        String sentence= "Java, I like Java Java.";

        System.out.println(sentence);//Java, I like Java Java.

        //Remove the punctuations to make "Java," and "Java" and "Java." same for java logic

        sentence= sentence.replaceAll("\\p{Punct}", "");

        System.out.println(sentence);//Java I like Java Java

        String[] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));//[Java, I, like, Java, Java]



        HashMap<String, Integer> occurenceMap= new HashMap<>();

        for (String w: words){

           Integer numOfOccurences=  occurenceMap.get(w);

           if (numOfOccurences==null){

               occurenceMap.put(w, 1);
           }else{
               occurenceMap.put(w, numOfOccurences+1);
           }



        }

        System.out.println(occurenceMap);//{Java=3, like=1, I=1}


    }




}
