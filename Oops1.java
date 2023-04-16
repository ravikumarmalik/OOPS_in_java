public class Oops1 {
    public static void main(String[] args) {
        Student s1=new Student();//object created
        s1.setName("ravi kumar");//access student property using (.)operator.
        System.out.println(s1.name);

        s1.setRollN0(678);
        System.out.println(s1.RollN0);

        s1.setProfession("IT ENGINEER");
        System.out.println(s1.profession);
    }
}

class Student{ //class created
    String name;
    int RollN0;
    String profession;

    //setter method to set the value.
    void setName(String newName){
        name=newName;
    }
    void setRollN0(int newRollNo){
        RollN0=newRollNo;
    }
    void setProfession(String newProfession){
        profession=newProfession;
    }
}

/*
output

ravi kumar
678
IT ENGINEER

 */

/*
        create a student object,there are two types of memory in the pc stack and heap
        (all object created in the heap)
        New operator:-
        Basically,New operator is used for create to any object in memory and that object occupy space in the memory.


    Oops-> object oriented programing structure.
    classes:-class is the blueprint and template of the object.
    which is not exist in the real world & can't occupy any memory space.
    class is the group of the similar types of object.
    syntax-
    ex-Class Student{
    }

    Object:-
    Object is the entity(instance) of the class like Student but student name is an instance of student class.
    It is real world entity.
    which has own property and function, and it is exist in the
    real world and occupies space in the memory.

    Method:-Method is a set of code or instruction which perform a particular task.
    It can be used again and again in particular task.
    methods are used for code re-usability and code optimization.
    syntax-
    access-modifier return-type methodName(para){
    }



     */