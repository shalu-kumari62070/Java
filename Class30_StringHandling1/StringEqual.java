// equals method check value
// == method check reference(means address)

public class StringEqual {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String(s1);
        System.out.println("s1==s2 is " + (s1==s2)); // s1==s2 is false
        System.out.println("s1==s3 is " + (s1==s3)); // s1==s3 is false
        System.out.println("s1.equals(s2) " + (s1.equals(s2))); // s1.equals(s2) true
        System.out.println("s1.equals(s3) " + (s1.equals(s3))); // s1.equals(s3) true
        System.out.println("s1==s4 is " + (s1==s4));// s1==s4 is false
        System.out.println("s1.equals(s4 )" + (s1.equals(s4))); // s1.equals(s4 )true

    }
}

/*
s1==s2 is false
s1==s3 is false
s1.equals(s2) true
s1.equals(s3) true
s1==s4 is false
s1.equals(s4 )true
*/
