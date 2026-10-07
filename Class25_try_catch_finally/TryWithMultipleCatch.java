
//Program to Demonstration try with multiple  catch 
import java.io.*;

class TryWithMultipleCatch {
    public static void main(String args[]) {
        int a = 10, b = 2, res;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter 2 Numbers");
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            res = a + b;
            System.out.println("Addition=" + res);
            res = a - b;
            System.out.println("Subtraction=" + res);
            res = a / b;
            System.out.println("Division=" + res);
        } catch (ArithmeticException ae) {
            System.out.println("ERROR:It can not divide by 0");
        } catch (IOException ioe) {
            System.out.println("ERROR:IOException");
            System.out.println(ioe.getMessage());
        }
        res = a * b;
        System.out.println("Multiplication=" + res);
        System.out.println("End of Program");
    }
}
