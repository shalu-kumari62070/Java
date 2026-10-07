import java.util.Scanner;

import  userpack.Table;

public class CallingOfUserDefinePackageTable1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        System.out.println("Enter any Number to Print table ");
        n = scan.nextInt();
        Table T = new Table();
        T.table(n);
    }
}
