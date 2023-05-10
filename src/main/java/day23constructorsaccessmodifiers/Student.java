package day23constructorsaccessmodifiers;

public class Student {

    /*
    Private Access Modifier
    If a class member(variable-method-constructor) is "private it means it cannot be
    visible(accessible) from other classes. So by making a class member "private"
    it means, we are hiding the data inside the class.
     */
    private String stdId= "TH20221904";


    /*
    Default Access Modifier
    To make a class member "default" do not type any access modifier
    If you are şn the same package with the default class member, you can access to it
    If you are in a different package with the default class member you cannot access to it
     */

    int age= 13;

    /*
    Public Access Modifier
    If a class member is "public" you can access to it from the entire project

     */

    public boolean isSuccessful= true;

    /*
    Protected  Access Modifier

    If a class member is protected, you can access to i from the same package and child classes
    from the other packages.
     */

    protected int grade= 11;

    //Note: A class can be just "public" or "default"
    //    We cannot use "private" or "protected" access modifiers for classes.




}
