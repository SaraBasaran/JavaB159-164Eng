package day09nestedternary;

public class Switch03 {
    public static void main(String[] args) {

        //Example 1: Type code to print "Vowel" for a, e,i,o,u and "Not vowel" for other letters

        String ch= "E";

        switch (ch.toLowerCase()){

            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
            System.out.println("Vowel");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                       System.out.println("Not Vowel");
                break;
            default:
                System.out.println("This is not letter...");

        }





    }

}
