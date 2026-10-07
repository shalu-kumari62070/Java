
class FindArea{
    double area;
    void Area(int side){
        area = side * side;
        System.out.println("Area of Square = " + area);
    }
    void Area(double r){
        area = Math.PI*r*r;
        System.out.println("Area of Circle = " + area);
    }
    void Area(int l, int b){
        area = l*b;
        System.out.println("Area of Rectangle = " + area);
    }
    void Area(double base, double height){
        area = (1/2.0)*base*height;
        System.out.println("Area of Triangle = " + area);
    }
}

public class MethodOverloading2 {
    public static void main(String[] args) {
        FindArea A = new FindArea();
        A.Area(4);
        A.Area(2.5);
        A.Area(10,20);
        A.Area(2.2, 4.5);
    }
}

/*
Area of Square = 16.0
Area of Circle = 19.634954084936208
Area of Rectangle = 200.0
Area of Triangle = 4.95
 */