import java.util.*;
public class typeconversion{
    public static void main(String args[]){
        // int a = 5;
        // long b = a;
        // System.out.println(b);
        // long a = 5;// this is an error.
        // int b = a 
        //the error is incompatible types.
        //lossy conversion from long to int
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
    }
}