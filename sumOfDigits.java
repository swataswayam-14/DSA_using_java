import java.util.*;
public class sumOfDigits{
    public static int sum(int n){
        int ld;
        int sum=0;

        while(n!=0){
            ld = n%10;
            sum+=ld;
            n/=10;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number-->");
        int n = sc.nextInt();
        System.out.println("the sum of the digits of the number you have entered is "+sum(n));
    }
}