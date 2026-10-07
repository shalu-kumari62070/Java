// final class modifier prevent a class to be inherit

final class Number{
    int a = 10;
    final void show(){
        System.out.println("This is Class Number and this is final method");
    }
    void display(){
        System.out.println("a = " + a);
    }
}

// class Value extends Number{ // ERROR:- beacuse Number is a fianl class so we can not extends
//     int b = 20;
//     /*
//     void show(){ // Error :- because final Method can not be override
//         System.out.println("Hello");
//     }
//     */
//    void display(){ // override
//     System.out.println("a = " + a);
//     System.out.println("b = " + b);
//     System.out.println("Now call parent class method");
//     super.display();
//    }
// }
public class FinalClass {
    public static void main(String[] args) {
        Number N = new Number();
        N.show();
        N.display();
    }
}
/*
This is Class Number and this is final method
a = 10
*/