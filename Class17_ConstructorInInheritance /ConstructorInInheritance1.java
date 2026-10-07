class Company { 
    String cname; 
    Company() { 
        cname="Analyze Infotech";
        System.out.println("Class Company"); 
        } 
} 
class Department extends Company { 
    String dname; 
    Department() { 
        dname="Software Development";
        System.out.println("Class Department"); 
        } 
} 
class Employee extends Department { 
    String ename; 
    Employee() { 
        ename="William"; 
        System.out.println("Class Employee"); 
        } 
    void showdata() { 
        System.out.println("Comapny Name\t"+cname);
        System.out.println("Department Name\t"+dname);    
        System.out.println("Employee Name\t"+ename); 
    }
} 
public class ConstructorInInheritance1{
    public static void main(String args[]){
        Employee emp=new Employee(); 
        emp.showdata(); 
    }
}

/*
Class Company
Class Department
Class Employee
Comapny Name    Analyze Infotech
Department Name Software Development
Employee Name   William
*/