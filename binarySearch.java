//binary search is asked in interviews and coding tests
//prereuisite is a sorted array
public class binarySearch{
    public static int BinSeaArr(int arr[],int key){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid]==key){
                return mid;
            } 
            if(arr[mid]<key){
                //right
                start = mid +1;

            }else{
                end = mid-1;
            }
            }
            return -1;
        }
        public static void main(String args[]){
            int arr[]={1,2,3,22,4,33,45,567,24567};
            int key = 270;
           int b= BinSeaArr(arr,key);
           if(b!=-1){
            System.out.println("the number is found at index "+b);
           }else{
            System.out.println("the number is not found");
           }
            
        }
    }
