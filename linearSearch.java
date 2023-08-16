import java.util.*;
public class linearSearch{
    //find the index of element in a given array
    public static int linearSearchs(int arr[],int key){
        for(int i=0;i<10;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        System.out.println("enter the elements of the array");
        for(int i=0;i<=9;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enter the key you want to search-->");
        int k=sc.nextInt();
        int b=linearSearchs(arr,k);
        if(b!=-1){
            System.out.println("the element is found at index "+b);
        }else{System.out.print("the element is not found");}
    }
}//the time-complexity of linear search is order of n.