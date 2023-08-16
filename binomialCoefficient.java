import java.util.*;
public class binomialCoefficient{
    public static int binomial(int n,int r){
        int x=factorial(n);
        int y=factorial(r);
        int s= y*factorial(n-r);
        int Bc=x/s;
        return Bc;
    }
    
     public static int factorial(int n){
        int i =1;
        int fact=1; 
        while(i<=n){
            fact*=i;
            i++;
        }
        return fact;
        }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the n->");
    int n = sc.nextInt();
    System.out.print("enter the r->");
    int r = sc.nextInt();
    int Bc = binomial(n, r);
    System.out.println("the binomial coefficient is "+Bc);
}
}