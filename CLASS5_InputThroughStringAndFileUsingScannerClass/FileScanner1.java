import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;


public class FileScanner1 {
    public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("abc.txt");
    fw.write("Java is a Platform Independent Programming Language");
    System.out.println("File is Created");
    fw.close();
    FileReader fr = new FileReader("abc.txt");
    Scanner scan = new Scanner(fr);
    while (scan.hasNext()) {
        System.out.print(scan.next()+" ");
    }
    }
}

// OUTPUT = 
// File is Created
// Java is a Platform Independent Programming Language % 
