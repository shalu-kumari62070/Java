/*WAP to compute Simple and Compund Interest , if values of p, r,t are intialized using default Constructor */ 

class Interest{
    int t;
    double p, r, total_amt, SI, CI;
    Interest(){
        t = 3;
        p = 45000.0;
        r = 2.3;
    }
    void SimpleInterest(){
        SI = p*r*t/100;
        System.out.println("Simple Interest = " + SI);
    }
    void CompoundInterest(){
        total_amt = p*Math.pow((1+r/100), t);
        System.out.println("Total amttotal_amt = "+ total_amt);

        CI = total_amt - p;
        System.out.println("Compound Interest = " + CI);
    }
}
public class ExplicitDefaultConstructorExample {
    public static void main(String[] args) {
        Interest I = new Interest();
        I.SimpleInterest();
        I.CompoundInterest();
    }
}
