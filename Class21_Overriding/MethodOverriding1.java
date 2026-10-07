
class Interest{
    int t;
    double p, r;
    void getBase(int t, double p, double r){
        this.t = t;
        this.p = p;
        this.r = r;
    }
    void result(){
        System.out.println("This is Base Class Method Result");
    }
}

class SimpleInterest extends Interest{
    double SI;
    void result(){ // override
        SI = p*r*t/100;
        System.out.println("Simple Intrest = " + SI);
    }
}

class CompoundInterest extends Interest{
    double CI, total_amt;
    void result(){ // override
        total_amt = p*Math.pow((1+r/100), t);
        CI = total_amt - p;
        System.out.println("Compound Intrest = " + CI);
    }
}

public class MethodOverriding1 {
    public static void main(String[] args) {
        // Interest I = new Interest();
        // SimpleInterest SI = new SimpleInterest();
        // CompoundInterest CI = new CompoundInterest();
        // I.getBase(2, 55000.0, 2.3);
        // SI.getBase(3, 80000.0, 2.2);
        // CI.getBase(2, 50000.0, 1.3);
        // I.result();
        // SI.result();
        // CI.result();

        //or
        SimpleInterest SI = new SimpleInterest();
        CompoundInterest CI = new CompoundInterest();
        SI.getBase(3, 80000.0, 2.2);
        CI.getBase(2, 50000.0, 1.3);
        SI.result();
        CI.result();
    }
}
