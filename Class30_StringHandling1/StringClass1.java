
public class StringClass1 {
    public static void main(String[] args) {
        String str = "Java";
        System.out.println("Value of str = " + str);
        System.out.println("Ref of str = " + str.hashCode());
        str += "Program";
        System.out.println("Value of str = " + str);
        System.out.println("Ref of str = " + str.hashCode());
        str += "Java is pure Object Oriented Language";
        System.out.println("Value of str = " + str);
        System.out.println("Ref of str = " + str.hashCode());
    }
}

/*
Value of str = Java
Ref of str = 2301506
Value of str = JavaProgram
Ref of str = -1634440734
Value of str = JavaProgramJava is pure Object Oriented Language
Ref of str = -1915874559
*/

// Note :- Ref different aaya hai iska matlab hai ki String immutable hai(means new memory allocate ho rhi hai means original string me change nhi ho raha hai);
