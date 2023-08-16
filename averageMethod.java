import java.util.*;
public class averageMethod{
    public static int average(int n1, int n2, int n3){
        return (n1+n2+n3)/3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter three numbers-->");
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        System.out.println("the average of the numbers entered is "+average(a,b,c));
    }
}