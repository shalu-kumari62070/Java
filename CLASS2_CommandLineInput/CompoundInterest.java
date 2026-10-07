
public class CompoundInterest {
    public static void main(String[] args) {

        int p, t;
        double total_amount, r, CI;

        p = Integer.parseInt(args[0]);
        r = Integer.parseInt(args[1]);
        t = Integer.parseInt(args[2]);
        total_amount = p*Math.pow((1+r/100), t);
        System.out.println("Total Amount = "+ total_amount);

        CI = total_amount - p;
        System.out.println("Compound Interest = " + CI);

    }
}
