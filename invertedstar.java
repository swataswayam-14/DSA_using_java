public class invertedstar{
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print("*");

            }System.out.println();
        }//a different method to solve this:-
        int n=5;
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n-i+1;j++){//formula to reverse is n-i+1
                System.out.print("*");
            }System.out.println();
        }
    }
}