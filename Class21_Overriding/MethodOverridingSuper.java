class Base{
    int a = 10;
    void showdata(){
        System.out.println("Actual Definition of Base Class");
        System.out.println("a = " + a);
    }
}
class Derived extends Base{
    int b = 20;
    void showdata(){
        System.out.println("Overriden Definition of Derived Class");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    void display(){
        showdata(); // yaha se Derived class wala showdata method aayega
        super.showdata(); // yaha se Base class wala showdata method aayega
    }
}

public class MethodOverridingSuper {
    public static void main(String[] args) {
        Derived D = new Derived();
        D.display();
    }
}

/*
Overriden Definition of Derived Class
a = 10
b = 20
Actual Definition of Base Class
a = 10
 */