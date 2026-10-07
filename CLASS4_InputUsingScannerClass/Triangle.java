import java.util.Scanner;

public class Triangle {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        double s, areaOfTriangle;
        System.out.println("Enter the value of a = ");
        a = scan.nextInt();
        System.out.println("Enter the value of b = ");
        b =scan.nextInt();
        System.out.println("Enter the value of c = ");
        c = scan.nextInt();
        s = (a+b+c)/2.0;
        System.out.println("Side = " + s );
        areaOfTriangle = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        System.out.println("Area of Trianlge = " + areaOfTriangle);
    }
}
