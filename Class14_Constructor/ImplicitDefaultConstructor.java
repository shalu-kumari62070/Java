// Implicit Default Constructor

public class ImplicitDefaultConstructor {
    int a; // Instance Variable
    float b;
    boolean c;
    double e;
    void showData(){
        int d; // Local Variable
        System.out.println("a = " + a); // 0
        System.out.println("b = " + b); // 0.0
        System.out.println("c = " + c); // false
        // System.out.println("d = " + d); // error: variable d might not have been initialized
        System.out.println("e = " + e); // 0.0
    }

    public static void main(String[] args) {
        ImplicitDefaultConstructor N = new ImplicitDefaultConstructor();
        N.showData();
    }
}


/*

shalukumari@shalus-MacBook-Air javawork % cd "/Users/shalukumari/Desktop/javawork/C
lass14_Constructor/" && javac ImplicitDefaultConstructor.java && java ImplicitDefau
ltConstructor
a = 0
b = 0.0
c = false
e = 0.0
shalukumari@shalus-MacBook-Air Class14_Constructor % javap ImplicitDefaultConstructor.class
Compiled from "ImplicitDefaultConstructor.java"
public class ImplicitDefaultConstructor {
  int a;
  float b;
  boolean c;
  public ImplicitDefaultConstructor();
  void showData();
  public static void main(java.lang.String[]);
}

 */
