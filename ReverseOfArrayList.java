import java.util.ArrayList;
import java.util.*;

public class ReverseOfArrayList{
    public static void SwapFunction(ArrayList<Integer>list,int idx1 , int idx2){
        System.out.println(list);
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.print(list);
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(8);
        //reverse print
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");

        }
        System.out.println();
        //the time complexity is O(n)

        //code to find the maximum element in an arraylist:-
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            // if(max<list.get(i)){
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));//this is a single line code to get the maximum value
            //the time complexity to find the maximum element is O(n):- Linear time
        }
        System.out.println("the max element is "+max);
        Scanner sc = new Scanner(System.in);
        System.out.print("enter index 1 and index 2 to swap the values present in those indices:--->");
        int idx1 = sc.nextInt();
        int idx2 = sc.nextInt();
        SwapFunction(list, idx1, idx2);
    }
}