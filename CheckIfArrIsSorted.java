import java.util.*;
public class CheckIfArrIsSorted{
    public static boolean isSorted(int arr[], int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array:-");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the elements of the array:-");
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        System.out.print("enter the starting index to check the array:-");
        int i = sc.nextInt();
        System.out.print(isSorted(arr, i));
        
    }
}
//the time and space complexity of this code is O(n).