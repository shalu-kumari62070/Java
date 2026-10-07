/* WAP to create a class APSeries Now initialize value of a,d,n using Parametrized Constructor and Generate APSeries
a  a+d  a+2d + a+3d  ......... a+(n-1)d
 */
class ApSeries {
    int a,d,n;
    ApSeries(int x, int y, int z){
        a = x;
        d = y;
        n = z;
    }

    void getSeries(){
        for(int i=0; i<n; i++){
            System.out.print(a + " ");
            a = a + d;
        }
    }
}

public class ApSeriesExample {
    public static void main(String[] args) {
        ApSeries APS = new ApSeries(2, 3, 5);
        APS.getSeries();
    }
}
