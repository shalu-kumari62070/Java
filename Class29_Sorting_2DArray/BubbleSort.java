import java.util.*;;

class BubbleSort {
    public static void main(String args[]) {
        int ar[] = new int[10];
        int i, j, temp;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 Elements");
        for (i = 0; i < 10; i++) {
            ar[i] = scan.nextInt();
        }
        for (i = 0; i < 9; i++) { // 9 times
            for (j = 0; j < 9; j++) {
                if (ar[j] > ar[j + 1]) {
                    temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
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
45
56
78
3
4
67
90
9
23
45
List in Sorted Order
3 , 4 , 9 , 23 , 45 , 45 , 56 , 67 , 78 , 90 ,
*/