package day28interfacecollections;

/*
   1)Java does not support "multiple inheritance" for classes but if you put all
   common functionalities into a single "parent class" the parent class will be so huge
   which we do not want it because "atomic structure" is recommended in coding.
   2)To be able to use "multiple inheritance"  in Java, Java created "interface"
   structure.You can make multiple interfaces parent of a class so for interfaces
   "multiple inheritance" is supported by Java
   3)Interface is an "interface".Interface is not a class
   4)Methods in an interface
     i)All methods in an interface are "abstract"
     ii)i)All methods in an interface are "public"
     iii)All methods must be overridden by the concrete child classes

     5) Interfaces have common and mandatory functionalities
     6) Interfaces are the "to-do- list"

     7) Body parts of methods can create issue for child classes in
      multiple inheritance but we donot have any concrete methods in interfaces
      that is why we donot have any confusion for child classes

     8)Variables in an interface
       i)All variables are "final" in an interface
       i)All variables are "public" in an interface
       i)All variables are "static" in an interface

    9)interfaces have abstract methods which are uncompleted codes that is why
    Java does not let you create objects from an interface
    Note: Interfaces do not have "constructors"
   10) You can use methods with the same name in parent interfaces, but return types
   of the methods must be same as well
   11)Normally we cannot put method with body in an interface but by using 2 keywords
   we can create method with body in an interface
   i)default ==> it is not mandatory to override
             ==> To use default methods we should create objects from concrete child classes
   ii)static ==> to use static methods no need to create object, use interface name only

  12) Class ==> Class child of another Class use extends
      interface==> interface child of another interface use extends
      Class ==> Class child of interface use implements
      interface ==> from class to interface parent-child relationship!!!Not Possible


 */

public class Honda implements Engine, Brake, AC {
   int volume;
    @Override
    public void run() {
        System.out.println("Honda engine runs well");
    }

    @Override
    public int weight() {
        return 2000;
    }

    @Override
    public int price() {
        return 500;

    }

    @Override
    public boolean isKillingBacteria() {
        return false;
    }
}



