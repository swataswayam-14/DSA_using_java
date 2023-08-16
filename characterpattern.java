//here the character should be printed in a continuous pattern in a half pyramid fashion
public class characterpattern{
    public static void main(String args[]){
        int n=5;
        char ch ='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }System.out.println();
        }
    }
}//trick to solve the loops problem---> use extra variables rather than using iterator variable