import java.util.*;
public class input{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);
        //we can give any name to the scanner object
        //here we have given it the name sc
        //.next function takes input till space or next line is encountered
        // String name = sc.nextLine();
        // int number = sc.nextInt();
        // System.out.println(name);
        //nextline function is used to take inputs which have spaces too!
        // int number = sc.nextInt();
        // System.out.println(number);
        //nextInt function is used to take input for integers...
        float price = sc.nextFloat();
        System.out.println(price);
        //here nextFloat function is used to take inputs of floating point numbers
    }
}