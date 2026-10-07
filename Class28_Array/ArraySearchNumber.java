// Wap to input 10 Element of Array and Search an Element with its position.

import java.util.Scanner;

public class ArraySearchNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int num, s=0;
        System.out.println("Enter 10 Element");
        for(int i=0; i<10; i++){
            ar[i] = scan.nextInt();
        }
        System.out.print("Enter number you want to search = ");
        num = scan.nextInt();
        for(int i=0; i<10; i++){
            if (num==ar[i]) {
                s++;
                System.out.println("Number is found");
                System.out.println("Position of Number is = " + (i+1));
            }
        }
        if (s==0) {
            System.out.println("Number is not found");
        }
    }
}
