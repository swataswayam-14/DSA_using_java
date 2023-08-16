import java.util.*;
public class fastExponent{
    public static int FastExpo(int a , int n){
        //the time complexity of this algorithm is log(n) base 2
        int ans = 1;
        while(n>0){
            if((n&1)!=0){
                ans = ans * a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number and the power to which you will raise the number:-");
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.print("the result is "+FastExpo(a, n));
    }
}