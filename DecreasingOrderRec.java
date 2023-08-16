//print numbers in decreasing order from 10 to 1 using recursion
public class DecreasingOrderRec{
    public static void printDec(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void main(String args[]){
        int n = 10;
        printDec(n);
    }
}