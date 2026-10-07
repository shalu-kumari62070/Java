class A {
    int a=10; 
} 
class B extends A { 
    int b=20; 
}

class C extends B { 
    int c=30; 
    void showdata() { 
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c); 
    } 
} 
public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        C ob=new C(); 
        ob.showdata(); 
    }
}

/*
a=10
b=20
c=30
 */