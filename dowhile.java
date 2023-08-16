//in do while loop first work is done and then condition is checked
import java.util.*;
public class dowhile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =1;
        do{
            System.out.println("Hello World");
            count++;
        }while(count<=n);
    }
}