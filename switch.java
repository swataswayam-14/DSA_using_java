import java.util.*;
public class switchh{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        switch(x){
            case 1 : System.out.println("burger");
                    break;
            case 2 : System.out.println("mango");
                    break;
            case 3 : System.out.println("samosha");
                    break;
            default : System.out.println("wake up and study!");
        }
    }
}