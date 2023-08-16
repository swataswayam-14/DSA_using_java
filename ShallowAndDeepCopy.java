

/*
 * in shallow copy we copy only the references 
 *      that is we don't create a new object 
 *      in shallow copy changes reflect
 * in deep copy we create a new object 
 *      changes don't reflect in deep copy
 */
public class ShallowAndDeepCopy{
    public static void main(String args[]){
        // create a new student object
        Student s1 = new Student();
        s1.name = "swayam";
        s1.roll = 60;
        s1.marks[0] = 98;
        s1.marks[1] = 95;
        s1.marks[2] = 99;

        // create a new student object using the copy constructor
        Student s2 = new Student(s1);

        // update a value in the original student object
        s1.marks[2] = 100;

        // print the marks of the copied student object
        for(int i = 0; i < s2.marks.length; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    // copy constructor that performs a deep copy of the object
    Student(Student s1){
        // create a new array for marks
        marks = new int[3];

        // copy the values of name and roll from the original object
        this.name = s1.name;
        this.roll = s1.roll;

        // perform a deep copy of the marks array
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}