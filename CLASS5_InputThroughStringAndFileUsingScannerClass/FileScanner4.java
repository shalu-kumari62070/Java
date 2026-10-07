import java.io.FileReader;
import java.util.Scanner;

public class FileScanner4 {

    public static void main(String[] args) throws Exception {
        String filename;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter File Name");
        filename = scan1.nextLine();
        FileReader fr = new FileReader(filename);
        Scanner scan2 = new Scanner(fr);
        if (!scan2.hasNext()) {
            System.out.println("Empty File");
        }
        while (scan2.hasNext()) {
            System.out.println(scan2.nextLine());
        }
    }
    
}