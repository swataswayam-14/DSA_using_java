import java.util.*;
public class invertedandhalfpyramid{
    public static void pyramid(int n){
        int i=1;
        while(i<=n){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of lines-->");
        int n = sc.nextInt();
        pyramid(n);
    }
}