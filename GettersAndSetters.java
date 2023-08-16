import java.util.*;

public class GettersAndSetters {
    public static void main(String[] args) {
        Pen p = new Pen(); // created a pen object p
        p.setColor("blue");
        p.setTip(6);
        System.out.println("The color of the pen is " + p.getColor());
        System.out.println("The tip size of the pen is " + p.getTip());
    }
}
//Get :- to return the value
//Set :- to modify the value
//this :- this keyword is used to refer to the current object

class Pen {
    private String color;
    private int tip;

    // Getter methods
    public String getColor() {
        return color;
    }

    public int getTip() {
        return tip;
    }

    // Setter methods
    public void setColor(String color) {
        this.color = color;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }
}