import java.util.*;
public class oddOrEvenBit{
    public static void oddEven(int n){
        int bitMask = 1;
        if((n&bitMask)==0){
            System.out.print("the number is even");
        }else{
            System.out.print("the number is odd");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to check-->");
        int n = sc.nextInt();
        oddEven(n);
    }
}