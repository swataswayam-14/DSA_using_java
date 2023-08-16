import java.util.*;
public class largestofthree{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three numbers--->");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>=y && x>=z){
            System.out.println("the largest number entered is "+ x);

        }
        else if(y>=z){
            System.out.println("the largest number is "+ y);

        }
        else{
            System.out.println("the largest number is "+z);
            
        }
    }
}