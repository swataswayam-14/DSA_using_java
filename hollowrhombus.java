import java.util.*;
public class hollowrhombus{
    public static void horo(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");//space
            }
            //hollow rectangle code
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");//space
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter total no. of lines-->");
        int n = sc.nextInt();
        horo(n);
    }
}