// 30. WAP to count how many prime digits are there in a no. 

import java.util.Scanner;

public class q30 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d,count=0;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        while (n>0) {
            d = n%10;
            if(d<=1){
                System.out.println("This is not Prime digit");
            }else{
                boolean isPrime = true;
                for(int i=2; i<=Math.sqrt(d); i++){
                    if (d%i==0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                }
            }
            n = n/10;
        }
        System.out.println("Count Prime Digit N0. = " + count);
    }   
}
