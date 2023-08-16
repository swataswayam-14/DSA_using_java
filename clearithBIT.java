import java.util.*;
public class clearithBIT{
    public static int clearIthBit(int n , int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n and i, to make the ith bit to 0:-->");
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print("the result after clearing the ith bit to 0 is "+clearIthBit(n, i));
    }
}