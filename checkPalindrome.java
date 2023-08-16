// import java.util.*;
// public class checkPalindrome{
//     public static boolean CheckIfPal(int n){
//         int s=0;
//         int x =n;
//         int pal=0;
//         int ld;
//         while(x!=0){
//             x/=10;
//             s++;
            
//         } x=n;
//         while(x!=0){
//             ld=n%10;
//             pal=pal+(ld*(int)Math.pow(10,s));//in the below code it is s-1 i mean why?
//             x/=10;
//             s--;
//         } int upal = pal;
//         if(upal==n){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number to check-->");
//         int n=sc.nextInt();
//         boolean b = CheckIfPal(n);
//         if(b){
//             System.out.println("its a palindrome");
//         }else{
//             System.out.println("its not palindrome");
//         }
//     }
// }
import java.util.*;

public class checkPalindrome {
    public static boolean CheckIfPal(int n) {
        int temp = n; // Store the value of n in a temporary variable
        int s = 0;
        int pal = 0;
        int ld;
        
        while (temp != 0) {
            temp /= 10;
            s++;
        }
        
        temp = n; // Reset the value of n to the original input
        
        while (temp != 0) {
            ld = temp % 10;
            pal = pal + (ld * (int) Math.pow(10, s - 1));
            temp /= 10;
            s--;
        }
        
        if (pal == n) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();
        boolean b = CheckIfPal(n);
        
        if (b) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}