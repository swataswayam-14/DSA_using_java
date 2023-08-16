/*
one method of reversing a stack is by creating extra stack and then poping the elements from the original stack and then pushing the element to the new stack

* But the above mentioned approach uses extra space hence its space complexity is O(n)

*but we will solve the problem in time complexity of O(n) and space complexity of O(1):- without using an extra space
 */
import java.util.*;
public class ReverseStack{
    public static void pushAtBottom(Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);//this line of code forms the call stack having different values of top on different call levels, hence all the data present in the stack is now in the form of a call stack
        //once the stack becomes empty the if condition becomes true and the data is pushed to the stack hence it goes to the bottom of the stack
        s.push(top);//after the data is pushed to the bottom the s.push(top) will push the elements on the call stack to the stack
    }
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);//recursively calls the function:- this line of code forms the call stack (implicit stack) of the datas of the stack
        pushAtBottom(s,top);//:- after the call stack is formed, the pushAtBottom function inserts the element on the bottom of the stack following the order of the call stack
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        //printStack(s);//3->2->1
        reverse(s);
        printStack(s);//1->2->3
    }
}