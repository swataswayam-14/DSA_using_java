import java.util.*;
public class MaxSum_subarray{
    public static void MaxSum(int arr[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int start = i;
            
            for(int j=i;j<arr.length;j++){
                int end =j;
                
                for(int k=start;k<=end;k++){
                    currsum += arr[k];        
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
                currsum=0;
            }
        }
        System.out.print("the maximum sum array is"+maxsum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter the size of the array:-");
        n= sc.nextInt();
        int [] arr;
        arr = new int[n];
        System.out.println("enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        MaxSum(arr);
    }
}
//this code have the time complexity of n cube