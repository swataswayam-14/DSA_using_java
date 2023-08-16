import java.util.*;
public class optimisedPrime{
    public static boolean PRime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check-->");
        int n = sc.nextInt();
        boolean d=PRime(n);
        if(d==true){
            System.out.println("the entered no.is prime");
        }else{
                System.out.println("the entered no.is not prime");
            }
        
        
    }
}
