import java.util.*;
public class MultiDImensionalArrayList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1); list.add(4);
        mainList.add(list);
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(4); list2.add(5);
        mainList.add(list2);
        /*
        what happens internally is two references of the 1.list and 2.list2 are stored in the mainList
         */

         //to print the values of the list and list2 from the mainList ,nested loops are used:-
         for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList=mainList.get(i);
            //the above loop is to store the two lists in another currList 
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
            //the second loop is for printing the individual elements from the two lists present in mainList which are stored in currList
         }
         System.out.println(mainList);
    }
}