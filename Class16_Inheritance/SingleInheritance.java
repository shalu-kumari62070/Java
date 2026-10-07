// Program to demonstration of Inheritance

class Base{
    private int a;
    int b; // default
    protected int c;
    public int d;
    void geta(int x){
        a = x;
    }
    void getbcd(int x, int y, int z){
        b = x;
        c = y;
        d = z;
    }
    void puta(){
        System.out.println("a = " + a);
    }
    void putbcd(){
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}

class Derived extends Base{
    int e, f;
    void getef(int x, int y){
        e = x;
        f = y;
    }
    void putef(){
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
    void showAll(){
        System.out.println("Base Class Data");
        // System.out.println("a = " + a); // Error due private 
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("Derived Class Data");
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Base B = new Base();
        Derived D = new Derived();
        B.geta(30);
        B.getbcd(40, 50, 60);
        D.getbcd(55, 66, 77);
        D.getef(10, 20);
        B.puta();
        B.putbcd();
        D.putef();
        D.showAll();
    }
}

/*
a = 30
b = 40
c = 50
d = 60
e = 10
f = 20
Base Class Data
b = 55
c = 66
d = 77
Derived Class Data
e = 10
f = 20
 */



/* when we not give any value for b,c,d
Base Class Data
b = 0
c = 0
d = 0
Derived Class Data
e = 10
f = 20
 */