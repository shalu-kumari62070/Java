// Wap to input Book Name, page Number, Cost and Selling Price, Now print Book Name, Page Number with profit or loss.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class ProfitLoss {
    public static void main(String[] args)throws IOException {
        
        String bookName;
        int pageNo;
        float CI, SI, profit, loss;
        // InputStreamReader ir = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(ir);
        // or
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter Book Name = ");
        bookName = br.readLine();

        System.out.println("Enter Page Number = ");
        pageNo = Integer.parseInt(br.readLine());

        System.out.println("Enter Cost Price = ");
        CI = Float.parseFloat(br.readLine());

        System.out.println("Enter Selling Price = ");
        SI = Float.parseFloat(br.readLine());

        profit = SI - CI;
        loss = CI - SI;

        if(CI<SI){
            System.out.println("Profit = " + profit);
        }
        else if (CI>SI) {
            System.out.println("Loss = " + loss);
        }
        else{
            System.out.println("There is No Profit, No Loss");
        }
    }
}
