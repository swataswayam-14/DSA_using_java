import java.util.*;
public class MostWater{
    public static int maxxWater(ArrayList<Integer> heights){
        int maxWater = 0;
        for(int i=0;i<heights.size();i++){
            for(int j=0;j<heights.size();j++){
                int width = j-i;
                int height = Math.min(heights.get(i),heights.get(j));
                int currWater = width*height;
                maxWater = Math.max(maxWater,currWater);
            }
        }
        return maxWater;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.print("enter the number of water columns:-");
        int n = sc.nextInt();
        System.out.println("enter the heights of the water columns:-");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        System.out.print("the max water which can be stored is:--->"+maxxWater(list));
    }
}
//the time complexity of this brute force approach is O(n^2).