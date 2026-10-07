/*WAP to compute Area of Rectangle, if sides are initialized using Explicit Constructor */ 

class Rectangle{
    int a,b,ar;
    Rectangle(){
        a = 5;
        b = 8;
        System.out.println("Welcome in Class Rectangle");
    }
    void area(){
        ar = a*b;
        System.out.println("Area of Rectangle = " + ar);
    }
}

public class ExplicitDefaultConstructor {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.area();
    }
}


// Welcome in Class Rectangle
// Area of Rectangle = 40
