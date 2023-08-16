import java.util.*;
public class ReverseStringStack{
    //reverse a String using a Stack
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr);
        }
        str = result.toString();
        return str;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:-");
        String str = sc.nextLine();
        System.out.print("the reversed string is "+reverseString(str));
    }
}