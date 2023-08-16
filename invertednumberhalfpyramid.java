import java.util.*;
public class invertednumberhalfpyramid{
    public static void numhalfpyr(int n){
        int i=1;
        while(i<=n){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");//this for loop is unnecessary and it is not required
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter total number of lines-->");
        int n=sc.nextInt();
        numhalfpyr(n);

        }
    }//this program prints inverted half-pyramid with numbers.
