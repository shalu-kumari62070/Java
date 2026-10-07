
// Implementation of DQueue
import java.util.*;

public class DoubleEndedQueue3 {
    int max = 10, front = -1, rear = -1;
    int dq[] = new int[max];
    Scanner scan;

    DoubleEndedQueue3(){
        scan = new Scanner(System.in);
    }

    // insert from front
    void insert_front() {
        if (front == 0) {
            System.out.println("Overflow:- It can not insert from front");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            System.out.println("Enter first element from front to insert into Double Ended queue");
            dq[front] = scan.nextInt();
        } else {
            front--;
            System.out.println("Enter the Element from front to be insert");
            dq[front] = scan.nextInt();
        }
    }

    // insert from rear
    void insert_rear() {
        if (rear == max - 1) {
            System.out.println("Overflow:- It can not insert from rear");
        } else if (front == -1 & rear == -1) {
            front = rear = 0;
            System.out.println("Enter first element from front to insert into Double Ended queue");
            dq[rear] = scan.nextInt();
        } else {
            rear++;
            System.out.println("Enter the Element from rear to be insert");
            dq[rear] = scan.nextInt();
        }
    }

    // delete from front:-
    void delete_front() {
        if (front == -1) {
            System.out.println("Underflow: We can not delete from front");
        } else if (front == rear) {
            System.out.println("delted Element = " + dq[front]);
            front = rear = -1;
        } else {
            System.out.println("delted Element = " + dq[front]);
            front++;
        }
    }

    // delete from rear:-
    void delete_rear() {
        if (rear == -1) {
            System.out.println("Underflow: We can not delete from rear");
        } else if (front == rear) {
            System.out.println("delted Element = " + dq[rear]);
            front = rear = -1;
        } else {
            System.out.println("delted Element = " + dq[rear]);
            rear--;
        }
    }

    // search
    void search() {
        int num, s = 0;
        if (front == -1 & rear == -1) {
            System.out.println("Underflow so we can not search");
        } else {
            System.out.println("Enter Number to search");
            num = scan.nextInt();
            for (int i = front; i <= rear; i++) {
                if (num == dq[i]) {
                    System.out.println("Number is found");
                    s++;
                }
            }
            if (s == 0) {
                System.out.println("Number is not found");
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
                System.out.println(i + " = " + dq[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DoubleEndedQueue3 dq = new DoubleEndedQueue3();
        int ch;
        while (true) {
            System.out.println("1. Insert_From_Front\n2. Insert_From_Rear\n 3. Delete_From_Front\n4. Delete_From_Rear\n5. Search\n6 .Display\n7. Exit");
            System.out.println("Enter your choice (1 to 7)");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    dq.insert_front();
                    break;
                case 2:
                    dq.insert_rear();;
                    break;
                case 3:
                    dq.delete_front();;
                    break;
                case 4:
                    dq.delete_rear();;
                    break;
                case 5:
                    dq.search();
                    break;
                case 6:
                    dq.display();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice, Enter again ");
            }
        }
    }
}
