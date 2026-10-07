// Question: WAP to input a matrix   of 4*5 order and find its Transpose Matrix. 

import java.util.Scanner;

public class TwoDArrayTransposeMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[4][5];
        int i,j;
        System.out.println("Enter Matrix Element = ");
        for(i=0; i<4; i++){
            for(j=0; j<5; j++){
                a[i][j] = scan.nextInt();
            }
        }
        for(i=0; i<5; i++){ // Transpose ki rows
            for(j=0; j<4; j++){ // Transpose ke columns
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
/*
Enter Matrix Element = 
1       2       3       4       5
6       7       8       9       10
11      12      13      14      15
16      17      18      19      20
1 6 11 16 
2 7 12 17 
3 8 13 18 
4 9 14 19 
5 10 15 20
*/
