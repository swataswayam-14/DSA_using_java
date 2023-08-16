import java.util.*;

public class DuplicateCharRec {
    public static void CheckDuplicate(int idx, boolean arr[], StringBuilder newStr, String str) {
        if (idx == str.length()) {
            System.out.print(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (arr[currChar-'a']==true) {
            CheckDuplicate(idx+1, arr, newStr, str);
        } else {
            arr[currChar-'a'] = true;
            CheckDuplicate(idx+1, arr, newStr.append(currChar), str);
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean arr[] = new boolean[26];
        StringBuilder newStr = new StringBuilder("");
        System.out.print("enter a string: ");
        String str = sc.nextLine();
        CheckDuplicate(0, arr, newStr, str);
    }
}//homework is to do stack analysis
