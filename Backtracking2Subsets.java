import java.util.*;
public class Backtracking2Subsets{
    public static void PrintSubsets(String org,String ans,int i){
        //base case
        if(i==org.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        
        //recursion
        //yes choice
        PrintSubsets(org, ans+org.charAt(i), i+1);
        //no choice
        PrintSubsets(org, ans, i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to find its subsets:-");
        String org;
        String ans="";
        org = sc.nextLine();
        PrintSubsets(org,ans , 0);
    }
}
/*
 * the time complexity of this code is O(n*2^n)
 * the space complexity of this code is O(n)
 * the homework problem is solve it using String Builder( you just have to add an extra step that is to delete the character)
 */