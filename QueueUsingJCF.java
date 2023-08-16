import java.util.*;
public class QueueUsingJCF{
    //Queue is a interface hence it cannot have an object of its own
    public static void main(String args[]){
        //Queue<Integer> q = new LinkedList<>();
        Queue<Integer>q = new ArrayDeque<>();
        //queue in java can be implemented in two ways:- Linkedlist and ArrayDeque
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
//for all three operations the time complexity is O(1)