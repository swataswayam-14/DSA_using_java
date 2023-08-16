import java.util.*;
public class array_2D{
    
    public static void Largest_Smallest_element(int arr[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                largest = Math.max(largest,arr[i][j]);
                smallest = Math.min(smallest,arr[i][j]);
            }
        }
        System.out.println("the largest element present in the array is "+largest);
        System.out.println("The smallest element present in the array is "+smallest);
    }
    public static boolean Search(int arr[][], int key){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]== key){
                    System.out.println("key found at (" +i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        int n = arr.length; // n stores number of rows
        int m = arr[0].length;// m stores number of columns
        //taking input and storing in the array:
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("enter key to search in the matrix:-->");
        int key = sc.nextInt();
        //printing the array
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
        Search(arr,key);
        Largest_Smallest_element(arr);
    }
}