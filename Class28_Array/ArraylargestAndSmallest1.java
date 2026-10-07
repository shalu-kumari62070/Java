import java.util.Scanner;

public class ArraylargestAndSmallest1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int largest, smallest;
        System.out.println("Enter Element of array");
        for(int i=0; i<10; i++){
            ar[i] = scan.nextInt();
        }
        largest = ar[0];
        smallest = ar[0];
        for(int i=1; i<ar.length; i++){
            if (ar[i]>largest) {
                largest = ar[i];
            }
            if (ar[i]<smallest) {
                smallest = ar[i];
            }
        }
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);

    }
}
