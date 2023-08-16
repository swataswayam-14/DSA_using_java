import java.util.*;
public class isEvenReturn{
    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }else{
        return false;}
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number to check-->");
        int x = sc.nextInt();
        System.out.println(isEven(x));
    }
}