// WAP to input source File(exist) and destination File(new File), Now Copy data of File1 into File2

import java.io.*;
import java.util.Scanner;

public class FileScanner5 {
    public static void main(String[] args) throws Exception {
        String filename;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter File name");
        filename = scan1.next();

        FileReader fr = new FileReader(filename);
        Scanner scan2 = new Scanner(fr);

        FileWriter fw = new FileWriter("destiantion.txt");
        System.out.println("File has crated");

        if (!scan2.hasNext()) {
            System.out.println("Empty file");
        }
        while(scan2.hasNext()) {
            // System.out.println(scan2.nextLine());
            fw.write(scan2.next());
        }
        fw.close();
        fr.close();
    }
}


