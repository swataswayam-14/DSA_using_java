import java.util.*;
public class StaircaseSearch{
    public static boolean StaircaseSearch1(int arr[][],int key){
        int row = arr.length-1;
        int col = 0;
        while(row>=0 && col<arr[0].length){
            if(key == arr[row][col]){
                System.out.println("the key is found at ("+row+","+col+")");
                return true;
            }
            else if(key < arr[row][col]){
                row--;
            }
            else if(key > arr[row][col]){
                col++;
            }
        }
        System.out.println("key not found!");
        return false;
    }
    public static boolean Staircasesearch(int arr[][],int key){
        int row = 0;
        int col = arr[0].length-1;
        while(row<arr.length && col>=0){
            if(key == arr[row][col]){
                System.out.println("the key is found at ("+row+","+col+")");
                return true;
            }
            else if(key>arr[row][col]){
                row++;
            }
            else if(key<arr[row][col]){
                col--;
            }
        }
        System.out.print("Key not found!");
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter key to search:-");
        int n = sc.nextInt();
        int arr[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50}};
        Staircasesearch(arr, n);
        StaircaseSearch1(arr, n);
    }
}
//the time complexity of this code is O(row+column)
//both the methods are same just we are starting the loop with different extremes in both the functions.