/* WAP to compute roots of quadratic Equation using Constructor Overloading
 */
class Roots{
    int a, b, c, d;
    double r1, r2;
    Roots(){
        a = 5;
        b = 9;
        c = -4;
    }
    Roots(int x, int y, int z){
        a = x;
        b = y;
        c = z;
    }
    Roots(Roots R){
        a = R.a;
        b = R.b;
        c = R.c;
    }
    void Result(){
        d = b*b-4*a*c;
        if(d>0){
            r1 = (-b + Math.sqrt(d)/(2*a));
            r2 = (- b - Math.sqrt(d)/(2*a));
            System.out.println("Root 1 = " + r1);
            System.out.println("Root 2 = " + r2);
        }else if (d==0) {
            r1 = (-b/(2*a));
            System.out.println("Both Roots are = " + r1);
        }else{
            System.out.println("No Real Root");
        }
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Roots R1 = new Roots();
        R1.Result();

        System.out.println("Parametrized Constructor Result");
        Roots R2 = new Roots(5,9,10);
        R2.Result();

        System.out.println("Object Constructor Result");
        Roots R3 = new Roots(R2);
        R3.Result();
    }
}
/*
Root 1 = -7.7311422459550485
Root 2 = -10.268857754044951
Parametrized Constructor Result
No Real Root
Object Constructor Result
No Real Root
 */