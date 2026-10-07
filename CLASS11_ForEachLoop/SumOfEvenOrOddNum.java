// Wap to initialize an array of 10 elements and print all elements with sum of Even and Odd Number

public class SumOfEvenOrOddNum {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int Evensum=0, OddSum=0;
        for(int i:arr){
            if (i%2==0) {
                Evensum +=i;
            }else{
                OddSum +=i;
            }
        }
        System.out.println("Even Number Sum = " + Evensum);
        System.out.println("Odd Number Sum = " + OddSum);
    }
}
