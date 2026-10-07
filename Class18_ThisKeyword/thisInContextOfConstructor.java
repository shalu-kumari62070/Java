class Number{
    int a, b,c;
    Number(int x){
        a = x;
        System.out.println("This is constructor 1");
    }
    Number(int x, int y){
        this(x);
        b = y;
        System.out.println("This is constructor 2");
    }
    Number(int x, int y, int z){
        this(x,y);
        c = z;
        System.out.println("This is constructor 3");
    }
    void showData(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}


public class thisInContextOfConstructor {
    public static void main(String[] args) {
        Number N = new Number(10,20,30);
        N.showData();
    }
}
/*
This is constructor 1
This is constructor 2
This is constructor 3
a = 10
b = 20
c = 30
*/