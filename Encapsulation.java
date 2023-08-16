/*
 * encapsulation is defined as the wrapping up 
 * of data and methods under a single unit.
 * It also implements data hiding.
 */
/*
 * FOUR PILLARS OF OOPS:
 * encapsulation
 * inheritance
 * abstraction
 * Polymorphism
 */
//CONSTRUCTORS
/*
 * constructor is a special method which is invoked automatically at the time of object creation
 */
//PROPERTIES OF CONSTRUCTOR:
/*
 * Constructor have the same name as class or structure.
 * Constructors don't have a return type(not even void).
 * Constructors are only called once , at object creation.
 * Memory allocation happens when constructor is called.
 */
public class Encapsulation{
    public static void main(String args[]){
        Student s1 = new Student("swayam",9);
        Swayam s2 = new Swayam();
        System.out.println("the name is "+s1.name);
        System.out.println("the roll no. is "+s1.roll);
    }

}
class Student{
    String name;
    int roll;
    Student(String name , int roll){ // Student is a parameterised constructor
        /*
         * here student() is a constructor
         * even if we dont't create it by ourselves as in the pen case
         * it gets created automatically when we write:-
         * Student s1 = new Student(); in the main function
         */
        /* but when java created a constructor automatically
         * then in that constructor initialisation cannot happen
         * if we want to initialise the constructor then we have to make it by our own.
         */
        this.name = name;
        this.roll = roll;
    }
}
class Swayam{
    //Swayam() is a non parameterised constructor
    Swayam(){
        System.out.println("constructor is called.....");
    }
}