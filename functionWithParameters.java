import java.util.*;
// public class functionWithParameters{
//     public static void sumcalc(){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a+b;
//         System.out.println("The sum is "+sum);
//     }
//     public static void main(String args[]){
        
//         sumcalc();
//     }
// }
// // passing parameters to the function
// public class functionWithParameters{
//     public static void calcsum(int num1 , int num2){
//         int sum = num1 + num2;
//         System.out.println("the sum is "+sum);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         calcsum(a,b);
//     }
// }
//we can even write in a integer return type function
public class functionWithParameters{
    public static int calcsum(int num1, int num2){//parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcsum(a,b);//arguments or actual parameters
        System.out.println("the sum is "+sum);
    }
}