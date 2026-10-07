// Program to Demonstration of Thread Priority
class Natural extends Thread {
    int i, n;

    public void run() { // override
        n = 20;
        for (i = 1; i <= n; i++) {
            System.out.println("Natural = " + i);
        }
        System.out.println("End of Natural Series");
    }
}

class Even extends Thread {
    int i, n;

    public void run() { // override
        n = 20;
        for (i = 2; i <= n; i += 2) {
            System.out.println("Even = " + i);
        }
        System.out.println("End of Even Series");
    }
}

class Odd extends Thread {
    int i, n;

    public void run() { // override
        n = 20;
        for (i = 1; i <= n; i += 3) {
            System.out.println("Odd = " + i);
        }
        System.out.println("End of Odd Series");
    }
}

public class ThreadPriority1 {
    public static void main(String[] args) {
        Natural N = new Natural();
        Even E = new Even();
        Odd O = new Odd();
        System.out.println("Priority of Natural = " + N.getPriority()); // Priority of Natural = 5
        System.out.println("Priority of Even = " + E.getPriority()); // Priority of Even = 5
        System.out.println("Priority of Odd = " + O.getPriority()); // Priority of Odd = 5
        N.setPriority(Thread.MAX_PRIORITY); 
        // E.setPriority(11);// it gives error due to out of 10 hai 
        O.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of Natural = " + N.getPriority()); // Priority of Natural = 10
        System.out.println("Priority of Even = " + E.getPriority()); // Priority of Even = 5
        System.out.println("Priority of Odd = " + O.getPriority()); // Priority of Odd = 1
        E.setPriority(9);
        System.out.println("Priority of Even = " + E.getPriority()); // 9
        N.start();
        E.start();
        O.start();
    }
}