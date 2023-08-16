import java.util.*;
public class powerOf2{
    public static boolean CheckIfPowerOfTwo(int n){
        if((n&n-1)==0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to check:-");
        int n = sc.nextInt();
        if(CheckIfPowerOfTwo(n)){
            System.out.println("the number is a power of 2");
        }else{
            System.out.print("the number entered is not a power of 2");
        }
    }
}