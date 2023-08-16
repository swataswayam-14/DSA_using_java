import java.util.*;

public class OptimisedGridWays {
    public static long Ways(int n) {
        long fact2n = 1;
        for (int i = 1; i <= 2 * n - 2; i++) {
            fact2n *= i;
        }
        long factnm1 = 1;
        for (int i = 1; i <= n - 1; i++) {
            factnm1 *= i;
        }
        long f = factnm1 * factnm1;
        long res = fact2n / f;
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of grid: ");
        int n = sc.nextInt();
        System.out.println("The total number of ways is " + Ways(n));
    }
}
//the time complexity of this code is O(n).