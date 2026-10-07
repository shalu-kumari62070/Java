// Rule 1 :- Exception class can catch all types of Exception and after having Exception class in catch, we can
// Rule 2:- The Reference Variable of Base Class can have the Object of Derived class.
// Example of Rule 2:-
/*
class Base{
}
class Derived extends Base{
}
Base B = new Derived(); // it is correct.
Derived D = new Base(); // it is incorrect. due to Rule 2.
*/
// Rule: Exception class can catch all types of Exception and after having Exception class in catch, we can not have any other catch Block. 

// Rule 1 example:- 
import java.util.Scanner;

public class ExceptionWriteRule {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int i, n;
        try {
            System.out.println("Enter index and element");
            i = scan.nextInt();
            n = scan.nextInt();
            ar[i] = n / i;
            System.out.println("Initialization is Completed");
        }catch(ArithmeticException ae){
            System.out.println("Exception: It can not divide by 0");
        }
        // Note:- Exception class lekhne ke phele hum koi v exception aur likh sakte hai lekin bad mein nhi 
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of Program");  
    }
}

/*
public class ExceptionWriteRule {
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int i, n;
        try {
            System.out.println("Enter index and element");
            i = scan.nextInt();
            n = scan.nextInt();
            ar[i] = n / i;
            System.out.println("Initialization is Completed");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        Note:- we can not write any excetpion class after writing Exception Class. we get error in output
        catch(ArithmeticException ae){
            System.out.println("Exception: It can not divide by 0");
        }
        System.out.println("End of Program");  
    }
}
*/

/*
ExceptionWriteRule.java:40: error: exception ArithmeticException has already been caught
        catch(ArithmeticException ae){
        ^
1 error
*/