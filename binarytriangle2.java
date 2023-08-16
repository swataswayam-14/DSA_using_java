public class binarytriangle{
    public static void main(String args[]){
        int n=5;
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1){System.out.print(1);}else{
                if(i%2==0){k=1;}else {k=0;}
                System.out.print(k);}
            }System.out.println();
        }
    }//i don't know why this code is not giving the correct output!
    //rather its giving output alternatively
}