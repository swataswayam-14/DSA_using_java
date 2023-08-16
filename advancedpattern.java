import java.util.*;
public class advancedpattern{
    public static void pattern(int r , int c){
        int i=1;
        int j;
        while(i<=r){
            for(j=1;j<=c;j++){
                if(i==1||i==r){
                    System.out.print(" * ");
                }else if(j==1||j==c){
                    System.out.print(" * ");
                }else{
                    System.out.print(" o ");
                }
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of rows-->");
        int r = sc.nextInt();
        System.out.print("enter no. of columns-->");
        int c = sc.nextInt();
        pattern(r,c);
    }
}