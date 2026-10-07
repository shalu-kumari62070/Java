/* WAP to create a class APSeries Now initialize value of a,d,n using Parametrized Constructor and Generate APSeries
a  a+d  a+2d + a+3d  ......... a+(n-1)d

here enter value of a,d,n by user
 */

import java.util.Scanner;
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
            a = a +d;
        }
    }
}
public class ApSeriesUserInputExample {
    public static void main(String[] args) {
        int a,d,n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of a, d , n = ");
        a = scan.nextInt();
        d = scan.nextInt();
        n = scan.nextInt();
        ApSeries APS = new ApSeries(a,d,n);
        APS.getSeries();
    }
}

