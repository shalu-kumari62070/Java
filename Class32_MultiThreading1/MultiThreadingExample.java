// Wap to print 1 to n 
class NaturalNumber extends Thread {
    int i,n;
    public void run() {
        n=100;
        for(i=1; i<=n; i++){
            System.out.print(" i = " + i);
            try{
                sleep(1000);// 1 second
            }catch(InterruptedException ie){
                System.out.println("ERROR = " + ie);
            }
        }
    }
}
public class MultiThreadingExample {
    public static void main(String[] args) {
        new NaturalNumber().start();;
    }
}