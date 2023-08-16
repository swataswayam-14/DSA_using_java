import java.util.*;
public class array2{
    //passing arrays as argument
    //the array is passed as reference to the function
    public static void update(int marks[],int nonChangable){
        nonChangable=5;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }
    }
    public static void main(String args[]){
        int marks[]={98,97,95};
        int nonChangable=10;
        update(marks,nonChangable);
        //print the marks
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }System.out.println(nonChangable);
    }//this proves that array are passed by reference to the function
    //and normal variable are passed by value to the function
}