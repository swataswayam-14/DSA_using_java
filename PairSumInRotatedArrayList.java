import java.util.*;
public class PairSumInRotatedArrayList{
    public static boolean PairSum(ArrayList<Integer>list,int target){
        int n=list.size();
        int bp=-1;
        //below code is to find the breaking point in a sorted and rotated arraylist
        for(int i=0;i<n;i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
        while(lp!=bp){
            //case 1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            //case 2
            else if(list.get(lp)+list.get(rp)<target){
                lp = (lp+1)%n;
            }
            else{
                rp = (rp+n-1)%n;
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
