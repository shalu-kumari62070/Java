class Base { 
    int a=10,b=20; 
} 
class Derived extends Base { 
    int a=50,b=70; 
    void showdata() { 
        System.out.println("a="+a); 
        System.out.println("b="+b); 
        System.out.println("a="+super.a);
        System.out.println("b="+super.b); 
    } 
} 
public class SuperInContextOfVariable {
    public static void main(String args[]) { 
        Derived D=new Derived(); 
        D.showdata(); 
    } 
}

/*
a=50
b=70
a=10
b=20
*/