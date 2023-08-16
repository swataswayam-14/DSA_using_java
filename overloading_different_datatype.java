public class overloading_different_datatype{
    //fun to claculate int sum
    public static int sum(int a, int b){
        return a+b;
    }
    public static float sum(float a , float b){
        return a+b;
    }
    public static void main(String args[]){
        System.out.println((sum(2,5)));
        System.out.println(sum(7.2f,8.8f));
    }
}