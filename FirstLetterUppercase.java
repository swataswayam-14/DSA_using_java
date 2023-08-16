import java.util.*;
//question :- For a given string convert each first letter of each word to uppercase
public class FirstLetterUppercase{
    public static void Uppercase(String s){
        //the time complexity of this algorithm is O(n)
        StringBuilder nsb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0));
        nsb.append(ch);
        
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==' ' && i<s.length()-1){
                nsb.append(s.charAt(i));
                i++;
                nsb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                nsb.append(s.charAt(i));
            }
        }
        System.out.println(nsb);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //input 
        System.out.print("enter the string-->");
        StringBuilder sb = new StringBuilder("");
        String s = sb.toString(); 
        s = sc.nextLine();
        Uppercase(s);

    }
}