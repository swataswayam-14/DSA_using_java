import java.util.*;
public class butterfly{
    public static void fly(int n){
        for(int i=1;i<=n;i++){
            //stars - i times
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2(n-i) times.
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i times
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            //stars - i times
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces - 2(n-i) times.
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i times
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of lines:-");
        int n = sc.nextInt();
        fly(n);
    }
}