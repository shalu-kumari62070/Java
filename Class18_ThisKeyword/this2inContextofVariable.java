class Data2 { 
    int a=10,b=20,c=30;//Instance Variable

    void showdata() { 
        int a=50,b=60;//Local Variable 
        System.out.println("a="+a); 
        System.out.println("b="+b); 
        System.out.println("c="+c);  
        System.out.println("a="+this.a); 
        System.out.println("b="+this.b); 
    } 
} 

public class this2inContextofVariable {
    public static void main(String[] args) {
        new Data2().showdata();  
    }
}

/*
a=50
b=60
c=30
a=10
b=20
 */