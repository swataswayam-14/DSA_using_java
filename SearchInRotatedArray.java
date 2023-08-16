/*
 input:sorted, rotated array with distinct numbers(in ascending order) It is rotated at a pivot point. Find the index of given element
 */
import java.util.*;
public class SearchInRotatedArray{
    public static int search(int arr[],int si,int ei, int target){
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        //mid on L1
        if(arr[si]<=arr[mid]){
            //case a:-left
            if(arr[si]<=target && target<=arr[mid]){
                return search(arr, si, mid-1, target);
                //case b :right
            }else{
                return search(arr, mid+1, ei, target);
            }
        }
        //mid on l2
        else{
            //case c: right
            if(arr[mid]<=target && target <=arr[ei]){
                return search(arr, mid+1, ei, target);
            }else{
            //case d:left
                return search(arr, si, mid-1, target);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:-");
        int n = sc.nextInt();
        System.out.println("enter the elements of the array:-");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the target element to search:-");
        int target = sc.nextInt();
        if (search( arr, 0, n-1,  target) == -1) {
            System.out.println(target + " not found in the array.");
        } else {
            System.out.println(target + " found at index " + search( arr, 0, n-1,  target) + " in the array.");
        }
    }
}
//this is a modified binary search algorithm