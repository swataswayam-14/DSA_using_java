//SUPER KEYWORD
/*
 * super keyword is used to refer immediate parent class object
 * ->to access parent's properties
 * ->to access parent's functions
 * ->to access parent's constructor
 */
public class SuperKeyword{
    public static void main(String args[]){
        
        Horse h = new Horse();
        //System.out.println(h.color);
        
        
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }

}
class Horse extends Animal{
    Horse(){
        super();
        //super.color ="brown";
        System.out.println("horse constructor is called");
    }
}
//the output should come:
//first
//animal constructor is called
//then
//Horse constructor is called

//but my output is only coming :- Horse constructor is called