// if Area of a shape = 2(wh + hd + dw), then input values of w,h,d and compute Area of Shape

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter Width = ");
        // int w = scan.nextInt();
        // System.out.println("Enter Height = ");
        // int h = scan.nextInt();
        // System.out.println("Enter Dimension = ");
        // int d = scan.nextInt();
        // System.out.println("Area of Shape = " + (2*(w*h + h*d + d*w)));


        // using commanline input
        int w = Integer.parseInt(args[0]);
        int h = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        System.out.println("Area of Shape = " + (2*(w*h + h*d + d*w)));
    }
}


// shalukumari@shalus-MacBook-Air CLASS2 % javac Area.java
// shalukumari@shalus-MacBook-Air CLASS2 % java Area
// Enter Width = 
// 3
// Enter Height = 
// 4
// Enter Dimension = 
// 5
// Area of Shape = 94 