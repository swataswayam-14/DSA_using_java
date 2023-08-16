import java.util.*;
public class problembreakk{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            //program to take input from the user as long as he hasn't entered a multiple of 10
            while(true){
                System.out.print("enter your number--> ");
                int n = sc.nextInt();
                if(n%10==0){
                    break;
                }else{
                    System.out.println("you entered-->"+n);
                }
            }System.out.print("oops you entered a multiple of 10");
            
        }
    }
