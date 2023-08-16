import java.util.ArrayList;
public class OperationsArraylist{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.add(1,9);//this function adds 9 at the index 1 of the list and every other element shifts to right by 1 place and obviously the array size increases.
        //the time complexity of this function is O(n):- Linear time


        //Get operation
        int element = list.get(2);//O(1)
        System.out.println(element);

        //Remove Operation
        //O(n)
        list.remove(2);//here we will pass the index of which we want to delete the element
        System.out.println(list);

        //to update a value or set ELement at index:-
        //O(n)
        list.set(2,10);
        //here 10 is stored at index 2

        //to check if an element is present in an array or not we will use the Contains Element operation:-
        System.out.println(list.contains(4));
        //this method returns a boolean value

        //to find the size of the arraylist size() method is used
        System.out.println(list.size());
        //using this size() method we can iterate in the arraylist

        //printing the arraylist
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
}