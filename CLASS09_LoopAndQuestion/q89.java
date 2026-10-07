public class q89 {
    public static void main(String[] args) {
        int sum = 0, i=1, value=1;
        while (i<=25) {
            sum = sum + (value*value*value);
            value++;
            i++;
            System.out.println("value = " + value);
        }
        System.out.println("Sum = " + sum);
    }
}
