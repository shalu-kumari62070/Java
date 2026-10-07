//Program to demonstration of static Variable and Method

class Employee{
    String ename;
    int ecode;
    static int count;
    void getEmp(String name, int code){
        ename = name;
        ecode = code;
        count++;
    }
    void putEmp(){
        System.out.println("Employee Name = " + ename);
        System.out.println("Employee Code = " + ecode);
    }
    static  void showCount(){
        System.out.println("Total Number of Employee Count = " + count);
    }
}
public class StaticMethodAndClass {
    static int a = 10; // Explicitly Static Variable
    int b = 20; // Non-Static Variable
    public static void main(String[] args) {
        int c = 30; // Implicitly Static Variable
        System.out.println("a = " + a); // a = 10
        // System.out.println("b = " + b); // Error beacuse b is non-static hai
        System.out.println("c = " + c); // c = 30
        System.out.println("count = " + Employee.count); // count = 0
        Employee.showCount(); // Total Number of Employee Count = 0

        //Note:- ename,ecode ke liye 3 memory loaction hoga and count ke liye 1 memory locate hoga kyuki count static hai.
        Employee Emp1 = new Employee();
        Employee Emp2 = new Employee();
        Employee Emp3 = new Employee();
        Emp1.getEmp("Shalu", 114);
        Emp1.putEmp();
        Emp2.getEmp("Ritu", 107);
        Emp2.putEmp();
        Emp3.getEmp("Allice", 123);
        Emp3.putEmp();
        Employee.showCount(); // Total Number of Employee Count = 3
        // or
        // E.showCount();
    }
}

/*
a = 10
c = 30
count = 0
Total Number of Employee Count = 0
Employee Name = Shalu
Employee Code = 114
Employee Name = Ritu
Employee Code = 107
Employee Name = Allice
Employee Code = 123
Total Number of Employee Count = 3
 */