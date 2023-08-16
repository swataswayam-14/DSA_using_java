/*
 * Polymorphism:-
 * poly : many
 * morphism : forms
 * when we perform a similar task in multiple forms, it is termed as polymorphism
 */
//when we try to do the same thing in multiple forms is termed as polymorphism

//TYPES OF POLYMORPHISM:-
/*
 * Complile time Polymorphism:- Static polymorphism *Method Overloading
 * Run Time Polymorphism:- Dynamic polymorphism *Method Overriding
 */
//METHOD OVERLOADING:-
/*
 * multiple functions with the same name but different parameters
 */
public class Polymorphism{
    public static void main(String args[]){
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1, 4));
        System.out.println(calc.sum(1.5,3.6));
        System.out.println(calc.sum(3,6,1));
    }
}
class Calculator{
    int sum(int a , int b ){
        return a+b;
    }
    int sum(int a , int b , int c ){
        return a+b+c;

    }
    Double sum(Double a , Double b){
        return a+b;
    }
}
//this is known as function overloading
//its type is compile time polymorphism
