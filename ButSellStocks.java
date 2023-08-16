import java.util.*;
public class ButSellStocks{
    public static int BuySellStocks(int prices[]){
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                int profit = prices[i]-buyPrice;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("enter the size of the array:-");
            n= sc.nextInt();
            int [] prices;
            prices = new int[n];
            System.out.println("enter the elements of the array");
            for(int i=0;i<n;i++){
                prices[i]=sc.nextInt();
            }
            System.out.print("the maximum profit = "+BuySellStocks(prices));
    }
}
//time-complexity of this code is O(n)