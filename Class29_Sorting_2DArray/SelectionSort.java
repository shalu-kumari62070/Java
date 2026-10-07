//Selection Sort 
import java.util.Scanner;
class SelectionSort {
    public static void main(String args[]) {
        int ar[] = new int[10];
        int i, j, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 Elements");
        for (i = 0; i < 10; i++) {
            ar[i] = scan.nextInt();
        }
        for (i = 0; i < 9; i++) { // 9 times
            for (j = i + 1; j < 10; j++) {
                if (ar[i] > ar[j]) {
                    temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            } // j
        } // i
        System.out.println("List in Sorted Order");
        for (i = 0; i < 10; i++) {
            System.out.print(ar[i] + " , ");
        }
    }
}

/*
Enter 10 Elements
34
8
44
2
88
9
67
9
66
46
List in Sorted Order
2 , 8 , 9 , 9 , 34 , 44 , 46 , 66 , 67 , 88 ,
*/
