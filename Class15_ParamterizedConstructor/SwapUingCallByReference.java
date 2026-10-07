//Program to demonstration of Parametrized Constructor using Call by Reference

class Number{
    int a,b;
    Number(){ // Default Constructor
        a = 10;
        b = 20;
    }
    Number(Number N){
        a = N.a;
        b = N.b;
    }
    void swap(){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    void showData(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class SwapUingCallByReference {
   public static void main(String[] args) {
    Number N1 = new Number();
    Number N2 = new Number(N1);
    N1.swap();
    System.out.println("After Swapping");
    N1.showData();
    System.out.println("Actual data ");
    N2.showData();
   } 
}
