// 41. WAP to input a no and arrange the digits in ascending order. 

import java.util.Scanner;

public class q41 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n,d;
        System.out.println("Enter Number ");
        n = scan.nextInt();
        for(int i=0; i<=9; i++){
            int temp = n;
            while (temp>0) {
            
                d = temp%10;
                if(d==i){
                    System.out.print(d + " , ");
                }
            temp = temp/10;
        }
        }
    }
}
