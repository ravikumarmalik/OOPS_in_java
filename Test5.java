interface A{
    void a();
    void b();
    void c();
    void d();
}

abstract class B implements A{
    public void c(){System.out.println("I am c");}
}

class M extends B{
    public void a(){System.out.println("I am a");}
    public void b(){System.out.println("I am b");}
    public void d(){System.out.println("I am d");}
}

class Test5{
    public static void main(String args[]){
        A a=new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}

/*

I am a
I am b
I am c
I am d


Another real scenario of abstract class
The abstract class can also be used to provide some implementation of the interface. In such case,
 the end user may not be forced to override all the methods of the interface.


Rule: If you are extending an abstract class that has an abstract method,
you must either provide the implementation of the method or make this class abstract.
 */