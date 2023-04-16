public class Oops7 {
    public static void main(String[] args) {

        fish shark=new fish();
        shark.eat();


    }
}


//base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breath(){
        System.out.println("breaths");
    }

}

//derived class

class fish extends Animal{
    int fins;
     void swim(){
         System.out.println("swims in water");
     }
}


/*

inheritance:
passes the property from base(parent) class to derived(child) class.
inherit the propery using "extend" keyword.

Terms used in Inheritance
Class: A class is a group of objects which have common properties.
It is a template or blueprint from which objects are created.

Sub Class/Child Class:
Subclass is a class which inherits the other class. It is also called a derived class, extended class, or child class.

Super Class/Parent Class:
Superclass is the class from where a subclass inherits the features. It is also called a base class or a parent class.

Reusability:
reusability is a mechanism which facilitates you to reuse the fields and methods of the existing class when you create a new class.
You can use the same fields and methods already defined in the previous class.


 */
