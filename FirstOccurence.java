import java.util.*;
public class FirstOccurence{
    public static int Occur(int arr[],int i,int num){
        if(i==arr.length){
            return -1;
        }
        if(num==arr[i]){
            return i;
        }
        return Occur(arr,i+1,num);
    }
    public static int lastOccur(int arr[],int i, int num){
        if(i==0){
            return -1;
        }
        if(num == arr[i-1]){
            return i-1;
        }
        return lastOccur(arr, i-1, num);
    }
    public static int lastOccur2(int arr[],int i, int num){
        if(i == arr.length){
            return -1;
        }
        int isFound = lastOccur2(arr, i+1, num);
        if(isFound == -1 && arr[i] == num){
            return i;
        }
        return isFound;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]={22,44,21,45,7,1,6,24,789,43,21};
        int x = arr.length;
        System.out.print("enter the number to find its first occurence and last occurence in the array:-");
        int n = sc.nextInt();
        if(Occur(arr, 0, n)==-1){
            System.out.print("element entered is not present in the array");
        }
        else{
            System.out.println("the element "+n+" occurs first at index "+Occur(arr, 0, n)+" of the array");
            System.out.println("the element's "+n+" last occurence is at index "+lastOccur(arr, x, n)+" of the array");
            System.out.println("the element "+n+"  last occurs at index "+lastOccur2(arr, 0, n)+" of the array ,this output is achieved through a different algorithm ");
        }
    }
}
//the time and space complexity of this code in O(n).