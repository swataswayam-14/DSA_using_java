import java.util.*;
import java.util.Arrays;
import java.util.Collections;
public class BasicSorting{
    public static void BubbleSort(Integer arr[]){
        //in bubble sort we did swapping in the inner loop
        for(int turn=0;turn<arr.length-1;turn++){
            int swap = 0;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                swap++;
                if(swap == 0){
                    break;
                }
            }
        }
        
    }
    public static void SelectionSort(Integer arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minPos=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void InsertionSort(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            int curr =arr[i];
            int prev =i-1;
            while(prev>=0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=curr;
        }
    }
    public static void CountingSort(Integer arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest = Math.max(largest,arr[i]);
        }
        Integer count[] = new Integer[largest+1];
        Arrays.fill(count, 0);
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        //sorting
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void PrintArr(Integer arr[]){
        System.out.println("the sorted array is:-");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
    }
    public static void inputArr(Integer arr[],int n){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
    }
    public static void main(String args[]){

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
         n = sc.nextInt();
        Integer arr[] = new Integer[n];
        inputArr(arr,n);
        System.out.println("If you want to sort the whole array then press 'W' Or if you want to sort a specific part of the array then press 'O'");
        char x = sc.next().charAt(0); 
        if(x=='W'){
        System.out.println("enter 'b' for sorting in bubble sort or 's' for sorting in selection sort or 'i' for insertion sort or 'C' for Counting sort ");
        System.out.println("if you want to sort the array using inbuilt function of array then press 'J'");
        char c = sc.next().charAt(0); 
        if(c=='b'){
            BubbleSort(arr);
        }
        else if(c=='s'){
            SelectionSort(arr);
        }
        else if(c=='i'){
            InsertionSort(arr);
        }
        else if(c=='J'){
            System.out.println("if you want to sort the array in descending order then press 'D' else press 'N'");
            char L = sc.next().charAt(0); 
            if(L == 'D'){ 
            Arrays.sort(arr,Collections.reverseOrder());}else{
                Arrays.sort(arr);
            }
        }
        else if(c =='C'){
            CountingSort(arr);
        }
        PrintArr(arr);
    }
    else if(x=='O'){
        System.out.print("enter the starting index->");
        int si = sc.nextInt();
        System.out.print("enter the last index->");
        int ei = sc.nextInt();
        System.out.println("if you want to sort the array in descending order then press 'D' else press 'N'");
        char l = sc.next().charAt(0); 
        if(l == 'D'){
            Arrays.sort(arr,si,ei,Collections.reverseOrder());
            PrintArr(arr);
        }else{
        Arrays.sort(arr,si,ei);
        PrintArr(arr);}
    }
}
}//time complexity for bubble sort, selection sort and insertion sort is O(n^2)
//the inbuilt sort function of java sorts the array and has the time complexity of nlogn