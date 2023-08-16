import java.util.*;
public class reverseofnum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to reverse it");
        int n = sc.nextInt();
        while(n!=0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n/=10;

        }
        }
    }
