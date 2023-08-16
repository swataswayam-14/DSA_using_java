import java.util.*;
public class allprimesinrange{
    public static boolean isPrime(int i){
        for(int j =2;j<=Math.sqrt(i);j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
        }
    
    public static void primeInRange(int x , int y){
        while(x<=y){
           if(isPrime(x)==true){
            System.out.println(x);
           } x++;
        }

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("enter the range in which you want to find prime numbers-->");
            int i = sc.nextInt();
            int f = sc.nextInt();
            primeInRange(i,f);
        }
    
    }