import java.util.*;

public class DoublyLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public Node head;
    public Node tail;
    public int size; // the size of the linked list

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head; // this line of code will point the next node of the node that we want to add to the head of the original linked list
        head.prev = newNode; // previously the prev of the head pointed to null. But after this line of code, the prev of head will point to the head of the newNode
        head = newNode; // now we will set the head of the doubly linked list, and now the head of the linked list is the newNode
    }

    // printing the linked list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // function for removeFirst function
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE; // indicates not a valid index

        }
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        // deleting in such a way that there would be no link of the node with the linked list. Hence we are removing both the next and prev link
        int val = head.data;
        head = head.next;
        head.prev = null; // if size == 1 then this line of code will show an error
        size--;
        return val; // val is the data that is deleted
    }
    //reverse a doubly linkedlist
    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;//extra step for a doubly linked list
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    //circular linked list:- reading material

    public static void main(String args[]) {
        DoublyLL dll = new DoublyLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println(dll.size);
        dll.removeFirst();
        dll.print();
        dll.reverse();
        dll.print();
    }
}