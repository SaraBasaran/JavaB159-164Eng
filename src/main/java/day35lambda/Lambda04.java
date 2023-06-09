package day35lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Lambda04 {

    public static void main(String[] args) throws IOException {

        readTextFile();
        System.out.println(checkSpecificWordInAllLines("."));

    }

    //Example 1: Go to LambdaTextFile and print the text in the file on the console
    public static void readTextFile() throws IOException {

        Files.lines(Paths.get("src/main/java/day35lambda/LamdaFile.txt")).forEach(System.out::println);

    }
    //Example 2: Go to LambdaTextFile and check if all lines have "Lambda" word

    public static boolean checkSpecificWordInAllLines(String word) throws IOException {

      return   Files.lines(Paths.get("src/main/java/day35lambda/LamdaFile.txt")).allMatch(t-> t.contains(word));

    }



}
