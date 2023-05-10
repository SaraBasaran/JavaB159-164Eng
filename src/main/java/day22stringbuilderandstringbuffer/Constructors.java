package day22stringbuilderandstringbuffer;

public class Constructors {

        /*
           1) Constructors are for creating objects from a class
           2) Java puts constructor behind every class as default, it is invisible and called as "default constructor"
           Default constructors do not have any parameters, they are like  public Constructors(){   }
           If you type default constructor manually, Java will ren-move its own default constructor.
           3) If you want you can create your own constructors
           4)Methods have "return types" but Constructors do not have
             Methods can use any name but Constructors must use class name as name.
         */

    public String stdName= "Tom";
    public int stdAge=23;
    public boolean isSuccessful= true;

      //To cretae a constructor i)use access modifier  ii)use class name as constructor name   iii) put the constructor body
    public Constructors(){ //default constructor

    }
      //Constructor with parameters
    public Constructors(String stdName, int stdAge, boolean isSuccessful){
               this.stdName= stdName;
               this.stdAge= stdAge;
               this.isSuccessful= isSuccessful;

    }




}
