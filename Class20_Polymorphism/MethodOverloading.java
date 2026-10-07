public class MethodOverloading{
    void largest(int a, int b){
        if(a>b){
            System.out.println("A is largest " + a);
        }else{
            System.out.println("B is largest " + b);
        }
    }

    void largest(int a, int b, int c){
        if(a>b && a>c){
            System.out.println("A is largest " + a);
        }else if (b>a && b>c) {
            System.out.println("B is largest " + b);
        }else{
            System.out.println("C is largest " + c);
        }
    }
    public static void main(String[] args) {
        MethodOverloading O = new MethodOverloading();
        O.largest(10, 20);
        O.largest(20, 30, 50);
    }
}