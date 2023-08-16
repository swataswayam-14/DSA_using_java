/*
in arrays we use Arrays.sort(arr):- in this function an array is passed and it is returned by the function in sorted format.

the same thing can be done in Arraylist by using the class Collections and the method sort()
Collections.sort(list)
list will be sorted in ascending order

Collection :- interface
Collections :- class
 */

import java.util.*;//this imports everything
// import java.Collections;
// import java.util.ArrayList;
public class SortingAnArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //to sort the ArrayList in descending order :-
        Collections.sort(list,Collections.reverseOrder());
        //Collections.reverseOrder() is a comparator. Comparator are functions in Java which defines logic in which way the sorting should take place
        //we can apply these comparators to objects also
        System.out.println(list);

        //.sort() function in Java is an Optimised function
    }
}