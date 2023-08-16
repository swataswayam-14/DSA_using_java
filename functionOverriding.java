/*
 * function overriding or method overriding 
 * is a run-time polymorphism
 * Parent and child classes both contain the 
 * the same function with a different definition
 */
//example class B derived from class A would be having
//a function with same name and but different definition
public class functionOverriding{
    public static void main(String args[]){
        Deer d = new Deer();
        Animal a = new Animal();
        d.eat();
    }
}
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}