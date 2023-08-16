import java.util.*;
public class setIthbit{
    public static int setithBIT(int n , int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n and i-->");
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.print("the value after setting ith bit to 1 is "+setithBIT(n, i));
    }
}