// try with finally
// NOTE:- exception rahe ya na rahe finally block execute hoga.

public class Exception2UsingTryAndFinally {
    public static void main(String[] args) {
        int a = 10, b = 0, res;
        try{
            res = a+b;
            System.out.println("Addition = " + res);
            res = a-b;
            System.out.println("Subtraction = " + res);
            res = a/b;
            System.out.println("Divide = " + res);
        }
        finally{
            res = a*b;
            System.out.println("Multiplication = " + res);
        }
        System.out.println("End of Program");
    }
}
/*
Addition = 10
Subtraction = 10
Multiplication = 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Exception2UsingTryAndFinally.main(Exception2UsingTryAndFinally.java:11)
*/