public class Oops5 {
    public static void main(String[] args) {
        Java j1=new Java();
        Java j2=new Java("java19");
        System.out.println(j2.name);
        Java j3=new Java(19);
        System.out.println(j3.year);
    }
}

class Java{
    String name;
    int year;

    Java(){
        System.out.println("this is non-parameterized constructor...!!!!");
    }

    Java(String name){//parameterized constructor
        this.name=name;
    }

    Java(int year){//parameterized constructor
        this.year=year;
    }
}

/*
there are three types of constructor:-
1.parameterized constructor:-it has parameter.
2.non-parameterized constructor:-it has no arguments.
3.copy constructor

constructor overloading:-multiple classes with same name but different arguments.
and this is an example of polymorphism.
 */
