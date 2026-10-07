// throw keyword in Context of Pred Define Exception

import java.util.Scanner;

public class throwInContextOfPreDefineException {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a,b,res;
       try{
        System.out.println("Enter 2 Numbers");
        a = scan.nextInt();
        b = scan.nextInt();
        if(b==0){
            throw new ArithmeticException("It can not divide by 0");
        }
        res = a/b;
        System.out.println("Division = " + res);
       } 
       catch(Exception e){
        System.out.println(e.getMessage()); // It can not divide by 0
        System.out.println(e); // java.lang.ArithmeticException: It can not divide by 0
       }
       System.out.println("End of Program");
    }
}
/*
Enter 2 Numbers
8
0
It can not divide by 0
java.lang.ArithmeticException: It can not divide by 0
End of Program
*/