/* Wap to input a str and find
1. Total number of words
2. Total number of vowel
3. Total number of digits
*/

/* NOTE:- (0 to 9 ASCII)
Digits      ASCII
0           48
1           49
2           50
.
.
.
9           57
*/

import java.util.Scanner;
public class Countwordsvoweldigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str;
        int vowel=0, digit=0,words=0, asc;
        System.out.println("Enter a str");
        str = scan.nextLine();
        for(int i=0; i<str.length(); i++){
            asc = str.charAt(i);
            if (str.charAt(i)==' ') {
                words++;

            }else {
                if (str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' || str.charAt(i)=='o' || str.charAt(i)=='O' || str.charAt(i)=='u' || str.charAt(i)=='U') {
                    vowel++;
                }
                if (asc>=48 && asc<=57) {
                    digit++;
                }
            }
        }
        System.out.println("Total Words = " + (++words));
        System.out.println("Total Digit = " + digit);
        System.out.println("Total Vowels = " + vowel);
    }
}
