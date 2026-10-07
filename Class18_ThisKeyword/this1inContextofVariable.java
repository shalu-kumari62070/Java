// Without this keyword
// class Number{
//     int a, b;
//     void getData(int a, int b){
//         a = a;
//         b = b;
//     }
//     void showData(){
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }
// public class this1inContextofVariable {
//     public static void main(String[] args) {
//         Number N = new Number();
//         N.getData(10,20);
//         N.showData();
//     }
// }
/*
a = 0
b = 0
 */


// With this keyword
class Number{
    int a, b;
    void getData(int a, int b){
        this.a = a;
        this.b = b;
    }
    void showData(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
public class this1inContextofVariable {
    public static void main(String[] args) {
        Number N = new Number();
        N.getData(10,20);
        N.showData();
    }
}
/*
a = 10
b = 20
 */
