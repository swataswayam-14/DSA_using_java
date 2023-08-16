/*
 Static keyword in Java is used to share the 
 same variable or method of a given class
 */
// we can make static the following things:
/*
 * Properties
 * Functions
 * Blocks
 * Nested Classes
 */
public class StaticKeyword{
    public static void main(String args[]){
        //here we write the static keyword before the main function 
        //as we want to create one main function
        //and the compiler finds that main function and begin its execution
        //for the class we don't want to create multiple main function hence we write the static keyword
        //the use of static keyword prevents multiple creation of things and saves memory
        Student s1 = new Student();
        s1.schoolName = "IIIT";
        Student s2 = new Student();
        System.out.println(s2.schoolName);//prints IIIT
        //if we make a variable static then if one object changes its value then it will get changed for all
        Student s3 = new Student();
        s3.schoolName = "IIT";
        //the above line of code changes the school name for all the objects
    }
}
class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    int getName(){
        return this.name;
    }
}