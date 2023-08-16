import java.util.*;
public class PairSumSortedOptimised{
    public static boolean PairSum(ArrayList<Integer> list,int target){
        //1 2 3 4 5 
        //this code will work if the arraylist is in sorted order(Ascending)
        //the time complexity of this code is O(n)
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }else{
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the arrayList:-");
        int n = sc.nextInt();
        System.out.print("enter target element:-");
        int target = sc.nextInt();
        System.out.println("enter the elements of the arraylist:-");
        ArrayList<Integer>list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        if(PairSum(list,target)){
            System.out.print("the pair exists whose sum is equal to target");
        }else{
            System.out.print("No pair exists whose sum is equal to targert");
        }
    }
}