import java.util.*;
public class SudokuSolver{
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //column
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        //3X3 grid
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row == 9){
            return true;
        }
        
        //recursion
        int nextRow=row, nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;//solution exists
                }
                sudoku[row][col]=0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the sudoku:-");
        int n = sc.nextInt();
        int sudoku[][]=new int[n][n];
        System.out.println("enter the elements of the sudoku, enter 0 for void elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sudoku[i][j]=sc.nextInt();
            }
        }
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("solution exists and one of the possible solution is:-");
            printSudoku(sudoku);
        }else{
            System.out.println("No possible solution exist");
        }
    }
}