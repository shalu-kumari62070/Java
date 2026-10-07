public class CommandLineInput1 {
    
    public static void main(String[] args) {
        for(int i=0;i<args.length; i++){
            System.out.println(i + " " + "Name = " + args[i]);
        }
    }
}

// shalukumari@shalus-MacBook-Air CLASS2 % javac CommandLineInput1.java
// shalukumari@shalus-MacBook-Air CLASS2 % java CommandLineInput1 shalu ritu ayushi aditi  
// 0 Name = shalu
// 1 Name = ritu
// 2 Name = ayushi
// 3 Name = aditi

