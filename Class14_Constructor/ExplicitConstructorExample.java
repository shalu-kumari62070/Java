/* WAP to compute Area of Triangle if all 3 sides are entered through Keyboard using Constructor */ 

import java.util.Scanner;

class Trianlge{
    int a,b,c;
    double s, ar;
    Trianlge(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 sides of Triangle");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
    }
    void AreaOfTriangle(){
        s = (a+b+c)/2.0;
        ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle = " + ar);
    }
}
public class ExplicitConstructorExample {
    public static void main(String[] args) {
        Trianlge T = new Trianlge();
        T.AreaOfTriangle();
    }
}
