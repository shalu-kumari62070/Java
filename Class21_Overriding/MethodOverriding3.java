class Term{
    int n;
    void getData(int n){
        this.n = n;
    }

    void Series(){
        System.out.println("This is Base Class Method Series");
    }
}

class EvenSeries extends Term{
    void Series(){
        super.Series(); // to call parent class method
        for(int i=1; i<=n; i++){
            if(i%2==0){
                System.out.println("i = " + i);
            }
        }
    }
}

class OddSeries extends Term{
    void Series(){
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                System.out.println("i = " + i);
            }
        }
    }
}

public class MethodOverriding3 {
    public static void main(String[] args) {
        EvenSeries ES = new EvenSeries();
        OddSeries OS = new OddSeries();
        ES.getData(20);
        OS.getData(15);
        ES.Series();
        OS.Series();
    }
}
