/*WAP to create a class Student, Now input Student Name, Roll Number and Marks of 3 Subjects and generate the marksheet of Student.(Implement this program for 3 Students) */

import java.util.Scanner;

class Student{
    String name,div;
    double per;
    int total,rno, m1,m2,m3;

    void getStudentData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student name = ");
        name = scan.next();
        System.out.println("Enter Student Roll Number = ");
        rno = scan.nextInt();
        System.out.println("Enter marks of 3 subject = ");
        m1 = scan.nextInt();
        m2 = scan.nextInt();
        m3 = scan.nextInt();

        marksheet();
    }

    void marksheet(){
        total = (m1+m2+m3);
        per = total/3.0;
        if(per>=60) 
            div="First Division"; 
        else if(per>=45) 
            div="Second Division"; 
        else if(per>=33) 
            div="Third Division"; 
        else 
            div="Fail"; 

        System.out.println("_____________________________________________________");

        System.out.println("Student Name = "+name); 
        System.out.println("Roll Number = "+rno); 
        System.out.println("Total Marks = "+total); 
        System.out.println("Percentage = "+per); 
        System.out.println("Division = " + div);
    
    }
}

public class StudentExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.getStudentData();
    }
}
