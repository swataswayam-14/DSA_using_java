import java.util.*;
public class Diagonal_sum{
    public static int diagonalSum(int matrix[][]){
        //In this algorithm two loops are running hence its time complexity is O(n^2)
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(i==j){
                  sum+=matrix[i][j];  
                }
                else if((i+j)==matrix.length-1){
                    sum+=matrix[i][j];
                }
            }
        }
        return sum;
    }
    public static int OptimisedDiagonalSum(int matrix[][]){
         //this algorithm has a time complexity of O(n)
        int sum =0;
        for(int i=0;i<matrix.length;i++){
            sum+=matrix[i][i];
            if(matrix.length % 2 ==0){//this special condition is added so that for even order matrix the sum should come correct
                sum+=matrix[i][matrix.length-1];
            }
            else if(i!=matrix.length-1){
                sum+=matrix[i][matrix.length-1];
            }
        }
        return sum;
    }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int matrix[][] = new int [2][2];
    System.out.println("enter 4 elements of the matrix:-");
    for(int i =0;i<2;i++){
        for(int j=0;j<2;j++){
            matrix[i][j]=sc.nextInt();
        }
    }
    System.out.println("you have entered the following matrix:-");
    for(int i =0;i<2;i++){
        for(int j=0;j<2;j++){
            System.out.print(matrix[i][j] +" ");
        }
        System.out.println();
    }
         
    System.out.println("the diagonal sum is "+diagonalSum(matrix));
    System.out.println("the diagonal sum is "+OptimisedDiagonalSum(matrix)+" by the optimised method for finding the diagonal sum");

    }
}
//space complexity for both the code is O(1)