
import java.util.Scanner;

public class LinearQueue1 {
    int front = -1;
    int rear = -1;
    int max = 10;
    int q[] = new int[max];
    Scanner scan;

    LinearQueue1() {
        scan = new Scanner(System.in);
    }

    // Insertion
    void insert() {
        if (rear == max - 1) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            System.out.println("Enter first element to insert into queue");
            q[rear] = scan.nextInt();
        } else {
            rear++;
            System.out.println("Enter element to insert into queue");
            q[rear] = scan.nextInt();
        }
    }

    // Deletion
    void delete() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            System.out.println("Deleted Eelment = " + q[front]);
            front = rear = -1;
        } else {
            System.out.println("Deleted Element = " + q[front]);
            front++;
        }
    }

    // Search
    void search() {
        int num, s = 0;
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Enter Element to be search");
            num = scan.nextInt();
            for (int i = front; i <= rear; i++) {
                if (num == q[i]) {
                    System.out.println("Element found");
                    s++;
                }
            }
            if (s == 0) {
                System.out.println("Element is not found");
            }
        }
    }

    // traverse
    void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("___________traverse____________");
            for (int i = front; i <= rear; i++) {
                System.out.println(q[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinearQueue1 q = new LinearQueue1();
        int ch;
        while (true) {
            System.out.println("1. Insert\n2. Delete\n3. Search\n4 .Display\n5. Exit");
            System.out.println("Enter your choice (1 to 5)");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    q.insert();
                    break;
                case 2:
                    q.delete();
                    break;
                case 3:
                    q.search();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
