import java.util.*;//this code takes to inputs from the user and gives the sum from initial to final value
public class addnumfrom{
    public static int numm(int n1,int n2){
        int sum=0;
        int i=n1;
        while(i<=n2){
            sum+=i;
            i++;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter till which you want to find the sum both initial and final-->");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.print("the sum is "+numm(n1,n2));
    }
}