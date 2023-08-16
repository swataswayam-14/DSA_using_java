import java.util.*;
public class oddevensum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i =1;
        int sume = 0;
        int sumo = 0;
        while(i<=10){
            System.out.print("enter "+i+". number-->");
            int n = sc.nextInt();
            i++;
            if(n%2==0){
                sume+=n;
            }else{sumo+=n;}
        }System.out.println("the sum of all even number entered is "+sume);
        System.out.println("the sum of all odd numbers is "+sumo);
    }
}