//Java Program to demonstrate the use of a static method.
class Students22{
    int rollno;
    String name;
    static String college = "ITS";
    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialize the variable
    Students22(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display values
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to create and display the values of object
public class TestStaticMethod{
    public static void main(String args[]){
        Students22.change();//calling change method
        //creating objects
        Students22 s1 = new Students22(111,"Karan");
        Students22 s2 = new Students22(222,"Aryan");
        Students22 s3 = new Students22(333,"Sonoo");
        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

/*

111 Karan BBDIT
222 Aryan BBDIT
333 Sonoo BBDIT



Java static method
If you apply static keyword with any method, it is known as static method.

A static method belongs to the class rather than the object of a class.
A static method can be invoked without the need for creating an instance of a class.
A static method can access static data member and can change the value of it.
 */