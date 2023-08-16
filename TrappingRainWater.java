/*
 * given n non-negative integers representing
 * an elevation map where the width of each bar is 1,
 * compute how much water it can trap after raining.
 */
import java.util.*;
public class TrappingRainWater{
    public static int TrappWat(int height[]){//time complexity is O(n)
        //left maximum boundary array:
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0]= height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //right maximum boundary:
        int rightMax[] = new int[n];
        rightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //calculation of water level
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            //calculation of trapped water amount
            trappedWater += waterLevel-height[i];
        }
        return trappedWater;
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int n;
            System.out.print("enter the size of the array:-");
            n= sc.nextInt();
            int [] height;
            height = new int[n];
            System.out.println("enter the elements of the array");
            for(int i=0;i<n;i++){
                height[i]=sc.nextInt();
            }
            System.out.print("the amount of water stored or trapped is "+TrappWat(height));
        }
}