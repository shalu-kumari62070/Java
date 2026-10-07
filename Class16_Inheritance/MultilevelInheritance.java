/* Wap to demonstrate Multilevel Inheritance
 */

class First{
    int a, b;
    void getab(int x, int y){
        a = x;
        b = y;
    }
    void sum(){
        int sum;
        sum = a+b;
        System.out.println("Sum = " + sum);
    }
}

class Second extends First{
    int multiply;
    void multiplication(){
        multiply = a*b;
        System.out.println("Multiplication of a and b = " + multiply);
    }
}

class Third extends Second{
    int div;
    void division(){
        div = a/b;
        System.out.println("Division = " + div);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
     Second S = new Second();
     S.getab(10, 20);
     S.multiplication();
     Third T = new Third();
     T.getab(40,20);
     T.division();   
    }
}

/*
Multiplication of a and b = 200
Division = 2
 */