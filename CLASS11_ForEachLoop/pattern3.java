
public class pattern3 {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            // for(int j=1; j<=5-i; j++){ //Space
            //     System.out.print(" ");
            // } 
            // or
            for(int j=i; j<5; j++){ // Space
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){ // Star
                System.out.print("*");
            }
            System.out.println();
        }
    }    
}


/*

    *
   **
  ***
 ****
*****

 */