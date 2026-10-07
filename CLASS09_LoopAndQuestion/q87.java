public class q87 {
    public static void main(String[] args) {
        int i=1, value=1,sum=0;
        while (i<=25) {
            sum+=value;
            System.out.println("value = " + value);
            value+=6;
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("Sum = "+ sum);
    }
}
