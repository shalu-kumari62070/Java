import java.util.Scanner;
public class QuadritcEquation {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        double d,root1, root2;
        System.out.println("Enter the value of a = ");
        a = scan.nextInt();
        System.out.println("enter the value of b = ");
        b = scan.nextInt();
        System.out.println("Enter the value of c = ");
        c = scan.nextInt();
        
        d = b*b-4*a*c;
        System.out.println("d = " + d);
        
        if(d>0){
            root1 = (-b+Math.sqrt(d))/(2*a);
            root2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("Root1 = " + root1);
            System.out.println("Root2 = " + root2);
        }else if(d==0){
            root1 = b/(2*a);
            System.out.println("Both Roots are "+ root1);
        }else if(d<0){
            System.out.println("No Real Roots");
        }
    }
}