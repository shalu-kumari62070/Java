import java.text.ListFormat.Style;
import java.util.Scanner;

public class Stack1 {
    int top = -1;
    int max = 10;
    int st[] = new int[max];
    // Scanner scan = new Scanner(System.in);
    // or
    Scanner scan;

    Stack1() {
        scan = new Scanner(System.in);
        // or
        // Scanner scan = new Scanner(Style.int);
    }

    // add element
    void push() {
        if (top == max - 1) {
            System.out.println("Overflow");
        } else {
            System.out.println("Enter the element to be push");
            top++;
            st[top] = scan.nextInt();
        }
    }

    // delete element
    void pop() {
        if (top == -1) {
            System.out.println("Underflow");
            System.out.println("There is no elemetn to remove");
        } else {
            System.out.println("Poped Element = " + st[top]);
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Top/Peek Element = " + st[top]);
        }
    }

    // Traverse element
    void traverse() {
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("_______traverse___________");
            for (int i = top; i >= 0; i--) {
                System.out.println(st[i]);
            }
        }
    }

    void search() {
        int num, s = 0;
        System.out.println("Enter number for search");
        num = scan.nextInt();
        if (top == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("_____Search Element_____");
            for (int i = top; i >= 0; i--) {
                if (num == st[i]) {
                    System.out.println("Number found");
                    s++;
                }
            }
            if (s == 0) {
                System.out.println("Number not found");
            }
        }
    }

    public static void main(String[] args) {
        int ch;
        Scanner scan = new Scanner(System.in);
        Stack1 s = new Stack1();
        while (true) {
            System.out.println("1. Push\n 2.Pop\n 3.Traverse\n 4.Peek\n 5.Search\n 6.Exit");
            System.out.println("Enter your choice (1 to 6)");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    s.peek();
                    break;
                case 4:
                    s.search();
                    break;
                case 5:
                    s.traverse();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
}
