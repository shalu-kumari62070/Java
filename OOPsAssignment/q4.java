/*
4.0 Create a class called Employee that includes three instance variables—a first name (type String), a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again. */

class Employee{
    String fname, lname;
    double msalary;
    Employee(String fname, String lname, double msalary){
        this.fname = fname;
        this.lname = lname;
        if (msalary>0) {
            this.msalary = msalary;
        }
    }
    public void setFirstName(String name){
        fname = name;
    }
    public String getFirstName(){
        return fname;
    }
    public void setLastName(String name){
        lname = name;
    }
    public String getLastName(){
        return lname;
    }
    public void setMonthlySalary(double salary){
        if (salary>0) {
            msalary = salary;
        }else{
            System.out.println("Salaray is less then 0");
        }
    }
    public double getMonthlySalary(){
        return msalary;
    }
}

public class q4 {
    public static void main(String[] args) {
        Employee E1 = new Employee("Shalu", "Rajput", 40000);
        Employee E2 = new Employee("Shalu", "Kumari", 80000);
        System.out.println("Before 10% raise");
        System.out.println(E1.getFirstName());
        System.out.println(E1.getLastName());
        System.out.println(E1.getMonthlySalary()*12);
        System.out.println();
        System.out.println("Employee Second");
        System.out.println(E2.getFirstName());
        System.out.println(E2.getLastName());
        System.out.println(E2.getMonthlySalary()*12);
        System.out.println("After 10% Raise");
        System.out.println();
        E1.setMonthlySalary(E1.getMonthlySalary() * 1.10);            
        E2.setMonthlySalary(E2.getMonthlySalary() * 1.10);
        System.out.println(E1.getFirstName());
        System.out.println(E1.getLastName());
        System.out.println(E1.getMonthlySalary()*12);
        System.out.println();
        System.out.println("Employee Second");
        System.out.println(E2.getFirstName());
        System.out.println(E2.getLastName());
        System.out.println(E2.getMonthlySalary()*12);
    }
}
/*
Before 10% raise
Shalu
Rajput
480000.0

Employee Second
Shalu
Kumari
960000.0
After 10% Raise

Shalu
Rajput
528000.0

Employee Second
Shalu
Kumari
1056000.0
*/