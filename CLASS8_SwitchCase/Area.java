import java.util.Scanner;

public class Area {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int r,side,len,bth,base,h,ch;
        System.out.println("1.Area of Circle \n2.Area of square \n3.Area of Rectangle \n4.Area of Triangle");
        System.out.println("Enter your Choice = ");
        ch = scan.nextInt();
        switch (ch) {
            case 1:{
                System.out.println("Enter Radius = ");
                r = scan.nextInt();
                System.out.println("Area of Circle = " + (Math.PI*r*r));
                break;
            }
            case 2:{
                System.out.println("Enter Side = ");
                side = scan.nextInt();
                System.out.println("Area of Square = " + (side*side));
                break;
            }
            case 3:{
                System.out.println("Enter Length = ");
                len = scan.nextInt();
                System.out.println("Enter Breadth = ");
                bth = scan.nextInt();
                System.out.println("Area of Rectangle = " + (len*bth));
                break;
            }
            case 4:{
                System.out.println("Enter Base = ");
                base = scan.nextInt();
                System.out.println("Enter Height = ");
                h = scan.nextInt();
                System.out.println("Area of  Triangle = " + ((1.0/2)*base*h));
                break;
            }
            default:
                System.out.println("Enter Valid Number from 1 to 4");
                break;
        }
    }
}
