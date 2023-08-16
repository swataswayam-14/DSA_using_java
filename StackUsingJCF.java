import java.util.*;
//in coding contest or in interviews unless it is asked for core implementation of stack we can use Java Collection Framework
public class StackUsingJCF{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(5);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}