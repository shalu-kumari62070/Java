// Question WAP to Construct and print identity matrix of 4*4 order.

import java.util.Scanner;

public class TwoDArrayIdentityMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,m,i,j;
        System.out.println("Enter the value of n and m");
        n = scan.nextInt();
        m = scan.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Identity Matrix");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                if (i==j) {
                   a[i][j] = 1; 
                }else{
                    a[i][j] = 0;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
Enter the value of n and m
4
4
Identity Matrix
1 0 0 0 
0 1 0 0 
0 0 1 0 
0 0 0 1 
*/
