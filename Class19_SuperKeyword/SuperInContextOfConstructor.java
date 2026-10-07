// class Number{
//     int a;
//     Number(int x){
//         a = x;
//     }
// }
// class Value extends Number{
//     int b;
//     Value(int x){
//         b = x;
//     }
//     void showData(){
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }
// public class SuperInContextOfConstructor{
//     public static void main(String[] args) {
//         Value v = new Value(10);
//         v.showData();
//     }
// }
// output mein error aayega kyu ki parent class ka consturtor call nhi ho raha hia kyuki parent class mein parametrized constructor hai (parametrized constructor automatically call nhi hota hai jabki non parametrized constructor automatically call ho jata ) to is problem ko solve karne ke liye super() keyword ka use karenge

class Number{
    int a;
    Number(int x){
        a = x;
    }
}
class Value extends Number{
    int b;
    Value(int x){
        super(70);// Parent class ke parameterized constructor ko call karta hai.
        b = x;
    }
    void showData(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
public class SuperInContextOfConstructor{
    public static void main(String[] args) {
        Value v = new Value(10);
        v.showData();
    }
}
/*
output = 
when super(70) then a = 70 and b = 10
when super(x) then a = 10 and b = 10
 */


// class Number{
//     int a;
//     Number(){
//         System.out.println("This is non parametried constructor");
//     }
//     Number(int x){
//         a = x;
//     }
// }
// class Value extends Number{
//     int b;
//     Value(int x){
//         // super(); // super() is optional because parent class has a no-argument constructor. Java automatically inserts super() if we don't write it.
//         b = x;
//     }
//     void showData(){
//         System.out.println("a = " + a);
//         System.out.println("b = " + b);
//     }
// }
// public class SuperInContextOfConstructor{
//     public static void main(String[] args) {
//         Value v = new Value(10);
//         v.showData();
//     }
// }

/*
This is non parametried constructor
a = 0
b = 10
 */