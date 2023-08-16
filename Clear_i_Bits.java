
import java.util.*;
public class Clear_i_Bits{
    public static int ClearBits(int n , int i){
        int bitmask = (~0<<i);//~0 is 11111111111..........we have to create a bitmask of 11111000(having ith zeroes and all ones )
        return n & bitmask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n and i-->");
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print("the value after clearing i bits is "+ClearBits(n, i));
    }
}