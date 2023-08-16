import java.util.*;
public class zeroonetriangle{
    public static void logicDiffTriang(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }System.out.println();
        }
    }
    public static void triangle(int n){
        int k=1;
        int i=1;
        while(i<=n){
            if(i==1){
                System.out.print(i);
            }
            else if(i%2==0){
                k=0;
                for(int j=1;j<=i;j++){
                    System.out.print(k);
                    if(k==0){
                        k=1;
                    }else{k=0;}
                }
            }
            else if(i%2!=0){
                k=1;
                for(int j=1;j<=i;j++){
                    System.out.print(k);
                    if(k==0){
                        k=1;
                    }else{k=0;}
                }
            }
            i++;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no. of lines-->");
        int n = sc.nextInt();
        triangle(n);
        logicDiffTriang(n);

    }
}