/*
 the average time complexity of this code is O(nlogn) but in worst case its time complexity is O(n^2). Its space complexity is O(1).
 We use this sorting technique when we need to sort in less time but we dont't have extra space
 *Quick sort goes in Pivot and Partition Approach (like divide and conqueor)

 *first we have to take a pivot around which we need to sort the array(left and right part of the array). we can take the pivot element anywhere. But in this case we will take the last element as the pivot

 2.Next step is Partition
 writing the elements bigger than the pivot on the right side of the pivot and the elements smaller than the pivot on its left side

 The next step is to call Quick sort recursively for the left and right part.

 The base case is when we get a single element then we will stop as the array is already sorted
 */
import java.util.*;
public class QuickSOrt{
    public static void PrintArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void quickSort(int arr[],int si,int ei){
        if(si<ei){
        //last element 
        int pIdx=partition(arr,si,ei);
        quickSort(arr, si, pIdx-1);//left
        quickSort(arr, pIdx, ei);//right
    }}
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//to make place for smaller element than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap-->keeping the smaller element at index i:- swapning between arr[j] and arr[i]
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        //swapning between the pivot and the ith element of the array
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:-");
        int n = sc.nextInt();
        System.out.println("enter "+n+" elements of the array:");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        quickSort(arr, 0, n-1);
        PrintArr(arr);
    }
}
/*
Worst case occurs when pivot is always the smallest or the largest element. Then in that case the time complexity of the code becomes O(n^2)
 */