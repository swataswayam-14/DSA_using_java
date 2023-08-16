import java.util.*;
// a number n can be represented in a maximum of log(n) base 2 or log(n)+1 number of bits
public class CheckSetBits{
    public static int checkBits(int n){
        //the time complexity of this code is O(log(n))
        int count = 0;
        int k = 1;
        while(n!=0){
            if((n & k) ==0){
                count +=0;
            }
            else{
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to check:-");
        int n = sc.nextInt();
        System.out.print("the number of set bits in the number is "+checkBits(n));
    }
}