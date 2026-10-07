import YourName.UserDefineExceptionq35;

public class UserDefineExceptionexample {
    public void display(int n) throws UserDefineExceptionq35{
        if (n>10) {
            throw new UserDefineExceptionq35("Number is not allowed greater than 10");
        }
        System.out.println("Number = " + n);
    }
    public static void main(String[] args) {
        UserDefineExceptionexample UD = new UserDefineExceptionexample();
        try{
            UD.display(11);
        }catch(UserDefineExceptionq35 u){
            System.out.println(u.getMessage());
        }
    }
}
