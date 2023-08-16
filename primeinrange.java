import java.util.*;

public class primeinrange {
    
    public static void primeInRange(int x, int y) {
        for (int i = x; i <= y; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && i > 1) {
                System.out.println(i);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number and the ending number --> ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        primeInRange(a, b);
        sc.close();
    }
    
}