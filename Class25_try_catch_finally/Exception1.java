// Program to Demonstration of Exception

/*
public class Exception1 {
    public static void main(String[] args) {
        int a = 10, b = 0, res;
        res = a+b;
        System.out.println("Addition = " + res);
        res = a-b;
        System.out.println("Subtraction = " + res);
        res = a/b;
        System.out.println("Divide = " + res);
        res = a*b;
        System.out.println("Multiplication = " + res);
    }
}
*/
/*
Addition = 10
Subtraction = 10
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception1.main(Exception1.java:10)
*/

// Now solve this problem using try and catch block__________________________________
public class Exception1 {
    public static void main(String[] args) {
        int a = 10, b = 0, res;
        res = a+b;
        System.out.println("Addition = " + res);
        res = a-b;
        System.out.println("Subtraction = " + res);
        try{
            res = a/b;
            System.out.println("Divide = " + res);
        }catch(Exception e){
            e.printStackTrace();
        }
        res = a*b;
        System.out.println("Multiplication = " + res);
    }
}
/*
Addition = 10
Subtraction = 10
java.lang.ArithmeticException: / by zero
        at Exception1.main(Exception1.java:56)
Multiplication = 0
*/


/*
public class Exception1 {
    public static void main(String[] args) {
        int a = 10, b = 2, res;
        res = a+b;
        System.out.println("Addition = " + res);
        res = a-b;
        System.out.println("Subtraction = " + res);
        res = a/b;
        System.out.println("Divide = " + res);
        res = a*b;
        System.out.println("Multiplication = " + res);
    }
}
*/
/*
Addition = 12
Subtraction = 8
Divide = 5
Multiplication = 20
*/