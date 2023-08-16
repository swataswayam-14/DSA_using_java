import java.util.*;
public class QuestionMultiArrayList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        //storing the elements in the lists
        for(int i=1;i<=5;i++){
            list1.add(i);//1,2,3,4,5
            list2.add(i*2);//2,4,6,8,10
            list3.add(i*3);//3,6,9,12,15
        }
        //the size of the list may be different
        list2.remove(3);
        list2.remove(2);


        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);

        //to print the same thing using nested loops:
        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
    }
}

//it is not necessary that the size of all the lists need to be same