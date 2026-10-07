package userpack.pack1;

public class Reverse {
    int d, rev=0;
    public void revereseNumber(int n){
        while (n>0) {
            d = n%10;
            rev = rev*10 + d;
            n = n/10;
        }
        System.out.println("Reverse of "+ n + " = " + rev);
    }
}