import java.util.*;
public class Queueee{
    //Queue is a data structure that follows FIFO pattern that is First In First Out
    //An example can be a line of people at the shopping mall at the time of billing.
    //the person who is present on the first position of the line pays the bill first

    //implementation of Queue can be done using array , linked List or Stack
    static class Queue{
        static int arr[];
        static int rear;
        static int size;
        //front is always pointed to the first element of the array that is front = arr[0]
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        //add function
        public static void add(int data){
            if(rear==size-1){
                System.out.println("the Queue is full");
                return;
            }
            rear = rear+1;
            arr[rear]=data;
        }
        //remove function
        public static int remove(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }
            
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];//this line of code removes the pointer that was pointing to the first element of the array. Or we can say that the pointer that was pointing to the first element of the array arr[i] or front is now shifted hence the 1st element automatically gets deleted by the garbage collector of java
            }
            rear--;
            return front;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
//the time complexity in add function is O(1) and in rear function is O(n)