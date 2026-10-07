// Demonstration of super keyword context of Constructor

class University{
    String uname;
    University(String str){
        uname = str;
        System.out.println("This is class Univeersity");
    }
    void show1(){
        System.out.println("University Name = " + uname);
    }
}
class College extends University{
    String cname;
    College(String str1, String str2){
        super(str1);
        cname = str2;
        System.out.println("This is class College");
    }
    void show2(){
        this.show1(); 
        // this current object ko refer karta hai
        // show1() University class ka inherited method hai
        // Isliye University ka show1() execute hoga
        System.out.println("College Name = " + cname);
    }
}
class Student extends College{
    String sname;
    Student(String str1, String str2, String str3){
        super(str1, str2);
        sname = str3;
        System.out.println("This is class Student");
    }
    void show3(){
        this.show2();
        System.out.println("Student Name = " + sname);
    }
}

public class SuperInContextOfConstructor1 {
    public static void main(String[] args) {
        Student S = new Student("AKTU", "BN College", "Shalu");
        S.show3();
    }
}
/*
This is class Univeersity
This is class College
This is class Student
University Name = AKTU
College Name = BN College
Student Name = Shalu
*/