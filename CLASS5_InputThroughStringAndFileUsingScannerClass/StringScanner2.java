// WAP to take an input using String in Scanner Class. if this String contains multiple type data then Now print only int type Element with sum and Average

import java.util.Scanner;

public class StringScanner2 {
    public static void main(String[] args) {

        String str;
        str = "10 20 30 James 60.5 william 80 70.8 Velly 90";
        int total = 0, count = 0, avg;
        Scanner scan = new Scanner(str);

        System.out.println("____OUTPUT");

        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                // total = total + scan.nextInt();
                // count ++;
                // or 
                int value = scan.nextInt();
                System.out.println("Value = " + value);
                total = total + value;
                count ++;
            }else{
                scan.next();
            }
        }
        avg = total/count;
        System.out.println("Count = "+ count);
        System.out.println("Sum = " + total);
        System.out.println("Average = " + avg);

    }
}


// ____OUTPUT
// Value = 10
// Value = 20
// Value = 30
// Value = 80
// Value = 90
// Count = 5
// Sum = 230
// Average = 46