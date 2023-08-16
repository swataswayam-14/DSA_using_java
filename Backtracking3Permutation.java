import java.util.*;
public class BackTracking3Permutation{
    public static void PermString(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            String NewStr = str.substring(0, i)+str.substring(i+1);
            PermString(NewStr, ans+curr);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to find its all permutation and combination:-");
        String str = sc.nextLine();
        String ans="";
        PermString(str, ans);
    }
}
//the time complexity of this code is O(n*n!)