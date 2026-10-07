// Question: WAP to input 2 Matrices of 4*4 order and Find Addition of matrix.

//Addition of 2 Matrices of 4*4 order 

import java.util.Scanner;

public class TwoDArray1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[4][4];
        int b[][] = new int[4][4];
        int c[][] = new int[4][4];
        int i, j;
        System.out.println("Enter Matrix 1 of 4*4 Order");
        for (i = 0; i < 4; i++) { // Row
            for (j = 0; j < 4; j++) { // Column
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter Matrix 2 of 4*4 order");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                b[i][j] = scan.nextInt();
            }
        }
        System.out.println("Addition of Matrices");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

/*
Enter Matrix 1 of 4*4 Order
6       4       3       5 
7       8       5       3
1       4       5       7
8       6       4       2
Enter Matrix 2 of 4*4 order
3       4       5       2
1       2       5       7
8       3       2       6
8       3       2       5
Addition of Matrices
9       8       8       7
8       10      10      10
9       7       7       13
16      9       6       7
*/