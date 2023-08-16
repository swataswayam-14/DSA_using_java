//print numbers from 1 to n (increasing order)
import java.util.*;
public class IncreasingOrder{
    public static void IncreaseFun(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        IncreaseFun(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number till which you want to print:-");
        int n = sc.nextInt();
        IncreaseFun(n);
    }
}