import java.util.*;
public class square_loop{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the total number of lines-->");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("****");
        }
    }/* code in while loop
        int i = 1;
        while(i<=n){
            System.out.println("****");
            i++;
        } */
}