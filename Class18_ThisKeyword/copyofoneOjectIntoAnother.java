class Number{
    int a, b;
    void getData(int x, int y){
        a = x;
        b = y;
    }
    void copy(Number N){
        a = N.a;
        b = N.b;
    }
    void showData(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
public class copyofoneOjectIntoAnother {
    public static void main(String[] args) {
        Number N1 = new Number();
        Number N2 = new Number();
        N1.getData(10, 20);
        N2.copy(N1);
        N1.showData();
        N2.showData();
    }
}
/*
a = 10
b = 20
a = 10
b = 20
 */
