import java.util.*;

public class BinaryString {
    public static void printBinString(int n, String str, int lastDigit) {
        //base case
        if(n==0) {
            System.out.println(str);
            return;
        }
        //work
        printBinString(n-1, str + "0", 0);
        if(lastDigit == 0) {
            printBinString(n-1, str + "1", 1);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("how many binary strings you want to print:- ");
        int n = sc.nextInt();
        printBinString(n, "", 0);
    }
}