//Program to demonstration of Interface 
interface Company {
    String cname = "Analyze";
    int pin = 226021;

    /*
    int a ;
    a = 10; // error
     */
    void showdata();

    void msg();
    /* void show() { } */ //Error
}

class Employee implements Company {
    String ename;
    int ecode;

    void getEmp(String name, int code) {
        ename = name;
        ecode = code;
    }

    public void showdata() {// override
        System.out.println("Company\t" + cname);
        System.out.println("Pin Code\t" + pin);
        System.out.println("Employee\t" + ename);
        System.out.println("Emp Code\t" + ecode);
    }

    public void msg() {// override
    }
}

public class InterfaceExample1 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getEmp("William", 1020);
        emp.showdata();
    }
}
/*
Company Analyze
Pin Code        226021
Employee        William
Emp Code        1020
*/

/*
shalukumari@shalus-MacBook-Air Class24_Interface % javap Company.class
Compiled from "InterfaceExample1.java"
interface Company {
  public static final java.lang.String cname;
  public static final int pin;
  public abstract void showdata();
  public abstract void msg();
}*/