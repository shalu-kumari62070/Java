package userpack;
// Note:- user define package class mein main() method nhi likhete jo is user define package ko call karta hai waha main method hota hai.

public class Series{
    int i;
    public void apSeries(int a, int d, int n){
        for(i=0; i<n; i++){
            System.out.print(a + " , ");
            a = a+d;
        }
        System.out.println("End of AP Series");
    }
    public void gpSeries(int a, int r, int n){
        for(i=0; i<n; i++){
            System.out.print(a + " , ");
            a = a*r;
        }
        System.out.println("End of GP Series");
    }
    /*
    public static void main(String[] args) {
        Series s = new Series();
        s.apSeries(2, 3, 8);
        s.gpSeries(2, 4, 6);
    }
    */ // it gives error becuase user define package mein main mehtod create nhi karte hai. user define package ko kahi aur call karte hai(Means access karte hai.) yaha bas define kar dete hai class ko
}
