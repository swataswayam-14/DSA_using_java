public class OOPS{
    public static void main(String args[]){
       Pen p1 = new Pen(); //Pen() is a contructor
       //the above code creates a pen object p1
       //objects are created in heap
       p1.setColor("blue");
       //p1.setColor("yellow");
       p1.color = "yellow";
       //the program doesn't throws an error 
       //the above line of code directly changes the color property of the object pen
       System.out.println(p1.color);
       p1.setTip(5);
       System.out.print(p1.tip);
       // to access the object's properties or functions we use dot operator
    }
}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy , int chem , int math){
        percentage = (phy+chem+math)/3 ;

    }
    void age(){
        age = age+1;
    }
}