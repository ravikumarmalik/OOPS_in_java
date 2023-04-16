public class Oops8 {
    public static void main(String args[]) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is:" + p.salary);
        System.out.println("Bonus of Programmer is:" + p.bonus);
    }
}
    class Employee{
        float salary=40000;
    }
    class Programmer extends Employee{
        int bonus=10000;

    }

    /*
    Programmer salary is:40000.0
Bonus of Programmer is:10000
     */


