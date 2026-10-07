import java.util.Scanner;

public class StringClassMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("Enter name");
        name = scan.next();
        for(int i=0; i<name.length(); i++){
            for(int j=0; j<=i; j++){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
}
/*
Enter name
shalu
s
sh
sha
shal
shalu
*/