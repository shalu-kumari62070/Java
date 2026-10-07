package userpack;
import java.util.Date;

public class Area {
    double ar;
    public void areaCircle(double r){
        ar = Math.PI*r*r;
        System.out.println("Area of Ciccle = " + ar);
    }
    public void areaRectangle(int a, int b){
        ar = a*b;
        System.out.println("Area of Rectangle = " + ar);
    }
    public void getDate(){
        Date D = new Date();
        System.out.println("DATE & TIME: " + D.toString());
        // or
        // System.out.println("DATE & TIME: " + D);
    }
}
