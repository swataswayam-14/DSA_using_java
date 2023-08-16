//write a program to take inputs of three items and 
//output there total cost and cost after adding 18% gst
import java.util.*;
public class bill{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the price of pencil , pen and eraser respectively");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = (a+b+c);
        double e = (d + (d*0.18));
        System.out.print("the price of the items is ");
        System.out.println(d);
        System.out.print("total bill including gst is ");
        System.out.print(e);
    }
}