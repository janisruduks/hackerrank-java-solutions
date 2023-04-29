import java.util.Scanner;

public class StringReverse {
    public static void stringReverse(){
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();

        String B = "";
        char x;

        for(int i = 0; i < A.length(); i++){
            x = A.charAt(i);
            B = x + B;
        }
        if(A.equals(B)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
