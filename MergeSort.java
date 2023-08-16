//the time complexity of Merge Sort is order of nlogn
//the space complexity of MergeSort is O(n)
/*there are 3 steps in Merge Sort 
1.To divide
    finding the middle of the array and breaking the problem to solve two small arrays and then again dividing the arrays into two 

    mid = si+(ei-si)/2
2.Apply Merge Sort for the right and left arrays
*/
import java.util.*;
public class MergeSort{
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void InputArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter "+arr.length+ " elements of the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void MergesSort(int arr[],int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        MergesSort(arr,si, mid);//left array
        MergesSort(arr,mid+1, ei);//right array
        Merge(arr, si,mid, ei);
    }
    public static void Merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;//iterator for left array
        int j=mid+1;//iterator for right array
        int k=0;//iterator for temporary array
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy the elments of the temporary array to the original array
        for( i=si,k=0;i<=ei;i++,k++){
            arr[i]=temp[k];
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:-");
        int n = sc.nextInt();
        int arr[]=new int[n];
        InputArray(arr);
        MergesSort(arr, 0, arr.length-1);
        PrintArray(arr);
    }
}