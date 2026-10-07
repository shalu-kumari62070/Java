// program to demonstration of Inter Thread Communication

class NewThread extends Thread {
    boolean child;

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("New Thread = " + i);
            try {
                sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Existing from New Thread");
        child = true;
    }
}

public class InterThreadCommunication { // ye by default thread hai jo hume day 1 se mil raha hai. (jise hum main thread  bolte hai)                            
    public static void main(String[] args) {
        NewThread NT = new NewThread();
        NT.start();
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main Thread = " + i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (NT.child) { // it is called Inter Thread Communication.(Kyu ki yaha ek thread mein dusre thread ka data access kar rahe hai)
            System.out.println("...Child Thread is Completed");
        } else {
            System.out.println("...Child Thread id Running");
        }
        System.out.println("Exisiting from Main Thread");
    }
}
