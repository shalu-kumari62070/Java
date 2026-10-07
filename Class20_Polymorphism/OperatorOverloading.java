
public class OperatorOverloading {
    public static void main(String[] args) {
        int a,b;
        String c,d;
        a = 10;
        b = 20;
        c = "10";
        d = "20";
        System.out.println(a + b); //30
        System.out.println(c + d); //1020
        System.out.println(b-a); // 10
        System.out.println(-b); // -20
    }
}

// NOTE:- Java does not support OperatorOverloading due to security Purpose.