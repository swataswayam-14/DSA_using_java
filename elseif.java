//if is always checked. 
//by using else if construct we ensure that all conditions may or may not be checked.
//if the if condition is false then only the else if condition is checked
//write a program to classify different people according to their age.
import java.util.*;
public class elseif{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age of the person");
        int x = sc.nextInt();
        if(x>=18){
            System.out.println("ADULT");
        }
        else if(x>13 && x<18){
            System.out.println("TEENAGER");
        }
        else if(x<13){
            System.out.println("CHILD");
        }
    
    }
} 