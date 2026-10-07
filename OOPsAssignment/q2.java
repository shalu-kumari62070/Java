/*
2.0 Modify class Account (below figure) to provide a method called debit that withdraws money from an Account. Ensure that the debit amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and the method should print a message indicating "Debit amount exceeded account balance." 
*/

class Account{
    private double balance;
    public Account(double initalBalance){
        if (initalBalance>0.0) {
            balance = initalBalance;
        }else{
            balance = 0.0;
        }
    }
    public void credit(double amount){
        balance = balance + amount;
    }
    public void debit(double amount){
        if (amount<=balance) {
            balance = balance - amount;
        }else{
            System.out.println("Debit amount exceeded account balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}


public class q2 {
    public static void main(String[] args) {
        Account a = new Account(25000.0);
        System.out.println("Initial Balance: " + a.getBalance()); 
        a.debit(5000.0); 
        System.out.println("After Debit: " + a.getBalance()); 
        a.debit(30000.0); 
        System.out.println("Final Balance: " + a.getBalance());
    }
}
/*
Initial Balance: 25000.0
After Debit: 20000.0
Debit amount exceeded account balance
Final Balance: 20000.0
*/