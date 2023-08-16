//type promotion in expression 
/*
 * java automatically promotes each byte,short or char operand to int when evaluating an expression.
 * if one operand is long, float or double the whole expresion is promoted to long, float or double respectively.
 */
import java.util.*;
public class typePromotion{
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';
        //char c = a-b; ---this is an error
        System.out.println((int)(a));
        System.out.println((int)(b));
        System.out.println(b-a);//here everything is converted to integer and then evaluated.
        System.out.println(a);//type promotion only happens in expression and hence a is printed as char a.

    }
}