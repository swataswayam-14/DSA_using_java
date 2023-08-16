import java.util.*;
public class passfail{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the mark of the student");
        int x = sc.nextInt();
        String s = (x>=33) ? "pass" : "fail";
        System.out.println(s);

    }
}