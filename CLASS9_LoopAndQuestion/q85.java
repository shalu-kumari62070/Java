public class q85 {
    public static void main(String[] args) {
        int value=1, i=1, sum = 0; 
        while (i<=40) {
            sum+=value;
            System.out.println(value);
            value+=2;
            i++;
        }
        System.out.println("Sum = "+sum);
    }
}
