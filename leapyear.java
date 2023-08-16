import java.util.*;
public class leapyear{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a year--->");
        int x = sc.nextInt();
        if(x%4==0){
            if(x%100==0){
                if(x%400==0){
                    System.out.println("its a leap year");
                }else{System.out.println("its not a leap year");}
            } else{
                System.out.println("its a leap year");
            }
        }else{System.out.println("its not a leap year");}
    }
}