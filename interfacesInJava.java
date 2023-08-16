/*
 * class is a blueprint of objects
 * interface is a blueprint of class
 * uses of interfaces:-
 * implementing multiple inheritance (where class C is a hybrid of both the parent classes A and B)
 * to achieve total abstraction
 */
//interface is defined with interface keyword
/*
 * all methods are public, abstract and without implementation
 * Used to achieve total abstraction
 * variables in the interface are final, public and static
 * to inherit interface we write implements
 */
public class interfacesInJava{
    public static void main(String args[]){
        Queen q = new Queen();
        q.moves();
        King k = new King();
        k.moves();
        Rook r = new Rook();
        r.moves();
        Bear b = new Bear();
        b.eatsGrass();
        b.eatsMeat();
    }
}
interface chessPlayer{
    void moves();
    //the function moves() is by default public and abstract
    //we cannot write its implementation inside chessPlayer as we want to implement abstraction
}
class Queen implements chessPlayer{
    //here we have to implement the function moves();
    //we have to write the keyword 'public' else our function will be of default type
    //we want to create the function of same type as chessPlayer has created it
    public void moves(){
        System.out.println("up,down,left,right,diagonal-(in all 4 directions)");
    }
}
class Rook implements chessPlayer{
    public void moves(){
        System.out.println("up, down, left , right");
    }
}
class King implements chessPlayer{
    public void moves(){
        System.out.println("up, down , right , left , diagonal-(by 1 step)");
    }
}
/*
 *for moves we have only created a blue-print that is how a move should be like
 we didn't define it as each chess player has a different move
 the classes of chess player define the moves by itself
 And every class implements the interface so that every property of the interface comes to the class
 */

 // below line of codes illustrates multiple inheritance
interface Herbivore{
    void eatsGrass();
}
interface Carnivore{
    void eatsMeat();
}
class Bear implements Herbivore, Carnivore{
    public void eatsGrass(){
        System.out.print("it eats grass and ");
    }
    public void eatsMeat(){
        System.out.print("meat as well");
    }
}