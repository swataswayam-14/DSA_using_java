import java.util.*;
public class BinaryToDecimal{
    public static int conversion(int a){
        int ld;
        int dec=0;
        int n=0;
        while(a!=0){
            ld=a%10;
            dec+=ld*Math.pow(2,n);
            a=a/10;
            n++;
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the binary form-->");
        int n = sc.nextInt();
        int myNUM = n;
        System.out.print("the decimal value of "+myNUM+" is "+conversion(n));
        }
    }
