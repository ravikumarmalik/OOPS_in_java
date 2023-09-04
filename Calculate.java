//Java Program to get the cube of a given number using the static method  

class Calculate{
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String args[]){
        int result=Calculate.cube(5);
        System.out.println(result);
    }
}

/*
125

Why is the Java main method static?
        Ans) It is because the object is not required to call a static method.
 If it were a non-static method, JVM creates an object first then
 call main() method that will lead the problem of extra memory allocation.
 */

