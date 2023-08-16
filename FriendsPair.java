/*
 given n friends, each one can remain single or can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up.
 */
import java.util.*;
public class FriendsPair{
    public static int TotalPairs(int n){
        //base case
        if(n==1||n==2){
            return n;
        }
        //single
        int fnm1 = TotalPairs(n-1);
        //pairs 
        int fnm2 = TotalPairs(n-2);
        int PairWays = (n-1)*fnm2;
        int totWays = PairWays+fnm1;
        return totWays;
//the efficiency can be increased by decreasing the number of variables
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter total number of friends in the party:-");
        int n = sc.nextInt();
        System.out.print("the total no. of ways :-"+TotalPairs(n));
    }
}//this question came in goldmansachs interview