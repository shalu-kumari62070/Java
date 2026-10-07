/*
6.0 Write the Java application that inputs a series of 10 integers and prints the largest integer. Your program should use at least the following three variables:  
a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input and to determine when all 10 numbers have been processed). 
b) number: The integer most recently input by the user. 
c) largest: The largest number found so far. 
*/
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        int count=0, num, largest;
        Scanner scan = new Scanner(System.in);
        largest = 0;
        System.out.println("Enter 10 number ");
        for(int i=0; i<10; i++){
            num = scan.nextInt();
            count++;
            System.out.println("Count = " + count);
            if (largest<num) {
                largest = num;
            }
        }
        System.out.println("largest = " + largest);
    }
}
/*
Enter 10 number 
55
Count = 1
44
Count = 2
32
Count = 3
2
Count = 4
456
Count = 5
90
Count = 6
3890
Count = 7
44
Count = 8
321
Count = 9
567
Count = 10
largest = 3890
*/