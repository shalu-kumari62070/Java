// Program to Demonstration of Thread Name
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

public class ThreadName {
    public static void main(String[] args) {
        Natural N = new Natural();
        Even E = new Even();
        Odd O = new Odd();
        System.out.println("Name of 1st Thread = " + N.getName()); // Name of 1st Thread = Thread-0
        System.out.println("Name of 2nd Thread = " + E.getName()); // Name of 2nd Thread = Thread-1
        System.out.println("Name of 3rd Thread = " + O.getName()); // Name of 3rd Thread = Thread-2
        System.out.println("N = " + N); // N = Thread[#26,Thread-0,5,main]
        System.out.println("E = " + E); // E = Thread[#27,Thread-1,5,main]
        System.out.println("O = " + O); // O = Thread[#28,Thread-2,5,main]
        N.setName("Natural");
        E.setName("Even");
        O.setName("Odd");
        System.out.println("Name of 1st Thread = " + N.getName());// Name of 1st Thread = Natural
        System.out.println("Name of 2nd Thread = " + E.getName());//Name of 2nd Thread = Even
        System.out.println("Name of 3rd Thread = " + O.getName());//Name of 3rd Thread = Odd
        System.out.println("N = " + N); // N = Thread[#26,Natural,5,main]
        System.out.println("E = " + E); // E = Thread[#27,Even,5,main]
        System.out.println("O = " + O); // O = Thread[#28,Odd,5,main]
    }
}