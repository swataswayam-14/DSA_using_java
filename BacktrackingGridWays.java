import java.util.*;
public class BacktrackingGridWays{
    public static int GridWays(int n,int m,int i,int j){
        if(i==n||j==m){
            return 0;
        }else if(i==n-1 && j==m-1){
            return 1;
        }
        int w1=GridWays(n, m, i+1, j);
        int w2=GridWays(n, m, i, j+1);
        return w1+w2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the square grid:-");
        int n = sc.nextInt();
        System.out.println("the number of ways is "+GridWays(n,n,0,0));
    }
}
//the time complexity of this code is O(2^(n+m))
//hence it have a exponential time complexity 