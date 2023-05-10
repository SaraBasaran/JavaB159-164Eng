package day23constructorsaccessmodifiers;

public class Teacher {

    public static int counter=0;//number of teachers starting to work

    public int salary= 25000;

    public Teacher(int salary) {
        this.salary = salary;
        this.salary++;
        counter++;
    }
}
