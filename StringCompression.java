import java.util.*;
public class StringCompression{
    //the time complexity of this code is O(n)
    public static String Compress(String str){
        String newstr ="";
        
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if(count > 1){
                newstr += count.toString();
            }
            
        }
        return newstr;
    }
    public static StringBuilder Compress2(StringBuilder sb){
        StringBuilder newstr = new StringBuilder();
        for(int i=0;i<sb.length();i++){
            Integer count = 1;
            while(i<sb.length()-1 && sb.charAt(i)==sb.charAt(i+1)){
                count++;
                i++;
            }  newstr.append(sb.charAt(i));
            if(count > 1){
                newstr.append(count.toString());
            }
        }
        return newstr;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter string:--");
        String str;
        str = sc.nextLine();
        System.out.println("enter 1 to compress using primitive string method or 2 to compress using StringBuilder method");
        int n = sc.nextInt();
        if(n==1){
            System.out.print("the compressed string is "+Compress(str.toString()));
        }
        else{
            System.out.print( Compress2(new StringBuilder(str)));
        }
    }
}