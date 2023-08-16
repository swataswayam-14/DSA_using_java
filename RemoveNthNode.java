//this question is asked in interviews of Amazon, Qualcomm and Flipkart

//if we want to find the nth node from the last then it is same as finding the size-n-1 node from the first

//the loop should run till size-n to find the previous node of the one we want to delete
//now the prev.next would point to the next node of the target(delete) node
import java.util.*;
public class RemoveNthNode{
    public static class Node{
        
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void deleteNthFromEnd(int n){
        //calculate size
        int sz=o;
        Node temp = head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        //case where the index passed is sz:- so it will be sz th element from the last that is the first Node of the Linked list or head
        if(n==sz){//corner case
            head = head.next;//removeFirst
            //just changing the pointing address of the head node
            return;
        }
        //sz-n
        int i=1;
        int iToFInd = sz-n;
        Node prev = head;
        while(i<iToFind){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
}

