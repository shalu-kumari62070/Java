import YourName.myPackage.InvalidNumberException;

public class q39 {
    public void display(int n)throws InvalidNumberException{
        if(n<0){
            throw new InvalidNumberException("negative number not allowed");
        }
        System.out.println("Marks:- " + n);
    }
    public static void main(String[] args) {
        q39 q = new q39();
        try{
            q.display(-34);
        }catch(InvalidNumberException ine){
            System.out.println("Error = " + ine.getMessage());
            ine.printStackTrace();
        }
    }
}



