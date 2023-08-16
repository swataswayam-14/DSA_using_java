import java.util.*;
public class SpiralPrint{
    public static void Spiral(int arr[][],int n , int m){
        int startRow = 0;
        int endRow = n-1;
        int startCol = 0;
        int endCol = m-1;
        while(startRow<=endRow && startCol<=endCol){
        //top 
        for(int j = startCol;j<=endCol;j++){
            System.out.print(arr[startRow][j]+" ");
        }
        //right
        for(int i =startRow+1;i<=endRow;i++){
            System.out.print(arr[endCol][i]+" ");

        }
        //bottom
        for(int j=endCol-1;j>=startCol;j--){
            if(startRow==endRow){
                break;
            }
            System.out.print(arr[endRow][j]+" ");
        }
        //left
        for(int i=endRow-1;i>startRow;i-- ){
            if(startCol==endCol){
                break;
            }
            System.out.print(arr[i][startCol]+" ");
        }
        startRow++;
        startCol++;
        endRow--;
        endCol--;

    }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows and no. of columns of the matrix:-");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        //input the elements of the array:-
        System.out.println("enter the elements of the array:--");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //printing the array:-
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        Spiral(arr, n, m);

    }
}