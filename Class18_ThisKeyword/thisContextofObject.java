class Number{
    int a, b;
    void getData(int x, int y){
        a = x;
        b = y;
    }
    
    void showData(Number N){
        System.out.println("a = " + N.a);
        System.out.println("b = " + N.b);
    }
}

public class thisContextofObject {
    public static void main(String[] args) {
        Number N = new Number();
        N.getData(10, 20);
        N.showData(this);
    }
}
