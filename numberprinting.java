import java.util.*;
public class numberprinting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("till which number you want to print?");
        int x = sc.nextInt();
        int count = 0;
        while(count != x){//count = 1 and count <=x can also work!
            System.out.println(count+1);//to print all odd numbers just change it to ++count and for even change it to count++
            count ++;
        }
    }
}