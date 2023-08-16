import java.util.*;
public class shortestPath{
    public static void Displacement(String directions){
        //TIME COMPLEXITY OF THIS ALGO IS O(n)
        int n = directions.length();
        int x=0;
        int y=0;
        for(int i=0;i<n;i++){
            if(directions.charAt(i)=='N'){
                y++;
            }
            else if(directions.charAt(i)=='W'){
                x--;
            }
            else if(directions.charAt(i)=='S'){
                y--;
            }
            else if(directions.charAt(i)=='E'){
                x++;
            }
        }
        int a = x*x;
        int b = y*y;
        int c = a+b;
        double displace = Math.sqrt(c);
        System.out.print("the shortest path from origin is "+displace);
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("enter the directions:--");
        str = sc.nextLine();
        Displacement(str);

    }
}