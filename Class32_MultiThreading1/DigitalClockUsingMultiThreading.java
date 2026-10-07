import java.util.*;

class DigitalClockUsingMultiThreading extends Thread {
    int h, m, s;
    String time;

    public void run() {
        for (;;) // Infinite loop
        {
            Calendar c = Calendar.getInstance();

            h = c.get(Calendar.HOUR);
            m = c.get(Calendar.MINUTE);
            s = c.get(Calendar.SECOND);

            time = check(h) + ":" + check(m) + ":" + check(s);

            try {
                System.out.println("TIME\t" + time);
                sleep(1000);
                System.out.println("\r");
            } catch (InterruptedException ie) {

            }
        }
    }

    String check(int value) {
        if (value < 10)
            return "0" + value;
        else
            return "" + value;
    }

    public static void main(String args[]) {
        DigitalClockUsingMultiThreading DC = new DigitalClockUsingMultiThreading();
        DC.start();
    }
}