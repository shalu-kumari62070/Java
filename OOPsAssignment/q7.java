/*
7.0 Using an approach similar to that for question 6.0, find the two largest values of the 10 values entered. [Note: You may input each number only once.] 
*/

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        int count=0, num, largest1, largest2;
        Scanner scan = new Scanner(System.in);
        largest1 = 0;
        largest2 = 0;
        System.out.println("Enter 10 number ");
        for(int i=0; i<10; i++){
            num = scan.nextInt();
            count++;
            System.out.println("Count = " + count);
            if (num>largest1) {
                largest2 = largest1;
                largest1 = num;
            }else if (num>largest2) {
                largest2 = num;
            }
        }
        System.out.println("largest1 = " + largest1);
        System.out.println("Largest2 = " + largest2);
    }
}
/*
Enter 10 number 
34
Count = 1
45
Count = 2
23
Count = 3
12
Count = 4
56
Count = 5
78
Count = 6
90
Count = 7
66
Count = 8
44
Count = 9
900
Count = 10
largest1 = 900
Largest2 = 90
*/