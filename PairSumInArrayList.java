import java.util.*;
public class PairSumInArrayList{
    //this is brute force approach and its time complexity is O(n^2)
    public static boolean PairSum(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the target element:-");
        int target = sc.nextInt();
        System.out.print("enter the size of the arrayList:-");
        int n = sc.nextInt();
        ArrayList<Integer>list=new ArrayList<>();
        System.out.println("Enter the elements of the arrayList:-");
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        if(PairSum(list,target)){
            System.out.print("the pair sum exists.");
        }else{
            System.out.print("the pair sum doesn't exists.");
        }
    }
}