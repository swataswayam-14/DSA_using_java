import java.util.*;
public class ithBit{
    public static void checkithBit(int n,int i){
        int bitMask = (1<<i);
        if((n & bitMask) == 0){
            System.out.print("the "+i+"th bit is 0");
        }else{
            System.out.print("the "+i+"th bit is 1");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number and ith position to check what is present at the ith position");
        int n = sc.nextInt();
        int i = sc.nextInt();
        checkithBit(n, i);
    }
}