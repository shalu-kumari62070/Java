package userpack.pack1;

public class Factorial {
    int f=1;
    public void fact(int n){
        for(int i=1; i<=n; i++){
            f = f*i;
        }
        System.out.println("Factorial of " + n + " = " + f);
    }
}