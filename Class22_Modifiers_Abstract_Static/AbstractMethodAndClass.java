// Program to demonstration of abstract class and method

abstract class Company{
    String cname;
    void getCmp(String str){ // Conceret method
        cname = str;
    }
    // Note:- Conceret method ko override ki need nhi hoti hai
    // Note:- abstract method ko override ki need hoti hai
    abstract void showData(); // abstract method
    abstract void msg();
}

class Employee extends Company{
    String enaame;
    void getEmp(String str){
        enaame = str;
    }
    void showData(){ // override
        System.out.println("Company Name = " + cname);
        System.out.println("Employee Name = " + enaame);
    }
    void msg(){ // override
        System.out.println("This is message");
    }
}

public class AbstractMethodAndClass{
    public static void main(String[] args) {
        // Company C = new Company(); // Error beacuse abstract class ka object nhi create karte hai.
        Employee E = new Employee();
        E.getCmp("Analyze");
        E.getEmp("Shalu");
        E.showData();
        E.msg();
    }
}

/*
Company Name = Analyze
Employee Name = Shalu
This is message
*/