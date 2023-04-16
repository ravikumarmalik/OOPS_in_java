public class Oops6 {
    public static void main(String[] args) {
        Student11 a=new Student11();
        a.name="ravi";//jb ye password bhul jate hai tb hme eek new object bnane prte hain jisme ess object pass krte hai
        a.roll=6767;

        Student11 b=new Student11(a);//copy constructor

    }
}
class Student11{
    String name;
    int roll;


    //copy constructor
    Student11(Student11 a){
        this.name=a.name;
        this.roll=a.roll;
    }

    Student11 (){
        System.out.println("this is non parameterized");
    }

    Student11(String name){
        this.name=name;
    }

    Student11(int roll){
        this.roll=roll;
    }
}

/*
in copy constructor copy the data from object1 to object2.
 */
