// Wap to input an array of 10 Elements and find Frequency of each Team

import java.util.Scanner;

public class ArrayfindFrequency2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ar[] = new int[10];
        int f;
        System.out.println("Enter 10 Elements");
        for(int i=0; i<10; i++){
            ar[i] = scan.nextInt();
        }
        for(int i = 0; i<ar.length; i++){
            f = 1;
            for(int j=i+1; j<ar.length; j++){
                if (ar[i]==ar[j]) {
                    f++;
                    ar[j] = 0;// Duplicate element ko 0 mark kar rahe hain,taaki woh element dobara process na ho.
                }
            }
            if (ar[i] !=0) {
                System.out.println("Frequency of "+ar[i] + " = " + f);
            }// Sirf unhi elements ki frequency print karenge jo duplicate ke roop mein 0 mark nahi hue hain.
        }
    }
}