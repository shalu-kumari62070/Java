// Question: WAP to input 10 names and arrange all Names in Alphabetical order.

import java.util.Scanner;

public class StringCompareTo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name[] = new String[10];
        int i,j,r;
        String temp;
        System.out.println("Enter 10 names = ");
        for(i=0; i<10; i++){
            name[i] = scan.next();
        }
        for(i=0; i<9; i++){
            for(j=i+1; j<10; j++){
                r = name[i].compareTo(name[j]);
                if (r>0) {
                   temp = name[i];
                   name[i] = name[j];
                   name[j] = temp; 
                }
            }
        }
        System.out.println("Names in Alphabetical order");
        for(i=0; i<10; i++){
            System.out.println(name[i]);
        }
    }
}
/*
Enter 10 names = 
shalu
ritu
ayushi
tanaya
sikha
harshita
zarina
bob
alice
king
Names in Alphabetical order
alice
ayushi
bob
harshita
king
ritu
shalu
sikha
tanaya
zarina
*/