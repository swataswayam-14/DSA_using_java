import java.util.*;
public class largestNumArr{
    public static int larrArr(int arr[]){
        int temp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                     temp =arr[i];
                }
            }
        }
        return temp;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("enter the elements of the array");
        for(int i=0;i<10;i++){
             arr[i]=sc.nextInt();
        }
        System.out.print("the largest number present in the array is "+larrArr(arr));
    }
}