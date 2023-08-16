//implementation of stack using Linked List
import java.util.*;
public class StackInLinkedList{
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }
        //push 
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                //if the linked list is empty then the head becomes the newNode 
                head = newNode;
                return;
            }
            newNode.next = head;//this line of code stores the next of newNode as the head of the linkedlist
            head = newNode;//this line of code makes the head of the linked list as of the newNode
            //here we replace the old head with the new head
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int val = head.data;
            head = head.next;
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(3);
        s.push(5);

        while(!s.isEmpty()){
            //this loop runs till the stack becomes empty
            System.out.println(s.peek());
            s.pop();
        }
    }
}