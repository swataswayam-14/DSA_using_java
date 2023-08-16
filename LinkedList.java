/*
linked list is a linear data structure
single element is called a node
merging all the nodes is a linked list  
a single element of a linked list is a node
A node has two parts:-
1.data
2.next(reference or a pointer which points to the next node)
its a reference variable-->points to an object(node)
The linked list ends when we store a null value

 */
public class LinkedList{
    //this is how a single node is created
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

    public static void main(String args[]){
        LinkedList ll = new LinkedList();
    }
}