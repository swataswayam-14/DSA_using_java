import java.util.*;
import java.util.concurrent.ForkJoinWorkerThread;
public class transpose{
    public static void transposeOfMatrix(int arr[][],int n){
        int brr[][] = new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                brr[j][i] = temp;
            }
        }
        System.out.println("the transpose of the matrix is:-");
        //printing the brr matrix
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the matrix:-->");
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        System.out.println("Enter the elements of the array:-");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        transposeOfMatrix(arr,n); 
    }
}