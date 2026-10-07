// Program to Demonstration of static Block
// Note:- static block main() method ke phele execute ho jata hai.

// public class Employee {
//     String ename;
//     static int a = 10;
//     static {
//         System.out.println("Static Block 1");
//     }    
//     static void method1(){
//         System.out.println("Static Method 1");
//     }
//     static {
//         method1();
//         System.out.println("Static Block 2");
//     }
//     // Note:- ye all static block and method main() method ke phele execute ho jayenge  and object creatition ki v need nhi hai.
//     Employee(){
//         ename = "Shalu";
//         System.out.println("This is Constructor");
//     }
//     // Note:- yaha Employee constructor ke liye object create karna hoga
//     public static void main(String[] args) {
    
//     }
// }
/*
Static Block 1
Static Method 1
Static Block 2
*/


public class StaticBlock {
    String ename;
    static int a = 10;
    static {
        System.out.println("Static Block 1");
    }    
    static void method1(){
        System.out.println("Static Method 1");
    }
    static {
        method1();
        System.out.println("Static Block 2");
    }
    static {
        System.out.println("Static Block 3");
        System.out.println("a = " + a);
    }
    // Note:- ye all static block and method main() method ke phele execute ho jayenge  and object creatition ki v need nhi hai.
    StaticBlock(){
        ename = "Shalu";
        System.out.println("This is Constructor");
    }
    void showData(){
        System.out.println("Employee name = " + ename);
    }
    // Note:- yaha Employee constructor ke liye object create karna hoga
    public static void main(String[] args) {
        StaticBlock E = new StaticBlock();
        E.showData();
    }
}
/*
Static Block 1
Static Method 1
Static Block 2
Static Block 3
a = 10
This is Constructor
Employee name = Shalu
*/
