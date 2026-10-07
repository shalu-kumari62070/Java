import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int i, n;
        try{
            try{
                System.out.println("Enter index and element");
                i = scan.nextInt();
                n = scan.nextInt();
            }catch(Exception e){
                System.out.println("Exception: Invalid Input");
                System.out.println("Re Enter Index and Element");
                scan = new Scanner(System.in);
                i = scan.nextInt();
                n = scan.nextInt();
            }
            ar[i] = n/i;
            System.out.println("Initialization is Completed");
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("End of Program");
    }
}
