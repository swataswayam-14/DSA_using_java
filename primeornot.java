import java.util.*;
public class primeornot{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check-->");
        int n = sc.nextInt();
        if(n==2){System.out.println("the number entered is prime");}else{
        boolean isPrime = true;
            
        
        for(int i=2; i<=Math.sqrt(n); i++){//to optimise the code we can keep n to vary from 2 to 
            if(n%i==0){
                isPrime=false;
            }
        }
        if(isPrime==true){
            System.out.println("the entered number is prime");

        }else{
            System.out.println("the entered number is not prime");
        }
    }
    }
}