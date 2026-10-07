
public class Addition {
    public static void main(String[] args) {
        byte a, b,c;
        a = 10;
        b = 20;

        // c = a+b; // its give error because byte is conveted into int so it gives lossy conversion from int to byte.

        c = (byte)(a+b); // Addition = 30
        System.out.println("Addition = " + c);

        float d;
        // d = 20.5; // error: incompatible types: possible lossy conversion from double to float

        // d = 20.5f;
        // or 
        d = (float) 20.5;

    }
}





// shalukumari@shalus-MacBook-Air javawork % cd "/Users/shalukumari/Desktop/javawork/CLASS7_TypeCasting/" && javac Addition.ja
// va && java Addition
// Addition.java:7: error: incompatible types: possible lossy conversion from int to byte
//         c = a+b;
//              ^
// 1 error