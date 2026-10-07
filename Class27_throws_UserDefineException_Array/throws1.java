import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Note:- throws work alternative of try and catch

// by try and catch
// public class throws1 {
//     public static void main(String[] args) {
//         int a, b, res;
//         String name;
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         try{
//             a = Integer.parseInt(br.readLine());
//             b = Integer.parseInt(br.readLine());
//             res = a/b;
//             System.out.println("Division = " + res);
//         }catch(IOException ioe){
//             System.out.println(ioe);
//         }catch(ArithmeticException ae){
//             System.out.println(ae);
//         }catch(NumberFormatException ne){
//             System.out.println("Please enter integer value only " + ne);
//         }// NumberFormatException:- it is similar to InputMismatchException 
//     }
// }

//Note=> NumberFormatException is similar to InputMismatchException

//NOW Solve by using throws____________________________________________________________________________
public class throws1 {
    // public static void main(String[] args)throws Exception 
    // or 
    // public static void main(String[] args)throws IOException
    // or
    public static void main(String[] args)throws IOException, ArithmeticException, NumberFormatException
    {
        int a, b, res;
        String name;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            res = a/b;
            System.out.println("Division = " + res);
    }
}