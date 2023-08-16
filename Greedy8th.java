import java.util.*;
public class Greedy8th{
    public static void main(String args[]){
        int n=4,m=6;
        Integer costVer[] = {2,1,3,1,4};//m-1
        Integer costHor[] = {4,1,2};//n-1
        
        Arrays.sort(costVer,Collections.reverseOrder());
        Arrays.sort(costHor,Collections.reverseOrder());
        //Both the arrays are sorted in the descending order 
        //We are applying Greedy Aproach to solve the problem
        int h=0,v=0;
        int hp=1,vp=1;
        int cost = 0;
        while(h<costHor.length&&v<costVer.length){
            if(costHor[h]<=costVer[v]){
                cost += (costVer[v]*hp);
                vp++;
                v++;

            }else{
                cost += (costHor[h]*vp);
                hp++;
                h++;
            }
        }
        //for the left out pieces we are running another loops
        while(h<costHor.length){
            cost += (costHor[h]*vp);
            hp++;
            h++;
        }
        while(v<costVer.length){
            cost += (costVer[v]*hp);
            vp++;
            v++;
        }
        System.out.print("the total cost of cutting all the chocolate into single square chocolates is "+cost);
    }
}