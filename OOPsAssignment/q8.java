/*
8.0 Write an application that prompts the user to enter the size of the side of a square, then displays a hollow square of that size made of asterisks(*). Your program should work for squares of all side lengths between 1 and 20. 
*/

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int side;
        System.out.println("Enter side of a square");
        side = scan.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || j==side-1 || i==side-1 || j==0 ) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
