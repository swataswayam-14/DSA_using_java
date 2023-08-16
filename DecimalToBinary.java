import java.util.*;
public class DecimalToBinary{
    public static int ToBinary(int n){
        int pow = 0;
        int dec =0;
        int rem;
        while(n!=0){
            rem = n%2;
            dec = dec+ (rem * (int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        return dec;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("enter the decimal value-->");
            int n = sc.nextInt();
            int c =ToBinary(n);
            System.out.print("the binary form is-->"+c);
        }
    }