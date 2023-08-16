import java.util.*;
public class FirstNonRepeatingLetter{
 
 public static void findUsingarray(){
 
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the size of the array: ");
 int n = sc.nextInt();
 char arr[] = new char[n];
 System.out.println("Enter the elements of the string element by element: ");
 for(int i=0;i<n;i++){
 arr[i] = sc.next().charAt(0);
 }
 int arr2[] = new int[256];
 for(int i=0;i<n;i++){
 arr2[(int)arr[i]]++;
 }
 int index = -1;
 for(int i=0;i<n;i++){
 if(arr2[(int)arr[i]] == 1){
 index = i;
 break;
 }
 }
 if(index == -1){
 System.out.println("No non-repeating character found.");
 }else{
 System.out.println("The first non-repeating character is: " + arr[index]);
 }
 }
 public static void printNonRepeating(String str){
    int freq[] = new int[26];//'a'-'z'
    Queue<Character>q = new LinkedList<>();
    for(int j=0;j<str.length();j++){
        char ch = str.charAt(j);
        q.add(ch);
        freq[ch-'a']++;
        while(!q.isEmpty()&&freq[q.peek()-'a']>1){
            q.remove();
        }
        if(q.isEmpty()){
            System.out.print(-1+" ");
        }else{
            System.out.print(q.peek()+" ");
        }
    }
 }
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = "aabccxb";
    System.out.println("enter 1 to find using queue and 2 using multiple array:-");
    int n = sc.nextInt();
    if(n==1){
        printNonRepeating(str);
    }
    if(n==2){
        findUsingarray();
    }
 }
}