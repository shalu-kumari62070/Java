
class Interest{

    int t, p;
    double r,total_amount,SI, CI;

    void getData(int a, int b, double c){
        t = a;
        p = b;
        r = c;
    }

    void SimpleInterest(){
        SI = p*r*t/100;
        System.out.println("Simple Interest = " + SI);
    }

    void CompoundInterest(){
        total_amount = p*Math.pow((1+r/100), t);
        System.out.println("Total Amount = "+ total_amount);

        CI = total_amount - p;
        System.out.println("Compound Interest = " + CI);
    }
}

public class SimpleAndCompoundIntereset{
    public static void main(String[] args) {
        Interest i = new Interest();
        i.getData(2, 150000, 2.5);
        i.SimpleInterest();
        i.CompoundInterest();
    }    
}
