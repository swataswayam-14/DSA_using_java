public class Typeconversionexample{
    public static void main(String args[]){
        int x = 10;
        float y = 25.27f;
        long z = 56;
        double d = x+y+z;
        //--------------------------
        short a = 5;
        byte b = 56;
        char c = 'c';
        //byte bt = a+b+c;----this shows an error poping lossy conversion from int to byte
        //-----------------------------
        byte ab = 7;
        byte bc = (byte)(ab*6);
        byte bt = (byte)(a+b+c);//here the integer is typecasted to byte hence it doesn't shows an error
        System.out.println(bt);
        System.out.println(d);
        System.out.println(bt);
    }
}