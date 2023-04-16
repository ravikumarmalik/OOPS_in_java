public class Oops10 {

    public static void main(String args[]){
        BabyDog d=new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}


//Multilevel Inheritance Example
    class AnimaL{
        void eat(){
            System.out.println("eating...");}
    }
    class dog extends AnimaL{
        void bark(){
            System.out.println("barking...");}
    }
    class BabyDog extends dog {
        void weep(){
            System.out.println("weeping...");}
    }

    /*

    weeping...
barking...
eating..

     */
