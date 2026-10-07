// class Number3 { 
//     int a,b; 
//     void getdata(int a,int b) { 
//         a=a; b=b;     
//     } 
//     void add() {
//         System.out.println("Value1="+a); 
//         System.out.println("Value2="+b); 
//         int c=a+b; 
//         System.out.println("Addition="+c);
//     } 
// }
// public class this3InContextOfVariable {
//     public static void main(String[] args) {
//         Number3 ob=new Number3();    
//         ob.getdata(10,20); 
//         ob.add(); 
//     }
// }
/*
Value1=0
Value2=0
Addition=0
 */

class Number3 { 
    int a,b; 
    void getdata(int a,int b) { 
        this.a=a; 
        this.b=b;     
    } 
    void add() {
        System.out.println("Value1="+a); 
        System.out.println("Value2="+b); 
        int c=a+b; 
        System.out.println("Addition="+c);
    } 
}
public class this3InContextOfVariable {
    public static void main(String[] args) {
        Number3 ob=new Number3();    
        ob.getdata(10,20); 
        ob.add(); 
    }
}
/*
Value1=10
Value2=20
Addition=30
 */