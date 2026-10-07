//exception rahe ya na rahe finally block execute hoga.
// yaha exception nhi hai phir v finally block execute ho raha hai.

public class Exception3UsingTryAndFinally {
    public static void main(String[] args) {
        int a = 10, b = 3, res;
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
    }
}
/*
Addition = 13
Subtraction = 7
Divide = 3
Multiplication = 30
*/