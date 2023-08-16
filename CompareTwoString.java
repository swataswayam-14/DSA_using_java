public class CompareTwoString{
    public static void main(String args[]){
        String fruits[]  ={"apple","banana","mango"};
        String largest = fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        //this prints the largest string present in the array of string lexicographically
        //the TIME COMPLEXITY OF THIS CODE IS O(x*n)
        //where x is length of the maximum string as compareTo function checks letter by letter 
        //and n is the total number of strings present in the String array
        System.out.print("the largest string is "+largest);
}
}