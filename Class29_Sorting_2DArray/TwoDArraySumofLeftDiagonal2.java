//WAP to input a Matrix of 4*4 order and Find sum of Left Diagonal 
/*
a00 a01 a02 a03 
a10 a11 a12 a13 
a20 a21 a22 a23 
a30 a31 a32 a33*/

import java.util.Scanner;

public class TwoDArraySumofLeftDiagonal2 {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        int i, j, Left = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Matrix of 4*4 order");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = scan.nextInt();
                if (i == j) {
                    Left += a[i][j];
                }
            }
        }
        System.out.println("Sum of Left Diagonal=" + Left);
    }
}


/*
Enter Matrix of 4*4 order
6       7       5       4
7       5       4       3
9       8       7       4
6       4       3       2
Sum of Left Diagonal=20
*/