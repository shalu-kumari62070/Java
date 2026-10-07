import java.util.Scanner;

public class FindVowelOrConstant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        System.out.println("Enter Character to find Vowel or Constant");
        ch = scan.next().toLowerCase().charAt(0);

        // if (ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u') {
        //     System.out.println("It is Vowel " + ch);
        // }
        // else{
        //     System.out.println("It is Consonent");
        // }


        // by using switch case
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("It is Vowel");
                break;
            default:
                System.out.println("It is Consonent");
        }

    }
}
