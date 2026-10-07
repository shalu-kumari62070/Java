/*WAP to compte Area of Shape if Area=2(wh+hd+dw) 
In this Program Use 
1. Default Constructor 
2.Parametrized Call by Value Constructor 
3.Parametrized Call by Reference Constructor * */ 

class Shape{
    int w, h , d, area;
    Shape(){ // Explicit default constructor
        w = 4;
        h = 3;
        d = 5;
    }
    Shape(int x, int y, int z){ // Parametrized Call by Value Constructor
        w = x;
        h = y;
        d = z;
    }
    Shape(Shape S){ // Parametrized Call by Reference Constructor
        w = S.w;
        h = S.h;
        d = S.d;
    }
    void AreaOfShape(){
        area = 2*(w*h + h*d + d*w);
        System.out.println("Area of Shape = " + area);
    }
}

public class AllTypeConstructorUse {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        s1.AreaOfShape();
        Shape s2 = new Shape(2, 5, 8);
        s2.AreaOfShape();
        Shape s3 = new Shape(s1);
        s3.AreaOfShape();
    }
}
