import java.util.*;
public class problemcontinuee{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("enter a number-->");
            int n = sc.nextInt();
            if(n%10==0){
                continue;
            }else{
                System.out.println("you entered "+n);
            }
        } 
    }
}//display all numbers entered by user except multiples of 10