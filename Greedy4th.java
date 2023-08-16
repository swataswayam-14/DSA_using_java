//minimum absolute difference 
//the time complexity for this code is O(nlogn)
import java.util.*;
public class Greedy4th{
    public static void main(String args[]){
        int arr1[] = {4,1,8,7};
        int arr2[] = {2,3,6,5};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int minDiff=0;
        for(int i=0;i<arr1.length;i++){
            minDiff += Math.abs(arr1[i]-arr2[i]);

        }
        System.out.println("the minimum absolute difference = "+minDiff);
    }
}