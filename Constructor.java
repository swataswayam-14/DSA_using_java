/*
 * TYPES OF CONTRUCTOR:-
 * non-parameterized:- we don't take any arguments or parameter in it
 * parameterized:- here we take a parameter
 * Copy Constructor
 */
public class Constructor{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("Swayam");
        Student s3 = new Student(60);
       // Student s4 = new Student("swayam ",87)//this line gives an error as this constructor doesn't exist
        System.out.println("Name:-"+s2.name);
        System.out.println("roll no.:-"+s3.roll);

    }
}
class Student{
    String name;
    int roll;

    Student(){//this is a non-parameterised constructor
        System.out.println("cnstructor is called....");
    }
    //below constructors are parameterised constructors
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}
// on creating a new object, the constructor which is created and called by itself
// this is called constructor overloading
//this is an example of polymorphism( means multiple forms )
