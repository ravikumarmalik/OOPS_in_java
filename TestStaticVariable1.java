//Java Program to demonstrate the use of static variable  
class Student4{
    int rollno;//instance variable
    String name;
    static String college ="ITS";//static variable
    //constructor
    Student4(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display (){
        System.out.println(rollno+" "+name+" "+college);
    }
}
//Test class to show the values of objects  
public class TestStaticVariable1{
    public static void main(String args[]){
        Student4 s1 = new Student4(111,"Karan");
        Student4 s2 = new Student4(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}

/*

111 Karan ITS
222 Aryan ITS

The static keyword in Java is used for memory management mainly.
 We can apply static keyword with variables, methods, blocks and nested classes.
 The static keyword belongs to the class than an instance of the class.

The static can be:

Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class

Suppose there are 500 students in my college,
now all instance data members will get memory each time when the object is created.
All students have its unique rollno and name, so instance data member is good in such case.
Here, "college" refers to the common property of all objects.
If we make it static, this field will get the memory only once.
 */