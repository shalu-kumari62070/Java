/*
10.0 Write an application that keeps displaying in the command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop should not terminate (i.e., it should create an infinite loop). What happens when you run this program? 
*/

/*
answer :-
What happens when you run this program?
while(true) ki wajah se loop kabhi terminate nahi hota.
int Java mein 32-bit signed integer hota hai, jiska maximum value 2,147,483,647 hai.
Jab 1,073,741,824 × 2 hota hai, value integer range se bahar chali jaati hai.
Java mein int overflow hone par value negative ho jaati hai:
-2147483648
Uske baad:
-2147483648 × 2 = 0 (overflow)
Phir 0 × 2 = 0, isliye program 0 continuously print karta rahega.
👉 Program ko stop karne ke liye terminal mein Ctrl + C press kar sakti ho.
*/

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (true) {
            System.out.println(n);
            n = n*2;
        }
    }
}
