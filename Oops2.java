public class Oops2 {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount();
        myAccount.userName="ravi";
        System.out.println(myAccount.userName);//ravi


      myAccount.setPassword("eryggcvbnmu");
       System.out.println(myAccount.getPassword());

        

/*
        myAccount.password="rtyui";
        System.out.println(b1.password);
error occurring because of password
defined as private which is not accessed from the outside the classes and packages

 */


    }
}
class BankAccount{
     String userName;
     private String password;

     String getPassword(){
         return this.password;
     }
     //but you can use like
     void setPassword(String pwd){
        this.password=pwd;
    }
}




/*
Access modifiers:-
    1.public:-access from anywhere.(inside or outside)
    2.private:-access only within a class.not outside
    3.protected:-access from the within classes,packages and outside packages by subclass only
    4.default:-access only within classes and packages.
 */
