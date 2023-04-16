public class Oops4 {
    public static void main(String[] args) {
        Students s1=new Students("ravi");
        System.out.println(s1.name);//ravi

        Students s2=new Students(4);
        System.out.println(s2.roll);

        Students s3=new Students();


    }
}

class Students {
    String name;
    int roll;

    Students(String name){ //para-met-constructor
        this.name=name;
    }
    Students(int roll){
        this.roll=roll;
    }

    Students(){
        System.out.println("constructor is called.....!!!!!!!");

    }
}



/*
There are four types of pillar in oops concept.
1.Encapsulation:-Encapsulation means wrapping up of data and method(function) in the single unit.
It is also used in data hiding.


2.Inheritance:-
3.Abstraction:-
4.Polymorphism:-


Constructor:-
constructor is a special type of method which is invoked automatically at the time of object creation.
ex-pen p1=new pen();

constructor have same name as a class or constructor.
ex-pen p1=new pen();
pen();

constructor don't have return type(not even void)
ex-pen p1=new pen();
pen();

constructor are only called once at object creation.
memory allocation happens when constructor is called.


 */
