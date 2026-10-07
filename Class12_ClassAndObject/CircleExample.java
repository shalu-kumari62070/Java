// WAP to create a class Circle , Now initialize value of radius and compute Area, Circumference using Class and Object *

class Circle {
    double r, ar, cr;

    void getRadius(double x) {
        r = x;
    }

    void area() {
        ar = Math.PI * r * r;
        System.out.println("Area of Circle=" + ar);
    }

    void circum() {
        cr = 2 * Math.PI * r;
        System.out.println("Circumference=" + cr);
    }
}

public class CircleExample {
    public static void main(String args[]) {

        Circle ob=new Circle();
        ob.getRadius(8.5);
        ob.area();
        ob.circum();
    }
}
