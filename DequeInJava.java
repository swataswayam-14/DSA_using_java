import java.util.*;
public class DequeInJava{
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        //to find the first element:-
        System.out.println("first element:-"+deque.getFirst());
        System.out.println("last element:-"+deque.getLast());
    }
}