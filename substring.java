import java.util.*;
public class substring{
    public static String Substring(String str, int si,int ei){
        String substr ="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        //substring is a continous part of the main string
        //here the starting index(si) is included but the ending index(ei) is not included
        //substring of HelloWorld where si = 0 and ei = 4 is Hell
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a string:-");
        String str = sc.nextLine();
        System.out.print("enter starting index and ending index:-");
        int si = sc.nextInt();
        int ei = sc.nextInt();
        // in the above function we have created a substring function by ourself
        //In java also we have a prebuilt substring function that is :-->  .substring(str,si,ei)
        System.out.print("enter '1' if you want to use your substring function or '2' if you want to use the prebuilt function");
        int n = sc.nextInt();
        if(n==1){
            System.out.print("the substring is "+Substring(str, si, ei));
        }
        else{
            //java's prebuilt function to find the substring
            System.out.print("the substring is "+str.substring( si , ei));
        }
    }
}