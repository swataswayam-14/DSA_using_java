import java.util.*;
//the previous program had a time complexity of n^2
//this program is more efficient its time complexity is order of n
public class largeNumArr2{
    public static void larrNumInArr(int arr[]){
    int largest = Integer.MIN_VALUE;// -infinity
    int smallest = Integer.MAX_VALUE;//+infinity
    for(int i=0;i<arr.length;i++){
        if(largest<arr[i]){
            largest = arr[i];
        }
        if(smallest>arr[i]){
            smallest = arr[i];
        }
    }//use return largest to show the largest number present in the array
    System.out.println("the smallest value is "+smallest);
    System.out.println("the largest value is "+largest);
}
public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,33,99,346,7654,4565};
    larrNumInArr(arr);
}    

}