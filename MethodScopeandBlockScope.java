public class MethodScopeandBlockScope{
    public static void main(String args[]){
        System.out.print(s);//throws an error : s cannot be resolved to a variable
        int s = 4
        int p=77;//p is in function scope and can be accesed by blocks.
        System.out.print(s);//here s is method scope
        {
            System.out.print(p);//here p can be printed and it doesn't throws an error
            int x = 5
            System.out.print(x);//here is x is under block scope
        }
    
            System.out.print(x);//throws an error : x cannot be resolved to variable
            for(int i =1;i<=12;i++){

            }
            System.out.print(i);//throws an error : i cannot be resolved to variable
            //as here i is in block scope of for loop.
    }


}