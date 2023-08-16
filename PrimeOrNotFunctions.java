//check if a number is prime or not
import java.util.*;

public class PrimeOrNotFunctions{
//another logic to check if a number is prime or not
    public static boolean isPrime(int n){
        boolean isPrime=true;
        //corner cases
        if(n==2){
            return true;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static int Primee(int n){
        int i = 2;
        int c=0;
        while(i<n){
            if(n%i==0){
                c++;
            }i++;
        } 
        return c;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number-->");
        int n = sc.nextInt();
        int x=Primee(n);
        if(x>0){
            System.out.println("the number entered is not prime");

        }else{System.out.println("the number entered is prime");}
        System.out.println(isPrime(n));
    }
}
/*
 * for better code optimisation 
 * for(int i=2;i<=n-1;i++){
 *  if(n%i==0){
 *      return false;
 *  }
 * }
 * return true;
 */
//we can write the code like this in isPrime function without using a extra variable 