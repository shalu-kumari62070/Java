// User Define Exception

import java.util.InputMismatchException;
import java.util.Scanner;

class AmountException extends Exception{
    AmountException(){
        // super(); //parent constructor call
        super("Please Enter Amount in Multiple of 100"); // parent constructor Ko custom message de rahe hai
    }
}

public class UserDefineException1 {
    public static void main(String[] args) {
        int amt;
        Scanner scan = new Scanner(System.in);
        try{
            System.out.println("Enter The Amount");
            amt = scan.nextInt();
            if (amt%100!=0) {
                throw new AmountException();
            }
            System.out.println("Processing");
        }catch(AmountException ae){
            ae.printStackTrace();
        }catch(InputMismatchException ie){
            ie.printStackTrace();
        }
    }
}

// super(); //parent constructor call

