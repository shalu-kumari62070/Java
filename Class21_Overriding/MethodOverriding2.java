class Base{
    int a;
    void getBase(int x){
        a = x;
    }
    void display(){
        System.out.println("This is Base Class Method");
        System.out.println("a = " + a);
    }
}

class Derived extends Base{
    int b;
    void getDerived(int x){
        b = x;
    }
    void display(){ // Override
        System.out.println("This is Base Class Method and override by Derived Class");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

class MethodOverriding2 {
    public static void main(String[] args) {
        Base B = new Base();
        Derived D = new Derived();
        B.getBase(10);
        B.display();
        D.getBase(50);
        D.getDerived(60);
        D.display();
    }
}

/*
This is Base Class Method
a = 10
This is Base Class Method and override by Derived Class
a = 50
b = 60
 */
