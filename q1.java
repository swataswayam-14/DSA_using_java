import java.util.*;
public class q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //in a program input 3 numbers a,b,c. output there average
        System.out.println("enter all the three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float average = (a+b+c)/3;
        System.out.println(average); 
        //idk why the average is not precide that only its coming till .0
    }
}