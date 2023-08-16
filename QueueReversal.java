import java.util.*;
public class QueueReversal{
    public static void main(String args[]){
        Queue<Integer>q = new LinkedList<>();
        Stack<Integer>s = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}//the time complexity of this program is O(n)