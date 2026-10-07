// Wap to input 2 Array of 10 Element and merge these array with help of another array of 20 Element.

import java.util.Scanner;

public class MergerTwoArrayIntoOneArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar1[] = new int[10];
        int ar2[] = new int[10];
        int ar3[] = new int[20];
        System.out.println("Enter 10 Element in First Array");
        for (int i = 0; i < 10; i++) {
            ar1[i] = scan.nextInt();
        }
        System.out.println("Enter 10 Element in Second Array");
        for (int i = 0; i < 10; i++) {
            ar2[i] = scan.nextInt();
        }
        System.out.println("Merge Two array into one array");
        // Copy array 1
        for (int i = 0; i < 10; i++) {
            ar3[i] = ar1[i];
        }
        // Copy of array 2
        for(int j=0; j<10; j++){
            ar3[10+j] = ar2[j];
        }

        // Print merge array
        for(int v:ar3){
            System.out.print(v + " , ");
        }
    }
}
