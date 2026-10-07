public class q88 {
    public static void main(String[] args) {
        int i=1, sum=0, value=1;
        while (i<=25) {
            sum=sum+(value*value);
            value++;
            i++;
        }
        System.out.println("Sum = "+ sum);
    }
}
