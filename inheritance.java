/*
 * inheritance is when properties and methods of 
 * base class are passed to a derived class
 */
public class inheritance{
    public static void main(String args[]){
        Dianosaurs d = new Dianosaurs();
        Fish shark = new Fish();
        Bird bd = new Bird();
        Dog tom = new Dog();
        System.out.println("the following properties are of dog inerited from mammals which is inherited from animals");
        tom.breed = "labrador";
        tom.breathe();
        tom.eat();
        tom.legs = 4;
        System.out.println("the below property is of fish derived from animals class");
        shark.eat(); 
        System.out.println("the following properties are of bird inherited from animals");
        bd.fly();
        bd.eat();
        bd.breathe();
        System.out.println("the below property are of dinosaurs class derived from animals class ");
        d.carni();

        //for fish we can call the properties and methods of animals as fish is a derived class of animals
    }
}
//base class
class Animals{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breaths");
    }
}
//derived class or subclass
class Fish extends Animals{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
//below lines of code shows multi-level inheritance
class Mammal extends Animals{
    int legs;
}
class Dog extends Mammal{
    String breed;
}
//below line of code shows hierarchial inheritance:-
class Bird extends Animals{
    void fly(){
        System.out.println("fly");
    }
}
class Dianosaurs extends Animals{
    void carni(){
        System.out.println("very dangerous");
    }
}
/*
 * Types of inheritance:-
 * Single level inheritance (base class->derived class)
 * Multi-level inheritance (base class->derived class->derived class)
 * Hierarchial inheritance (single base class and mulitple derived classes)
 * Hybrid inheritance (mix or combination of all the inheritances )
 */
//multiple inheritance is not present in java whereas it is present in C++
//in multiple inheritance a class takes properties of other two classes. Hence it forms a hybrid class of the other classes
//in JAVA it happens through interfaces but in C++ it directly happens through classes