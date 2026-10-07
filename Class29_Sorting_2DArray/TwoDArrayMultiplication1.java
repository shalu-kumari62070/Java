// Question: WAP to input 2 Matrices of 3*3 order and find its Multiplication 

import java.util.Scanner;

public class TwoDArrayMultiplication1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i,j;
        System.out.println("Enter Matrix 1 of Element = ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j] = scan.nextInt();
            }
        }

        System.out.println("Enter Matrix 2 of Element = ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                b[i][j] = scan.nextInt();
            }
        }

        System.out.println("Multipilcation of 2 Array ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                c[i][j] = 0;
                for(int k=0; k<3; k++){
                    c[i][j] = c[i][j] + a[i][k]*b[k][j];
                }
            }
        }

        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
Enter Matrix 1 of Element = 
2       4       5
6       8       9
4       6       8
Enter Matrix 2 of Element = 
4       7       2
8       6       2
9       7       1
Multipilcation of 2 Array 
85 73 17 
169 153 37 
136 120 28 
*/
