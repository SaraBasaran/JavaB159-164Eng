package day23constructorsaccessmodifiers;

public class TeacherRunner {

    public static void main(String[] args) {

        Teacher t1=new Teacher(25000);
        Teacher t2=new Teacher(25000);
        Teacher t3=new Teacher(25000);

        System.out.println(t1.salary);

        System.out.println(t1.counter);

        System.out.println(t2.salary);
        System.out.println(t2.counter);

        System.out.println(t3.salary);
        System.out.println(t3.counter);

    }


}
