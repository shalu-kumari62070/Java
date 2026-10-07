// WAP to input year and check that it is leap year or not

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year, result;
        System.out.println("Enter year = ");
        year = scan.nextInt();
        if ((year%400==0) || (year%4==0 && year%100 !=0)) {
            System.out.println("Leap year " + year);
        }else{
            System.out.println("Not Leap Year");
        }
    }    
}
