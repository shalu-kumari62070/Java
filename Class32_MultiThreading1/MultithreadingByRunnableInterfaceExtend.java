// Progrma to demonstration of Multithreading by implementing Runnable interface.

class Table3 implements Runnable{
    int i,n,T;
    public void run() {
        n=3;
        for(i=1; i<=10; i++){
            T = n*i;
            System.out.println(n + " * " + i + " = " + T);
        }
        System.out.println("End og Table 3");
    }
}
class Table5 implements Runnable{
    int i,n,T;
    public void run() {
        n=2;
        for(i=1; i<=10; i++){
            T = n*i;
            System.out.println(n + " * " + i + " = " + T);
        }
        System.out.println("End og Table 5");
    }
}
class Table7 implements Runnable{
    int i,n,T;
    public void run() {
        n=3;
        for(i=1; i<=10; i++){
            T = n*i;
            System.out.println(n + " * " + i + " = " + T);
        }
        System.out.println("End og Table 7");
    }
}
public class MultithreadingByRunnableInterfaceExtend {
    public static void main(String[] args) {
        Table3 T3 = new Table3(); // Partial Thread hai
        Table5 T5 = new Table5(); // Partial Thread hai
        Table7 T7 = new Table7(); // Partial Thread hai
        // Conversion from Partial Thread to Thread (because start() Thread ke under define hai isliye)
        Thread Tab3 = new Thread(T3);   
        Thread Tab5 = new Thread(T5);
        Thread Tab7 = new Thread(T7);    
        Tab3.start();
        Tab5.start();
        Tab7.start(); 
    }
}

/*
Note: In execution of above program the current output may differ from previous output, So In multithreading , we can not predicts the output. 
*/