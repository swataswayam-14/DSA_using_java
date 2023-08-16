import java.util.*;
public class OpeningClosingPara{
    public static boolean isValid(String str){
        //the time complexity of this algorithm is O(n)
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch=='{')||(ch=='[')||(ch=='(')){//opening parenthesis
                s.push(ch);
            }else{//closing case
                if(s.isEmpty()){
                    return false;
                }
                if((ch=='}'&& s.peek()=='{')||(ch==']'&& s.peek()=='[')||(ch==')'&& s.peek()=='(')){
                    s.pop();
                }else{
                    return false;
                }
        }
    }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
        String str = "{[()]}()";
        System.out.println(isValid(str));
    }
}