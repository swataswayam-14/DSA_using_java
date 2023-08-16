//stack concepts is also seen recursion 
//that stack is a implicit stack and it is made by computer 
//Explicit stack:- stack designed and implemented by us.
//stack:-object placed one above the other 
//OPERATIONS ON STACK:-
/*
 * PUSH O(1)
 * POP O(1)
 * PEEK O(1)
 */
//stack is also called LIFO (Last In Fast Out) Data Structure
//it means the element that is lastly entered into the stack will come out first
import java.util.ArrayList;
public class Stackk{
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            //this function returns true if stack is empty else returns false
            return list.size() == 0;
        }
        //push
        public static void push(int data){
            list.add(data);
        }
        //pop
        //the data that is deleted is returned by pop function in default implementation
        public static int pop(){
            //corner case :- if the stack is empty
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1); //O(1)
            list.remove(list.size()-1);//O(1)
            return top;
        }
        //peek
        public static int peek(){
//corner case :- if the stack is empty
            if(isEmpty()){
                 return -1;
            }
            return list.get(list.size()-1);
        }
    }
    public static void main(String args[]){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            //this while loop runs untill the the stack is empty and the isEmpty function returns true
            System.out.println(s.peek());
            s.pop();
        }
    }
}