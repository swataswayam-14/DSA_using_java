import java.util.*;
public class incometax{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your salary---->");
        double sal = sc.nextDouble();
        double tax;
        if(sal <500000){
            tax = 0;
        }
        else if(sal >=500000 && sal < 1000000){
            tax = 0.2 * sal;
        }
        else{
            tax = 0.3*sal;
        }
        System.out.println("the income tax is" + tax);
    }
    
}