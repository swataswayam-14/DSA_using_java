import java.util.*;

public class reverseArray {
    public static int[] reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        // input the array elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You entered these elements:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        int[] brr = reverse(arr);
        System.out.println("The reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(brr[i] + " ");
        }
    }
}