// using this keyword we can call all constructor simultaneously(means this statement should be first statement) (example:- agar 5 constructor hai to ek hi object create karenge with the help of this keyword)

// Note :- without this keyword we can not call all constructor simultaneously so we need to create object for all constructor (example mein agar 5 constructor hai to 5 object create karna hoga)

// Example for calling of Current class constructor using this keyword
class Number{
    int a, b, c;
    Number(){
        this(10);
        System.out.println("Constructor 1");
    }
    Number(int x){
        this(x, 20);
        System.out.println("Constructor 2");
    }
    Number(int x, int y){
        this(x,y,50);
        System.out.println("Constructor 3");
    }
    Number(int x, int y, int z){
        a = x;
        b = y;
        c = z;
        System.out.println("Constructor 4");
    }
    void showdata(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
public class this2inContextofConstructor {
    public static void main(String[] args) {
        Number N = new Number();
        N.showdata();
    }
}

/*
Constructor 4
Constructor 3
Constructor 2
Constructor 1
a = 10
b = 20
c = 50
*/