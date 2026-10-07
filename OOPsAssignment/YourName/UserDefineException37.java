// /*
// 37.0:Use a parameterized constructor of UserDefinedException class to initialize marks with the
// value, entered through the keyboard in the main( ) method of the class UserDefinedException.
// */

// package YourName;

// public class UserDefineException37 extends Exception {
//     int marks;
//     public UserDefineException37(String message, int marks){
//         super(message);
//         this.marks = marks;
//     }
//     void display(){
//         System.out.println("Marks = " + marks);
//     }
//     public static void main(String[] args) {
//         UserDefineException37 u = new UserDefineException37("MArks entered", 34);
//         u.display();
//     }
// }


// package YourName;

import java.util.Scanner;

public class UserDefineException37 extends Exception {

    int marks;

    public UserDefineException37( int marks) {
        super();
        this.marks = marks;
    }

    public void display() {
        System.out.println("Marks = " + marks);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        UserDefineException37 u =
                new UserDefineException37( marks);

        u.display();
    }
}
