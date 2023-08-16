public class stringcompare{
    public static void main(String args[]){
        String s1 = "tone";
        String s2 = "tone";
        String s3 = new String("tone");

        if(s1==s2){
            //== checks wether the two quantities being compared is same at object level or not
            System.out.println("strings are equal");
            //when we create a string without new then the string points to an old string
            //hence here s2 points to s1
        }else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
        //but we only want to check the value present stored is equal or not
        //for that we use the function equals() to compare the values stored
        if(s1.equals(s3)){//returns a boolean value 
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
    }
}