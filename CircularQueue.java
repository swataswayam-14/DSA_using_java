//circular queue :- every function is implemented in the time complexity of O(1)
public class CircularQueue{
    static class Queue{
        static int arr[];
        static int rear;
        static int front;
        static int size;
        Queue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            //add first element
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%size;
            arr[rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            //last element remove
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("the queue is empty");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());//removes 1 and prints 1
        q.add(4);//stores 4 at the first place and rear comes to the first index
        System.out.println(q.remove());//removes 2 and prints it and front updates to the third index
        q.add(5);//rear updates to the second index and 5 is stored in it
        //1 2 3
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    //output is 1 2 3 4 5 
}