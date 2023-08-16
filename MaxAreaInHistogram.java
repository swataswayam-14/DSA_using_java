import java.util.*;
public class MaxAreaInHistogram{
    //the overall timecomplexity of this code is O(n):- Most Optimised Code
    public static void maxArea(int arr[]){
        int maxArea = 0;
        int nsl[]= new int[arr.length];
        int nsr[] = new int[arr.length];
        //Next Smaller Right:- O(n)
        Stack<Integer> s = new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Next Smaller left:-O(n)
        s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //current area :- width = j-i-1 = nsr[i]-nsl[i]-1 calculated in linear time O(n)
        for(int i=0;i<arr.length;i++){
            int height = arr[i];
            int width = nsr[i]-nsl[i]-1;
            int currArea = height * width;
            maxArea = Math.max(currArea,maxArea);
        }
        System.out.print("max area in histogram = "+maxArea);
    }
    public static void main(String args[]){
        int arr[]={2,1,5,6,2,3};//heights in histogram
        maxArea(arr);
    }
}