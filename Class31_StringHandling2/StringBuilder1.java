
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(25);
        StringBuilder sb3 = new StringBuilder("Java is Dynamic Language");
        sb1.insert(0, "Java");
        System.out.println("sb1 = " + sb1);
        System.out.println("Ref. of sb1 = " + sb1.hashCode());
        sb1.append("Program");
        System.out.println("sb1 = " + sb1);
        System.out.println("Ref. of sb1 = " + sb1.hashCode());
        System.out.println("Length of sb1 = " + sb1.length());
        System.out.println("Capacity of sb1 = " + sb1.capacity());

        System.out.println("Length of sb2 = " + sb2.length());
        System.out.println("Capacity of sb2 = " + sb2.capacity());

        System.out.println("Length of sb3 = " + sb3.length());
        System.out.println("Capacity of sb3 = " + sb3.capacity());
    }
}
/*
sb1 = Java
Ref. of sb1 = 498931366
sb1 = JavaProgram
Ref. of sb1 = 498931366
Length of sb1 = 11
Capacity of sb1 = 16
Length of sb2 = 0
Capacity of sb2 = 25
Length of sb3 = 24
Capacity of sb3 = 40
*/