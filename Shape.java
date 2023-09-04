abstract class Shape{
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle");
    }
}
class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle");}
}
//In real scenario, method is called by programmer or user
class TestAbstraction1{
    public static void main(String args[]){
        Shape s=new Rectangle();//In a real scenario, object is provided through method, e.g., getShape() method
        s.draw();
    }
}

/*
drawing rectangle


In this example, Shape is the abstract class, and its implementation is provided by the Rectangle and Circle classes.
Mostly, we don't know about the implementation class (which is hidden to the end user),
and an object of the implementation class is provided by the factory method.

A factory method is a method that returns the instance of the class. We will learn about the factory method later.

In this example, if you create the instance of Rectangle class, draw() method of Rectangle class will be invoked.
 */
