// Wap to input a filename and Print its content

import java.io.*;
import java.util.Scanner;

public class FileScanner2 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("abc.txt");
        System.out.println("File is open");
        Scanner scan = new Scanner(fr);
        while (scan.hasNext()) {
            System.out.print(scan.next()+" ");
        }
    }
}

