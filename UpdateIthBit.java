import java.util.*;
public class UpdateIthBit{
    public static int updateIthPos(int n, int i, int x){
        if(x==0){
            int bitmask = ~(1<<i);
            return (n & bitmask);
        }
        else if(x==1){
            int bitmask = 1<<i;
            return (n | bitmask);
        }
        return 0;
    }
    //if in the question it is instructed to first perform clear bit operation and then find the bitmask and then return
    public static int Update2(int n, int i, int x){
        int bitmask = ~(1<<i);
        n = n & bitmask;
        int newbit = x<<i;
        return (n | newbit);
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n , ith bit and update key");
        int n = sc.nextInt();
        int i = sc.nextInt();
        int x = sc.nextInt();
        System.out.println("the final result after updating the "+i+"th bit of "+n+" by " +x+ " is "+updateIthPos(n, i, x));
        System.out.print(Update2(n, i, x));
    }
}