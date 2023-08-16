/*
 * we get copy constructor in C++ by default
 * but in java we don't get a copy constructor by default
 * if we want to make a copy constructor we have to create it by ourselves
 */
//working of copy constructor:
/*
 * copying every property of one object to another object
 * 
 */
public class CopyConstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "swayam";
        s1.roll = 354;
        s1.password = "asdgf";
        s1.marks[0]=97;
        s1.marks[1]=99;
        s1.marks[2]=100;
        Student s2 = new Student(s1);//copy
        s1.marks[2] = 80;
        s2.password = "egfskjb";
        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
        
    }
}
class Student{
    int marks[];
    String name;
    int roll;
    String password;

    Student() {
        marks = new int[3];
    }

    Student(Student s1){
        marks = new int[3];
        this.marks = s1.marks;//this is not a deep copy
        //it refers to the marks array of s1
        //hence when we change the marks in s1 it will reflect in s2 even when we change it after copy code
        //the above line of code is a shallow copy
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}