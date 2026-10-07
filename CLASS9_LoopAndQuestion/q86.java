public class q86 {
    public static void main(String[] args) {
        int value=2, sum=0, i=1;
        while (i<=99) {
            sum+=value;
            System.out.println("Value = " + value);
            value+=2;
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("sum = "+ sum);
    }
}
