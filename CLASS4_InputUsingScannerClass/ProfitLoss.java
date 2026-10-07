import java.util.Scanner;

public class ProfitLoss {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        String bookName;
        int pageNo, CP, SP, profit, loss;
        System.out.println("Enter Book Name = ");
        bookName = scan.next();
        System.out.println("Enter Page Number = ");
        pageNo = scan.nextInt();
        System.out.println("Enter Cost Price ");
        CP = scan.nextInt();
        System.out.println("Enter Selling Price = ");
        SP = scan.nextInt();
        profit = SP - CP;
        loss = CP - SP;
        if (SP>CP) {
            System.out.println("Profit = " + profit);
        }else if(SP < CP){
            System.out.println("Loss = " + loss);
        }else{
            System.out.println("There is No Profit and No Loss");
        }
    }
}
