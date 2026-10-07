// Implementation of Multiple Inheritance using Interface 
// Method 1:- A Class can implements 2 or more Interfaces  at a Time, This is also called implementation of Multiple Inheritance using Interface. 

interface Company { 
    String cname="Analyze"; 
    int pin=226021; 
    void showdata(); 
} 
interface Department { 
    String dname="SD"; 
    int dno=10; 
    void msg(); 
} 
class Employee implements Company,Department { 
    String ename; 
    int ecode; 
    void getEmp(String name,int code) { 
        ename=name; 
        ecode=code; 
    } 
    public void showdata() { 
        System.out.println("Company\t"+cname); 
        System.out.println("Pin Code\t"+pin);
        System.out.println("Department\t"+dname); 
        System.out.println("Dept Number\t"+dno); 
        System.out.println("Employee\t"+ename); 
        System.out.println("Emp Code\t "+ecode); 
    }
    public void msg() { } 
} 

public class ImplementationofMultipleInheritanceUsingInterfaceMethod2 {
    public static void main(String[] args) {
        Employee emp=new Employee(); 
        emp.showdata();
    }
}
/*
Company Analyze
Pin Code        226021
Department      SD
Dept Number     10
Employee        null
Emp Code         0
*/