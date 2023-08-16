import java.util.*;
public class palindromeString{
    //the time complexity of this code is O(n)
    public static boolean checkPalindrome(String str){
        int n = str.length();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string to check:-");
        String str = sc.nextLine();
        if(checkPalindrome(str)==true){
            System.out.println("the string is palindrome");
        }
        else{
            System.out.println("the string is not palindrome");
        }

    }
}
