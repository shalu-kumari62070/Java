class Message{
    void msg1(){
        System.out.println("This is msg1()");
    }
    void msg2(){
        System.out.println("This is msg2()");
    }
    void msg(){
        System.out.println("This is msg()");
        this.msg1();
        msg2();
    }
}
public class thisInContextOfMethod {
    public static void main(String[] args) {
        Message M = new Message();
        M.msg();
    }
}

/*
This is msg()
This is msg1()
This is msg2()
 */

