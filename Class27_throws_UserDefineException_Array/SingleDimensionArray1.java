
public class SingleDimensionArray1 {
    public static void main(String[] args) {
        int ar[] = {10,20,30,40,50,60,70,80,90,100};
        int sum=0,avg;
        for(int value:ar){
            System.out.println("Value = " + value);
            sum += value;
        }
        avg = sum/ar.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
