// WAP to create an abstract class Series that contains variable a,d,n and concrete method get

abstract class Series{
    int a,d,n;
    void getdata(int a, int d, int n){
        this.a = a;
        this.d = d;
        this.n = n;
    }
    abstract void printSeries();
}

class APSeries extends Series{
    void printSeries(){
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            a +=d;
        }
        System.out.println();
    }
}

class GPSeries extends Series{
    void printSeries(){
        for(int i=1; i<=n; i++){
            System.out.print(a + " ");
            a *=d;
        }
    }
}

public class AbstractMethodAndClass1 {
    public static void main(String[] args) {
        APSeries AP = new APSeries();
        GPSeries GP = new GPSeries();
        AP.getdata(2, 3, 10);
        GP.getdata(3, 2, 8);
        AP.printSeries();
        System.out.println("Now Print GPSeries");
        GP.printSeries();
    }
}
