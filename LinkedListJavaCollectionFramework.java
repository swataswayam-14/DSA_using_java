import java.util.LinkedList;
//in Java Collection FrameWork all functions are optimised and have the best time comlexity and we don't have to implement all the functions from scratch and handel all the corner cases
public class LinkedListJavaCollectionFramework{
    public static void main(String args[]){
        //create
        //we can store only objects in LinkedList as we store in ArrayList , we cannot store primitive data type.
        //int , float , boolean --> Integer , Float , Character 
        LinkedList<Integer>ll= new LinkedList<>();
        //add 
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        //0->1->2
        System.out.println(ll);
        //remove 
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}