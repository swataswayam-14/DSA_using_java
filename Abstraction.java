/*
 * ABSTRACTION :-
 * hiding all the unnecessary details and showing 
 * only the important parts to the user.
 */
//Abstraction in OOPs is implemented in two different ways :
//1.Abstarct classes
//2.Interfaces

//ABSTRACT CLASS:-
//--Cannot create an instance of abstract class
//--can have abstract / non-abstract methods
//--can have constructors

public class Abstraction{
    public static void main(String args[]){
        Mustang ms = new Mustang();
        Horse h = new Horse();
        h.eat();
        h.walk();
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        //Animal a = new Animal();
        //the above commented out line of code throws an error
        //error:- cannot instantiate the type Animal
        //we cannot create objects of abstract classes


        //System.out.println(h.color);// the output is brown
        //explanation :- whenever we create a child class object then its superclass constructor is called
        //hence before horse  , Animal constructor is called
        
    }
}
abstract class Animal{
    String color;
    //here Animal() is a constructor
    //working of the constructor Animal is:-
    //whenever a subclass is getting created it is by default created in brown color till we use the method changeColor()
    Animal(){
        System.out.println("animal constructor is called");
        color = "brown";
    }
    //normal function having an implementation
    void eat(){
        System.out.println("animal eats");
    }
    //abstract method having a idea but no implementation
    abstract void walk();
}
//walk function's implementation depends on the sub-classes 
//example horse and chicken have different implementation of walk() function
//hence the idea given by the class Animal on walk() function is implemented by horse and chicken classes
class Horse extends Animal{
    Horse(){
        System.out.println("horse constructor is called...");
    }
    void ChangeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructor is called...");
    }
}
class Chicken extends Animal{
    void ChangeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}