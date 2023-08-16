//assignment in java happens from right to left .:-NOTE
import java.util.*;
public class AddInLinkedList{
    //add first
    //step 1 is to create a new node
    //step 2 is that the next of the new node should point to the Head node
    //that is :- new node's next = head
    //step 3:- head = new Node
    //add last

    //changing the head variable, the address stored in the next variable doesn't change
    //Next always point to that object always
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
        //size of a linked list:- number of nodes
        //once we add a node then will make the size++
    public static int size;

    public void addFirst(int data){
        //step 1:- create new node
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        //step 2:-newNode next = head
        newNode.next=head;//link
        //step 3:- head=newNode
        head = newNode;
    }
    //remove from a linked list
    //can be done in two ways:-remove first or remove last
    //we will make the head to the next node in addFirst method and automatically the garbage collector deletes the previous or the first node.
    public int removeFirst(){
        //special cases:-
        if(size==0){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
            
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("the linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        //to find the previous node of the node we want to delete we have to iterate a loop and we will get the prev at i=size-2
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }
        int val=prev.next.data;// or we can write tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //this question is asked in interviews of Amazon, Qualcomm and Flipkart

//if we want to find the nth node from the last then it is same as finding the size-n-1 node from the first

//the loop should run till size-n to find the previous node of the one we want to delete
//now the prev.next would point to the next node of the target(delete) node
    public static void deleteNthFromEnd(int n){
        //calculate size
        int sz=0;
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
        while(i<iToFInd){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }
    //check if a linked list is Palindrome or not
    //learning outcome from this question is:-
    //-->slow-fast concept
    //-->reverse half of linked list

    //methods of solving:-
    /*
    1.storing all the elements of the linked list in an arraylist and check if the arraylist is a palindrome or not
    in the above approach the time and space complexity is O(n)
    2.But the challenge is to solve the problem in time complexity of O(n) and space complexity of O(1)
    
    the process of doing it:-
    1.find midNode
    2.Reverse the 2nd half
    3.check if 1st half(left) = 2nd half(right)
    
     */
    public Node findMid(Node head){//this is a helper function
        //slow-fast approach
        //once the fast pointer reaches the last of the linked list then the slow pointer reaches the half of the linked list.
        //when the linked list have odd elements then the fast pointer reaches just the previous node of the null and slow pointer reaches the mid Node of the Linked List
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow=slow.next;//+1 step
            fast= fast.next.next;//+2 step
        }
        return slow;//slow is the midNode
    }
    public boolean checkPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //step 1:- find mid
        Node midNode = findMid(head);
        //step 2
        //reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next= curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;//right half head
        Node left = head;
        //step 3- check left half and right half
        while(right!=null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right=right.next;
        }
        return true;
    }
    //code of a function to check if a cycle exists in a linked list
    public static boolean isCycle(){
        Node slow=head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;//+1 move
            fast = fast.next.next;//+2 move
            if(slow==fast){
                return true;
            }
        }
        return false;//cycle doesn't exist in the linked list
    }
    public static Node MergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //find mid by slow fast approach
        Node mid = getMid(head);
        //left and right part MS
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(righthead);
        //merge 
        return merge(newLeft,newRight);
    }
    public static Node merge(Node head1 , Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1 != null && head2 != null){
            if(head1.data<=head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        //loops for the left over elements:-
        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return mergeLL;
    }
    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;//this is the mid of the LinkedList
    }

    //zig zag linked list 
    /*
     * steps of solving the question:-
    1.find mid node(mid = 1st half last node)
    2.2nd half reverse:- this will reverse the second half linked list:-
    in this approach we use 3 variables and perform 4 steps
    3.Alternate merging 
     */
    public static void ZigZagLinkedList(){
        // find mid 
        Node fast = head.next;
        Node slow = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node mid = slow;
        //reverse the 2nd half of the linked list:-
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;//this step is my doubt
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL, nextR;
        //alternate merge:- zig-zag merge
        while(left!=null && right!=null ){
            nextL = left.next;//this step stores the next node of left in nextL (a dummy node)
            left.next = right;//this step is used to point the next node of left to the right head
            nextR = right.next;//this step stores the next node of right in a dummy node nextR
            right.next = nextL;//this step would point the next node of right to nextL which is the next node of the left.
            
            ///now the next step is to update the nodes
            left = nextL;//now the head of the left will start from the next node of the left
            //similarly with the right node
            right = nextR;

        }
    }
    public void addLast(int data){
        //creation of a new node
        Node newNode = new Node(data);
        size++;
        //special case:-
        if(head==null){//empty linked list
            //we can equate tail to null also
            head=tail=newNode;
            return;

        }
        
        //the tail of next should point to the node we have created:-
        tail.next=newNode;
        //making the new node as tail
        tail=newNode;
    }
    public void addMiddle(int idx, int data){
        //to find the index where to insert the node n steps are performed. Hence the time complexity of the addMiddle() function is O(n)

        //the adding process takes constant time that is O(1)

        //in arrays and arraylist it is just the opposite. To get the index the time complexity is O(1). But the copying process has the complexity of O(n)
        if(idx==0){
            addFirst(data);
            return;
        }
        size++;
        //creation of a node:-
        Node newNode = new Node(data);
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //i=idx-1; temp-->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
    //Reverse a LinkedList :- classical and a important question ::--Iterative Approach
    public void Reverse(){
        Node prev = null;
        Node curr = tail= head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        head = prev;//As curr is now null... Hence we have to make the head as the prev node.
        //the time complexity of this reverse() function is O(n).
    }
    public static void removeCycle(){
        //detect node
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle = true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point 
        slow = head;
        Node prev = null;//last node
        while(slow!=fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle --> last.next = null
        prev.next = null;
    }
    public void print(){
        //the time complexity this print() function is O(n)
        if(head==null){
            System.out.println("the linked list is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    //search(iterative)
    //Search for a key in a linked list.Return the position where it is found. if not found return -1
    public static int itrSearch(int key){
        //the time complexity of this search function is O(n)
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;//key not found
    }
    //search for a key in a linked list.Return the position where it is found. If not found return -1. Use recursion
    public static int recSearch(Node head, int key){
        if(head==null){
            return -1;

        }
        if(key==head.data){
            return 0;
        }
        int idx = recSearch(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    //the time complexity of this function is O(n) and space complexity is also O(n) as the call stack would puccupy the space.

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        AddInLinkedList ll= new AddInLinkedList();
        System.out.print("Enter 1 to check if a linked list is palindrome or press 2 to perform other operation on the linked list or press 3 to know that if a linked list is cyclic or not by isCycle method or press 4 to perform sorting of the linked list by merge sort or press 5 to see the zig-zag conversion of the linked list:-->");
        int df = sc.nextInt();
        if(df==5){
            ll.addFirst(1);
            ll.addFirst(2);
            ll.addFirst(3);
            ll.addFirst(4);
            ll.addFirst(5);
            System.out.println("the original linked list is:-");
            ll.print();
            System.out.println("after converting the linked list to a zig- zag fashion it is:-");
            ZigZagLinkedList();
            ll.print();
        }
        else if(df==4){
            ll.addFirst(3);
            ll.addFirst(1);
            ll.addFirst(45);
            ll.addFirst(12);
            ll.addFirst(1);
            ll.print();
            ll.head = ll.MergeSort(ll.head);
            ll.print();
//the merge sort function is not giving the correct output
//the time complexity of this merge sort fucntion is nlogn
        }
        if(df==3){
            head = new Node(1);
            Node temp = new Node(2);
            head.next = temp;
            head.next.next = new Node(3);
            head.next.next.next = temp;
            //here the linked list is 
            //1->2->3->2
            //ll.print();-->this prin function will execute infinite cycle as the linked list have a cycle
            System.out.println(isCycle());
            removeCycle();
            ll.print();
        }
        else if(df==2){
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();

        //the time complexity of the addfirst function is O(1)
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMiddle(1, 9);
        ll.print();
        //the time complexity of the addLast function is O(1).  
        System.out.println(ll.size);//the output is 5
        //printing the size of a linked list has the time complexity of O(1):-contant time
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
        System.out.print("enter key to search:-");
        int key = sc.nextInt();
        System.out.println(itrSearch(key));
        System.out.print("enter key to search using recursive method:-");
        int keyy=sc.nextInt();
        System.out.println("the key is found at index "+recSearch(head, keyy));
        System.out.print("enter 1 to reverse the linked list:-");
        int bb=sc.nextInt();
        if(bb==1){
            ll.Reverse();
            ll.print();
        }
        else if(df==1){
        System.out.print("enter the index of the node from the last to delete it:-");
        int add=sc.nextInt();
        deleteNthFromEnd(add);
        ll.print();
        }
    }
    else{
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.print();
        System.out.print(ll.checkPalindrome());
    }

}
}
