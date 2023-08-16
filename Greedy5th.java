//maximum chain length
import java.util.*;
public class Greedy5th{
    public static void main(String args[]){
        int pairs[][] = {{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs , Comparator.comparingDouble(o->o[1]));
        //array is sorted on the basis of the ending length of each bead
        int chainLen = 1;
        int chainEnd = pairs[0][1];//last selected pair end :--> chain end
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.print("the maximum length of the chain that can be formed is "+chainLen);
    }
}//the time complexity of this code is O(nlogn)