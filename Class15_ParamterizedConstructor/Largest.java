/*WAP to find Largest among 3 Numbers , If Values are ininitialized using Parametrized Constructor*/

public class Largest{
    int a, b, c;
    Largest(int x, int y, int z){ // x,y,z are Formal Argument
        a = x;
        b = y;
        c = z;
    }
    void Large(){
        if(a>b && a>c){
            System.out.println("Largest Number = " + a);
        }else if (b>c) {
            System.out.println("Largest Number = " + b);
        }else{
            System.out.println("Largest Number = " + c);
        }
    }
    public static void main(String[] args) {
        Largest L = new Largest(30, 20, 90); //30,20,90 are Actual Arguments 
        L.Large();
    }
}