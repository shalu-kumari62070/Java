//Program to demonstration of Constructor in Inheritance 

class Base { 
    int a; 
    Base() { 
        a=10; 
        System.out.println("Default Constructor of Base Class "); 
    }
} 
class Derived extends Base {
    int b; 
    Derived() { 
        b=20; 
        System.out.println("Default Constructor of Derived Class"); 
    } 
    Derived(int x) { 
        b=x; 
        System.out.println("Parametrized Constructor of Derived Class"); 
    } 
    void showdata() { 
        System.out.println("a="+a); 
        System.out.println("b="+b); 
    } 
}
public class ConstructorInInheritance2 {
    public static void main(String[] args) {
        Derived D1=new Derived(); 
        Derived D2=new Derived(50); 
        D1.showdata(); 
        D2.showdata(); 
    }
}

/*
Default Constructor of Base Class 
Default Constructor of Derived Class
Default Constructor of Base Class 
Parametrized Constructor of Derived Class
a=10
b=20
a=10
b=50
 */