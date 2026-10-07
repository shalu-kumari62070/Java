class ApSeries{
    int a,d,n;
    ApSeries(){
        a = 2;
        d = 3;
        n = 15;
    }
    ApSeries(int a, int d, int n){
        this.a = a;
        this.d = d;
        this.n = n;
    }

    void getSeries(){
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            a = a + d;
        }
        System.out.println();
    }
}

public class ApSeriesByOverloading {
    public static void main(String[] args) {
        ApSeries A1 = new ApSeries();
        A1.getSeries();
        System.out.println("Parmetrixed Constructor");
        ApSeries A2 = new ApSeries(3, 2, 10);
        A2.getSeries();
    }
}
