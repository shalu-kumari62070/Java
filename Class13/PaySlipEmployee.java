/* WAP to input Employee Name, Code and Basic Salary, Now Generate the Pay Slip of Employee 
HRA   => 20% of Basic Pay 
DA    => 40% of Basic Pay 
TA    => 25% of Basic Pay 
EPF   => 15% of Basic Pay 
LIC    => 8% of Basic Pay 
NetSalary=BasiPay+HRA+DA+TA-LIC-EPF 
if basic Pay>=80000 => Officer 
if basic Pay>=50000 and less than 80000 => Cleark 
if basic Pay<50000 => Class IV Employee 
(Implement this Program for 3 Employee) */ 

import java.util.Scanner;

class Employee{
    String emname, rank;
    int bsalay, emcode;
    double HRA, DA, TA, EPF, LIC, NetSalary;

    void getEmployeeData(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee name = ");
        emname = scan.next();
        System.out.println("Enter Employee Code = ");
        emcode = scan.nextInt();
        System.out.println("Enter Employee Basic Salary = ");
        bsalay = scan.nextInt();
        getPaySlip();
    }

    void getPaySlip(){
        HRA = bsalay*(20/100.0);
        DA = bsalay*(40/100.0);
        TA = bsalay*(25/100.0);
        EPF = bsalay*(15/100.0);
        LIC = bsalay*(8/100.0);
        NetSalary = bsalay + HRA + DA + TA - LIC - EPF;
        
        if(bsalay>=80000){
            rank = "Officer";
        }else if (bsalay>=50000) {
            rank = "Cleark";
        }else{
            rank = "Class IV Employee";
        }

        System.out.println("Employee Name = " + emname);
        System.out.println("Employee Code = " + emcode);
        System.out.println("Employee Salary = " + bsalay);
        System.out.println("NetSalary = " + NetSalary);
        System.out.println("Employee Rank = " + rank);
        System.out.println("HRA = " + HRA);
        System.out.println("DA = " + DA);
        System.out.println("TA = " + TA);
        System.out.println("EPF = " + EPF);
        System.out.println("LIC = " + LIC);
    }
}

public class PaySlipEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.getEmployeeData();

        System.out.println();

        Employee emp2 = new Employee();
        emp2.getEmployeeData();

        System.out.println();

        Employee emp3 = new Employee();
        emp3.getEmployeeData();
    }
}
