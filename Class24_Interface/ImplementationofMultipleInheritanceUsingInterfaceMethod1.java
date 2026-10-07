// Implementation of Multiple Inheritance using Interface 
// Method 1:-
// Question:
/*WAP to create an Interface Company with variable cname, pin and method showdata(), Now create a class Department with variable dname, dno and methods for input and output, Now create a sub class Employee of Company and Department with variable ename,ecode.*/ 

interface Company { 
    String cname="Analyze"; 
    int pin=226021; 
    void showdata(); 
} 
class Department { 
    String dname; 
    int dno; 
    void getDept(String name,int no) { 
        dname=name; dno=no; 
    } 
} 
class Employee extends Department implements Company { 
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
        System.out.println("Emp Code\t"+ecode); 
    } 
} 

public class ImplementationofMultipleInheritanceUsingInterfaceMethod1 {
    public static void main(String[] args) {
        Employee emp=new Employee(); 
        emp.getDept("Software Developmment",10); 
        emp.getEmp("William",1030); 
        emp.showdata(); 
    }
}

/*
Company Analyze
Pin Code        226021
Department      Software Developmment
Dept Number     10
Employee        William
Emp Code        1030
*/