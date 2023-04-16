public class Oops3 {
    public static void main(String[] args) {
        Pen p1=new Pen();

        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTips(5);
        System.out.println(p1.getTips());
    }
}

class Pen{
    private String color;
    private int tips;

    //getter-to return the value
    String getColor(){
        return this.color;
    }

    int getTips(){
        return this.tips;
        //this keyword referred to the current object
    }

    //setter-to modify the value
    void setColor(String newColor){
        this.color=newColor;

    }

    void setTips(int newTips){
        this.tips=newTips;
    }
}

/*
getter and setter method.

if any information associate with the object in those case we need to define some method for access those information.
pen-color
pen-tips

getter-to return the value
setter-to modify the value

This keyword - This keyword is used to refer to the current value
 */
