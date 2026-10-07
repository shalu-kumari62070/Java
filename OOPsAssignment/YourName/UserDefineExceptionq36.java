/*
36.0:The class UserDefinedException contains an instance variable marks and an instance
method display( ) that prints marks.
*/

package YourName;

public class UserDefineExceptionq36 extends Exception{
     int Marks;
    public UserDefineExceptionq36(String message, int marks){
        super(message);
        Marks = marks;
    }
    public void display(){
        System.out.println("Marks = " + Marks);
    }
}