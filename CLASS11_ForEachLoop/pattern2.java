
public class pattern2 {
    public static void main(String[] args) {
        // for(int i=65; i<=90; i++){
        //     for(int j=65; j<=i; j++){
        //         System.out.print((char)j);
        //     }
        //     System.out.println();
        // }

        char ch = 'a', zh = 'z';
        for(int i=ch; i<=zh; i++){
            for(int j=ch; j<=i; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }

    }    
}

/* 
a
ab
abc
abcd
abcde
abcdef
abcdefg
abcdefgh
abcdefghi
abcdefghij
abcdefghijk
abcdefghijkl
abcdefghijklm
abcdefghijklmn
abcdefghijklmno
abcdefghijklmnop
abcdefghijklmnopq
abcdefghijklmnopqr
abcdefghijklmnopqrs
abcdefghijklmnopqrst
abcdefghijklmnopqrstu
abcdefghijklmnopqrstuv
abcdefghijklmnopqrstuvw
abcdefghijklmnopqrstuvwx
abcdefghijklmnopqrstuvwxy
abcdefghijklmnopqrstuvwxyz */