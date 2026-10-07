// BufferedReader Example : - 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
    // public static void main(String[] args) throws IOException {
    //     String name;
    //     int rno;
    //     float per;
    //     InputStreamReader ir = new InputStreamReader(System.in);
    //     BufferedReader br = new BufferedReader(ir);

    //     System.out.println("Enter Student Name = ");
    //     name = br.readLine();
    
    //     System.out.println("Enter Roll Number = ");
    //     rno = Integer.parseInt(br.readLine());

    //     System.out.println("Enter percentage = ");
    //     per = Float.parseFloat(br.readLine());

    //     System.out.println("Student Name = " + name);
    //     System.out.println("Roll Number = " + rno);
    //     System.out.println("Percentage = " + per);
    // }


    // using try catach
    public static void main(String[] args) {
        try{
            String name;
            int rno;
            float per;
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);

            System.out.println("Enter Student Name = ");
            name = br.readLine();
        
            System.out.println("Enter Roll Number = ");
            rno = Integer.parseInt(br.readLine());

            System.out.println("Enter percentage = ");
            per = Float.parseFloat(br.readLine());

            System.out.println("Student Name = " + name);
            System.out.println("Roll Number = " + rno);
            System.out.println("Percentage = " + per);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }


}


// Output = 
// shalukumari@shalus-MacBook-Air CLASS3 % javac Student.java
// shalukumari@shalus-MacBook-Air CLASS3 % java Student
// Enter Student Name = 
// Shalu
// Enter Roll Number = 
// 114
// Enter percentage = 
// 99
// Student Name = Shalu
// Roll Number = 114
// Percentage = 99.0
