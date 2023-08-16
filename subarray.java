import java.util.*;
public class subarray{
    public static void PrintSubarray(int arr[]){
        int totalSubArr=0;
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end = j;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]);
                    
                }totalSubArr++;System.out.println();
            }
        }System.out.println();
        System.out.print("total subarrays : "+totalSubArr);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        PrintSubarray(arr);
    }
}