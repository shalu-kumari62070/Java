// WAP to create a class Triangle, Now input 3 sides of Triangle from Keyboard and compute Area of Triangle using class and Object. 

class Triangle{
    int a,b,c;
    double s, areaTriangle;
    
    void getSides(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }

    void AreaOfTriangle(){
        s = (a + b + c) / 2.0;
        areaTriangle = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of Triangle = " + areaTriangle);
    }
}


public class Task {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getSides(8,7,9);
        t.AreaOfTriangle();
    }
}
