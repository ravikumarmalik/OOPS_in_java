public class Oops9 {
    public static void main(String args[]){
        dog d=new dog();
//        d.bark();
        d.eat();
        d.bark();
    }
}

//single level i heritance
    class Animals{
        void eat(){
            System.out.println("eating...");
        }
    }
    class Dog extends Animals{
        void bark(){
            System.out.println("barking...");}
    }


    /*

    barking...
eating...

     */