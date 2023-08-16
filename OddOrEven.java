import java.util.*;
public class OddOrEven{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number :---");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println("the number entered is even");
        }else{
            System.out.println("the number entered is odd");
        }
    }
}