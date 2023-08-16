import java.util.*;
public class TilingProblem{
    /*
     * Given a 2*n board and tiles of size 2*1, count
     * the number of ways to tile the given board using
     * the 2*1 tiles. (A tile can either be placed horizontally or verticaly)
     */
    public static int noOfWays(int n){
        //base case
        if(n==0||n==1){
            return 1;
        }
        //vertical tiles
        int fnm1 = noOfWays(n-1);
        //horizontal tiles
        int fnm2 = noOfWays(n-2);
        //total tiles
        int totTiles = fnm1+fnm2;
        return totTiles;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the width of the floor,the height of the floor is fixed as 2:--");
        int n = sc.nextInt();
        System.out.println("the total no. of ways in filling the floor with (2*1) tiles is "+noOfWays(n));       
    }
}