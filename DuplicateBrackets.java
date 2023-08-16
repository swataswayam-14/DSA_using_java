import java.util.*;
public class DuplicateBrackets{
    public static boolean isDuplicate(String str){
        //the time complexity of this code is O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==')'){//closing condition
                int count = 0;
                while(s.peek()!='('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
            }}else{
                s.push(ch);
            }
    }
    return false;
}
public static void main(String args[]){
    String str = "(";
    System.out.println(isDuplicate(str));
}
}