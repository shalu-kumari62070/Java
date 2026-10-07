import java.util.*;;

public class TwoDArraySumofRightDiagonal3 {
    public static void main(String[] args) {
        int a[][] = new int[4][4];
        int i, j, right = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Matrix of 4*4 order");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                a[i][j] = scan.nextInt();
                if ((i + j) == 3) {
                    right = right + a[i][j];
                }
            }
        }
        System.out.println("Sum of Right Diagonal=" + right);
    }
}
