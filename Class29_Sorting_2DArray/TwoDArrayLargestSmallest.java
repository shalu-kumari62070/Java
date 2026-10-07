// Question: WAP to input a Matrix and find Largest and Smallest Element of Matrix 

import java.util.Scanner;
public class TwoDArrayLargestSmallest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a[][] = new int[3][3];
        int i,j, largest, smallest;
        System.out.println("Enter Matrix Element = ");
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                a[i][j] = scan.nextInt();
            }
        }
        largest = a[0][0];
        smallest = a[0][0];
        for(i=0; i<3; i++){
            for(j=0; j<3; j++){
                if (a[i][j]>largest) {
                    largest = a[i][j];
                }
                if (a[i][j]<smallest) {
                    smallest = a[i][j];
                }
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
    }
}
/*
Enter Matrix Element = 
1       2       3
4       5       6
7       8       9
Largest = 9
Smallest = 1
*/