import java.util.Scanner;

class PQUE{
    int element;
    int priority;
}

class PriorityQueue{
    int max=10, rear=-1, front=-1;
    PQUE pque[] = new PQUE[max];
    Scanner scan;
    PriorityQueue(){
        for(int i=0; i<10; i++){
            pque[i] = new PQUE(); // yaha se memory allocates hoga
        }
        scan = new Scanner(System.in);
    }

    // insert
    void insert(){
        if (rear == max - 1) {
            System.out.println("Overflow");
        } else if (front == -1 && rear == -1) {
            front = rear = 0;
            System.out.println("Enter first element to insert into Priority queue");
            pque[rear].element = scan.nextInt();
            System.out.println("Enter first element priority to insert into Priority queue");
            pque[rear].priority = scan.nextInt();
        } else{
            rear++;
            System.out.println("Enter element to insert into Priority queue");
            pque[rear].element = scan.nextInt();
            System.out.println("Enter element priority to insert into Priority queue");
            pque[rear].priority = scan.nextInt();
        }
        // Arrange Element on priority basis
        PQUE temp;
        // sort by using selection sort
        // for(int i=front; i<rear; i++){
        //     for(int j=i+1; j<=rear; j++){
        //         if (pque[i].priority>pque[j].priority) {
        //             temp = pque[i];
        //             pque[i] = pque[j];
        //             pque[j] = temp;
        //         }
        //     }
        // }

        // or by using bubble sort
        for(int i=front; i<rear; i++){
            for(int j=front; j<rear; j++){
                if (pque[i].priority>pque[j+1].priority) {
                    temp = pque[i];
                    pque[i] = pque[j+1];
                    pque[j+1] = temp;
                }
            }
        }
    }

    // delete
    void delete() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else if (front == rear) {
            System.out.println(pque[front].element +" is Deleted Eelment and its priority is = " + pque[front].priority);
            front = rear = -1;
        } else {
            System.out.println(pque[front].element +" is Deleted Eelment and its priority is = " + pque[front].priority);
            front++;
        }
    }

    // search
    void search(){
        int num, s=0;
        if(front==-1 && rear==-1){
            System.out.println("underflow");
        }else{
            System.out.println("Enter Element to be search");
            num = scan.nextInt();
            for(int i=front; i<=rear; i++){
                if (num==pque[i].element) {
                    System.out.println("Element is found");
                    s++;
                }
            }
            if(s==0){
                System.out.println("Element is not found");
            }
        }
    }

    
    void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Underflow");
        } else {
            System.out.println("___________traverse____________");
            for (int i = front; i <= rear; i++) {
                System.out.println(pque[i].element + " and its priority is " + pque[i].priority);
            }
        }
    }

}

public class PriorityQueue4 {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        Scanner scan = new Scanner(System.in);
        int ch;
        while (true) {
            System.out.println("1. Insert\n2. Delete\n3. Search\n4 .Display\n5. Exit");
            System.out.println("Enter your choice (1 to 5)");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    pq.insert();
                    break;
                case 2:
                    pq.delete();
                    break;
                case 3:
                    pq.search();
                    break;
                case 4:
                    pq.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice, try again");
            }
        }
    }
}
