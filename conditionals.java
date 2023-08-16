//if-else construct
public class conditionals{
    public static void main(String args[]){
        int age = 14;
        if(age >= 18){
            System.out.println("Adult: vote and drive");

        }
        //else executes when all the if statements are false!
        if(age>13 && age<18){
            System.out.println("Teenager");

        }
        else{
            System.out.println("not adult");
        }
    }
}