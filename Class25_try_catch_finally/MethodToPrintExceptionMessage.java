// There are 4 method to Print Exception Message

public class MethodToPrintExceptionMessage {
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
        catch(ArithmeticException ae){
            System.out.println("Method 1:- It can not divide by 0");
            System.out.println("Method 2:- " + ae.getMessage());
            System.out.println("Method 3:- " + ae);
            System.out.println("Method 4:- ");
            ae.printStackTrace();
        }
        res = a*b;
        System.out.println("Multiplication = " + res);
        System.out.println("End of Program");
    }
}
/*
Addition = 10
Subtraction = 10
Method 1:- It can not divide by 0
Method 2:- / by zero
Method 3:- java.lang.ArithmeticException: / by zero
Method 4:- 
java.lang.ArithmeticException: / by zero
        at MethodToPrintExceptionMessage.main(MethodToPrintExceptionMessage.java:11)
Multiplication = 0
End of Program
*/