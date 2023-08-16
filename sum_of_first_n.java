import java.util.*;
public class sum_of_first_n{
    public static void main(String ags[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n till which sum would be calculated---> ");
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while(count <=n){
            sum+=count;
            count++;
           
        } System.out.println(sum);
    }
} 