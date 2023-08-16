import java.util.*;
//first have and second half of the queue are interleaved
public class Interleave2HalvesOfQueue{
    public static void Interleave(Queue<Integer>q){
        int size = q.size();
        //first half
        Queue<Integer>FirstHalf = new LinkedList<>();
        for(int i=0;i<size/2;i++){
            FirstHalf.add(q.remove());
        }
        //interleaving the Half Queues
        while(!FirstHalf.isEmpty()){
            q.add(FirstHalf.remove());
            q.add(q.remove());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        Interleave(q);
        //printing the interleaved queue:-
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
}