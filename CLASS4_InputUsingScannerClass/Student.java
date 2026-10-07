// WAP to input Student Name, Roll Number, Percentage and print all values.

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        String name;
        int rno;
        float per;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name = ");
        name = scan.next();
        System.out.println("Enter Roll Number");
        rno = scan.nextInt();
        System.out.println("Enter Percentage = ");
        per = scan.nextFloat();
        System.out.println("Student Name = " + per);
        System.out.println("Roll Number = " + rno);
        System.out.println("Percentage = " + per);
    }
}
