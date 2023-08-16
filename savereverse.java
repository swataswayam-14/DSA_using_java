import java.util.*;
public class savereverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a no. of which you want to store the reverse-->");
        int n = sc.nextInt();
        int rev = 0;
        while(n!=0){
            int ld = n%10;
            rev = (rev*10)+ld;
            n/=10;
        }System.out.println("the reversed no. is "+rev);
        int reverse = rev;
    }
}