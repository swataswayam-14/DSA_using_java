import java.util.*;
public class NextGreaterElement{
    //next greater in the left
    public static void main(String args[]){
        //the time complexity of this code is O(n)
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nxtGreater[] = new int[arr.length];

        for(int i = arr.length-1;i>=0;i--){
            //while
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            //if-else
            if(s.isEmpty()){
                nxtGreater[i]=-1;
            }else{
                nxtGreater[i] = arr[s.peek()];
            }
            //push the index int the stack
            s.push(i);
        }
        //printing the nextGreater array
        for(int i=0;i<nxtGreater.length;i++){
            System.out.print(nxtGreater[i]+" ");
        }
        System.out.println();
    }
}
//if the question asked to find the  nextGreater in the left then just change the loop condition and initialisation of i , now i will start from 0 and go till length-1

//variation of the question :-


//next Greater right
//next Greater left (change the initialisation of i to 0 till length -1)
//next smaller right(just change the 2nd condition in the while loop)
//next smaller left (change both the initialisation in the for loop and condition in the while loop)