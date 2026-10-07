class Number{
    int a = 10;
    /*
    final b;
    b = 10;
    */ // Error becuse final varibale assign value at the time declaration
    final void show(){
        System.out.println("This is Class Number and this is final method");
    }
    void display(){
        System.out.println("a = " + a);
    }
}
class Value extends Number{
    int b = 20;
    /*
    void show(){ // Error :- because final Method can not be override
        System.out.println("Hello");
    }
    */
   void display(){ // override
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("Now call parent class method");
    super.display();
   }
}

public class FinalMehtodAndVariable {
    public static void main(String[] args) {
        Value V = new Value();
        V.show();
        V.display();
    }
}
/*
This is Class Number and this is final method
a = 10
b = 20
Now call parent class method
a = 10
*/