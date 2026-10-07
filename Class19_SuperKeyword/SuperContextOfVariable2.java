class Number {
    int a; 
    Number(int x) { 
        a=x; 
    } 
}
class Value extends Number { 
    int b; 
    Value(int x) {
        super(30);
        b=x; 
    } 
    void showdata() { 
        System.out.println("a="+a);
        System.out.println("b="+b); 
    } 
} 
public class SuperContextOfVariable2 {
    public static void main(String[] args) {
        Value v=new Value(10); 
        v.showdata(); 
    }
}

/*
a=30
b=10
*/