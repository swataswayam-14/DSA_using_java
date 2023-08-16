public class StringBuilders{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a';ch<='z';ch++){
            sb.append(ch);
        }
        //here the time complexity is O(n)
        //but if we did the same thing using string using charAt() and += 
        //then its time complexity would be O(n^2)
        System.out.println(sb);
        System.out.println(sb.length());//prints the length of sb
    }
    //the program which we write in strings,we can write each and every program using StringBuilder
    //hence it becomes memory efficiency and time efficient
}