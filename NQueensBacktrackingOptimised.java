import java.util.*;
public class NQueensBacktrackingOptimised{
    // function to check if it is safe to place a queen at a given row and column
    public static boolean isSafe(char board[][],int row,int col){
        // check for queens in the vertical column up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        // check for queens in the diagonal left up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // check for queens in the diagonal right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // it is safe to place a queen at the given row and column
        return true;
    }
    
    // function to place queens on the chess board using backtracking
    public static boolean Nqueens(char board[][],int row){
        // base case: all queens have been placed on the board
        if(row==board.length){
           
            printBoard(board); // print the final chess board
            count++;
            return true;
        }
        
        // try placing a queen in each column of the current row
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){ // check if it is safe to place a queen at the current position
                board[row][j]='Q'; // place the queen at the current position
                if(Nqueens(board, row+1)){
                    return true;
                } // recursively place the next queen
                board[row][j]='X'; // undo the current move (backtracking)
            }
        } 
        return false; 
    }
    
    // function to print the chess board
    public static void printBoard(char board[][]){
        System.out.println("-------Chess board-------");
        for(int i=0;i<board.length;i++){
            
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int count = 0;
    
    // main function to get input from user and initialize the chess board
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the chess board:-");
        int n = sc.nextInt();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X'; // initialize the board with empty squares
            }
        }
        if(Nqueens(board, 0)){
            System.out.println("the solution exists. And a possibe combination is given below:- ");
            printBoard(board);
        }
        else{
            System.out.println("no possible solution exists");
        }
        
    }
}