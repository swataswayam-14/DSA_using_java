import java.util.*;
public class kadanes{
    public static void kadanesAlgo(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms = Math.max(ms,cs);
        }
        System.out.print("the maximum sum of the subarray is "+ms);
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
        //special case if all the elements present in the array are negative
        int c =0;
        for(int i=0;i<arr.length;i++){
            if(0>arr[i]){
                c++;
            }
        }
        if (c==arr.length){
            int x = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(x<arr[i]){
                    x = arr[i];
                }
            }
            System.out.print("the maximum sum of subaray is "+x);
                      
            }else{sss
        
                 kadanesAlgo(arr);
            }
    }
} //its the most optimised program.
