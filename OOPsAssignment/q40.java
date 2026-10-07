// public class q40 {
//     public void display(int n) {
//         try {
//             if (n > 100) {
//                 throw new IllegalArgumentException("Above 100 not allowed");
//             }
//             System.out.println("number = " + n);
//         } catch (IllegalArgumentException ie) {
//             System.out.println(ie.getMessage());
//         }
//     }
//     public static void main(String[] args) {
//         q40 q = new q40();
//         q.display(110);
//     }
// }

// or
public class q40 {
    public void display(int n) throws IllegalArgumentException{
        if (n>100) {
            throw new IllegalArgumentException("Above 100 not allowed");
        }
        System.out.println("Number = " + n);
    }
    public static void main(String[] args) {
        q40 q = new q40();
        try{
            q.display(120);
        }catch(IllegalArgumentException iae){
            System.out.println(iae.getMessage());
        }
    }
}
