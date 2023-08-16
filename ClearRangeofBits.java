import java.util.*;
public class ClearRangeofBits{
    public static int ClearBits(int n ,int i , int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        return n&bitmask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:-");
        int n= sc.nextInt();
        System.out.print("enter starting index and ending index-->");
        int si = sc.nextInt();
        int ei = sc.nextInt();
        System.out.print("the result after removing bits from index "+si+" to index "+ei+" is "+ClearBits(n, si, ei));
    }
}