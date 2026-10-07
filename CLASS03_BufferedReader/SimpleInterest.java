import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleInterest {

    public static void main(String[] args) throws IOException {
        int t;
        float p, r, SI;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);

        System.out.println("Enter Time = ");
        t = Integer.parseInt(br.readLine());

        System.out.println("Enter Principle = ");
        p = Float.parseFloat(br.readLine());

        System.out.println("Enter Rate = ");
        r = Float.parseFloat(br.readLine());

        SI = (p*r*t)/100;
        System.out.println("Simple Interest = " + SI);

    }
}
