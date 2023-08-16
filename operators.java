import java.util.*;
public class operators{
    public static void main(String args[]){
        int a = 34;
        int b = 45;
        System.out.println("addition is "+ (a+b));
        System.out.println("substraction is "+(a-b));
        System.out.println("division is "+(a/b));
        System.out.println("multiplication is "+(a*b));
        System.out.println("remainder is "+(a%b));
      //unary operator
      //++ is increment operator
      //-- is decrement operator
      //++a -- pre increment
      //a++ -- post decrement
      int x = 10;
      int g = ++x;
      System.out.println("-----pre increment----");
      System.out.println(g);
      System.out.println(x);
      System.out.println("-----post increment-----");
      int h = 10;
      int l = h++;
      System.out.println(h);
      System.out.println(l);
      System.out.println("-----decrement operator-----");
      int s = 10;
      int n = --s;
      int f = 10;
      int i = f--;
      System.out.println("----pre decrement---");
      System.out.println(s);
      System.out.println(n);
      System.out.println("----post decrement----");
      System.out.println(f);
      System.out.println(i);
    }
}