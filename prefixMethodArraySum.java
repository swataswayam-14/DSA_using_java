import java.util.*;
public class prefixMethodArraySum{
    public static void PrefixMethod(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0]= arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];

        }
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end =j;
                currSum= start == 0 ? prefix[end]: prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum = currSum;
                }
            }
        }System.out.print("the maximum sum of subarray is "+maxSum);

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
        PrefixMethod(arr);
    }
}//this code have time complexity of n square