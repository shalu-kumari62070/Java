/* WAP to create a class Dimension that contains 2 sides and methods for input and output. Now create 2 sub class Rectangle and Tiangle to comput area of Respective Shapte.
 */

class Dimension{
    int s1, s2;
    void getSides(int a, int b){
        s1 = a;
        s2 = b;
    }
}

class Rectangle extends Dimension{
    int area;
    void area(){
        area = s1*s2;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Trianlge extends Dimension{
    double area;
    void area(){
        area = (1/2.0)*s1*s2;
        System.out.println("Area of Triangle = " + area);
    }
}

public class HierarchalInheritance {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.getSides(4,8);
        R.area();
        Trianlge T = new Trianlge();
        T.getSides(4, 5);
        T.area();
    }
}
