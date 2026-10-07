// Progrma to demonstration of Multithreading by extending Thread Class

class Natural extends Thread{
    int i,n;
    public void run() { // override
        n=20;
        for(i=1; i<=n; i++){
            System.out.println("Natural = " + i);
        }
        System.out.println("End of Natural Series");
    }
} 
class Even extends Thread{
    int i,n;
    public void run() { // override
        n=20;
        for(i=2; i<=n; i+=2){
            System.out.println("Even = " + i);
        }
        System.out.println("End of Even Series");
    }
}
class Odd extends Thread{
    int i,n;
    public void run() { // override
        n=20;
        for(i=1; i<=n; i+=3){
            System.out.println("Odd = " + i);
        }
        System.out.println("End of Odd Series");
    }
}

public class MultithreadingByThreadExtend1{
    public static void main(String[] args) {
        Natural N = new Natural();
        Even E = new Even();
        Odd O = new Odd();
        N.start();
        E.start();
        O.start();
    }
}

/*
Note: In execution of above program the current output may differ from previous output, So In multithreading , we can not predicts the output. 
*/