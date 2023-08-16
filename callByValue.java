import java.util.*;
 public class callByValue{
    public static void swap(int a , int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("now a="+a +" b="+b);
    }//but if we write the print statement in the main function then the values wouldn't be swapped...

     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         System.out.print("enter a and b-->");
         int a = sc.nextInt();
         int b = sc.nextInt();
         System.out.println("you entered a="+a +" and b="+b);
         swap(a,b);
//         //swap code
//         int temp=a;
//         a=b;
//         b=temp;
//         System.out.println("now a="+a +" b="+b);
//     }
     }
    }//java always calls by value but in C++ the value is passed to the function by reference (call by reference )