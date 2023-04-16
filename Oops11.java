public class Oops11 {
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
    }
}


    class Cow{
        void eat(){
            System.out.println("eating...");
        }
    }
    class dogy extends Cow{
        void bark(){
            System.out.println("barking...");
        }
    }
    class Cat extends Cow {
        void meow() {
            System.out.println("meowing...");
        }
    }



/*
meowing...
eating...

Hierarchical Inheritance Example
When two or more classes inherits a single class,
it is known as hierarchical inheritance. In the example given below,
Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.


Why multiple inheritance is not supported in java?
To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes.
If A and B classes have the same method, and you call it from child class object,
there will be ambiguity to call the method of A or B class.

Since compile-time errors are better than runtime errors, Java renders compile-time error
if you inherit 2 classes. So whether you have same method or different, there will be compiled time error.


class A{
void msg(){System.out.println("Hello");}
}
class B{
void msg(){System.out.println("Welcome");}
}
class C extends A,B{//suppose if it were

 public static void main(String args[]){
   C obj=new C();
   obj.msg();//Now which msg() method would be invoked?
}
}


o/p-Compile Time Error
 */