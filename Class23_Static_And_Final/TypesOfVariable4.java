// Program to Demonstration of "Variable Types in Java"
class Number{
    int a; // Instance Variable
    static int c = 80; // class Variable
    void getData(int x, int y){
        int b; // Local Variable
        a = x;
        b = y;
    }
    void putdata(){
        System.out.println("a = " + a);
        //System.out.println("b = " + b); // Error
        System.out.println("c = " + c);
    }
}
public class TypesOfVariable4 {
    public static void main(String args[]){
        Number N; // Reference Variable
        N = new Number();
        System.out.println("a = " + N.a);
        N.getData(10, 20);
        N.putdata();
    }   
}
/*
a = 0
a = 10
c = 80
*/