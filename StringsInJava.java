import java.util.*;
public class StringsInJava{
    //function which prints all the letters of the string
    public static void PrintString(String fullName){
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i)+" ");
        }
    }
    //STRINGS ARE IMMUTABLE IN JAVA
    public static void main(String args[]){
        // String s="swayam";
        // char arr[] = {'s','w','a','y','a','m'};
        // String s2 = new String("swayam");


        // String s3;
        // Scanner sc = new Scanner(System.in);
        // s3 = sc.nextLine();
        // String name = sc.next();//next function takes only a single word
        // //when we put a space or next line then it doesn't take that as input
        // //so we use nextLine() function to take the whole line as input
        
        // System.out.println(s3);
        // System.out.println(name);
        //there is a function in String class in Java -> length() which calculates the length of the string
        // String fullName = "Swata swayam dash";//spaces are also calculated
        // System.out.println(fullName.length());
        
        //concatenation
        String firstName = "swata";
        String middleName = "swayam";
        String lastName = "dash";
        String fullName = firstName+" "+middleName+" "+lastName;
        System.out.println(fullName);

        //there is a function charAt() to find the character in the string
        System.out.println(fullName.charAt(3));
        PrintString(fullName);
    }
}