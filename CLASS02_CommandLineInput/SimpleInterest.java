public class SimpleInterest {
    
    public static void main(String[] args) {
        
        int p,t;
        float r, SI;
        
        p = Integer.parseInt(args[0]);
        r = Float.parseFloat(args[1]);
        t = Integer.parseInt(args[2]);
        SI = p*r*t/100;
        System.out.println("Simple Interest = " + SI);

    }
}
