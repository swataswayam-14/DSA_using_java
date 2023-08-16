/*
 * access modifiers or specifiers are keywords which specify 
 * whose data would be accessible to whom
 * code ka kaunsa part kaunse data ko ya functions
 * ko use kar payega and kaunse ko nahi karpaega
 */
public class accessModifiers{
    public static void main(String args[]){
        BankAccount myAcc = new BankAccount();
        myAcc.username = "swata swayam dash";
        System.out.print(myAcc.username);
        //myAcc.password = "asyf"; // this shows an error as password is private and cannot be accessed outside the class
        //error : the field BankAccount password is not visible
        myAcc.setPassword("fvyewhbf");
    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
    //setPassword function can be accessed outside the class as it is public
    //but we cannot view the password as it is private. We can only set the password
}