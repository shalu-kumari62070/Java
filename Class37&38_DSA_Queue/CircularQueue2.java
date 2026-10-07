// Program for implementation of Circular Queue

import java.util.Scanner;

public class CircularQueue2 {
    int max = 10;
    int front = -1, rear = -1;
    int cq[] = new int[max];
    Scanner scan;

    CircularQueue2() {
        scan = new Scanner(System.in);
    }

    // insert
    void insert() {
        if ((rear + 1) % max == front) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            System.out.println("Enter first element to insert into circular queue");
            cq[rear] = scan.nextInt();
        } else {
            rear = (rear + 1) % max;
            System.out.println("Enter element to insert into circular queue");
            cq[rear] = scan.nextInt();
        }
    }

    // delete
    void delete() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            System.out.println("Deleted Eelment = " + cq[front]);
            front = rear = -1;
        } else {
            System.out.println("Deleted Element = " + cq[front]);
            front = (front + 1) % max;
        }
    }

    // search
    void search() {
        int num, i, s = 0;
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("Enter Element to be search");
            num = scan.nextInt();
            i = front;
            while (i != rear) {
                if (num == cq[i]) {
                    System.out.println("Element found");
                    s++;
                }
                i = (i + 1) % max;
            }
            if (num == cq[i]) {
                System.out.println("Element found");
                s++;
            }
            if (s == 0) {
                System.out.println("Element is not found");
            }
        }
    }

    // traverse
    void display() {
        int i;
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("___________traverse____________");
            i = front;
            while (i != rear) {
                System.out.println(i + " = " + cq[i]); // i= index ki value hai.
                i = (i + 1) % max;
            }
            System.out.println(cq[i]);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CircularQueue2 cq1 = new CircularQueue2();
        int ch;
        while (true) {
            System.out.println("1. Insert\n2. Delete\n3. Search\n4 .Display\n5. Exit");
            System.out.println("Enter your choice (1 to 5)");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    cq1.insert();
                    break;
                case 2:
                    cq1.delete();
                    break;
                case 3:
                    cq1.search();
                    break;
                case 4:
                    cq1.display();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
