import java.nio.file.SecureDirectoryStream;
import java.util.*;
public class PowerRecur{
    public static int Power(int x , int n){
        //the time complexity of this code is O(n)
        if(n==0){
            return 1;
        }
        return x*Power(x, n-1);
    }
    public static int OptimisedPower(int x , int n){
        
        if(n==0){
            return 1;
        }
        //int halfSq = OptimisedPower(x, n/2)*OptimisedPower(x, n/2);
        //but still its time complexty is O(n)
        int Hf = OptimisedPower(x, n/2);
        int halfSq = Hf*Hf;
        //as both the recursive calls are same, we can store OptimisedPower(x, n/2) in a variable and make the halfsq variable as the square of the new variable
        //now the time complexity of this code is greatly reduced and it is O(logn)
        if(n%2!=0){
            halfSq*=x;
        }
        return halfSq;
    }
    public static void main(String args[]){
        System.out.println("through bruteforce approach:-"+Power(2,10));
        System.out.println("through optimised approach:-"+OptimisedPower(2, 10));
    }
}
