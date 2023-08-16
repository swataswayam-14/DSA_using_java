import java.util.*;
public class leapyear2{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a year-->");
        int x = sc.nextInt();
        if( (x%4 == 0) && (x%100 != 0)){
            System.out.print("the year entered is a leap year");

        }
        else if((x%100 == 0) && (x%400==0)){
            System.out.println("the year entered is a leap year");
        }
       else{
            System.out.println("its not a leap year");
        }
    }
}