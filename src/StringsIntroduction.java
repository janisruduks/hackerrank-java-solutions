import java.util.Arrays;
import java.util.Scanner;

public class StringsIntroduction {
    public static void stringsIntroduction() {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());

        String[] s = {A, B};

        int x=(A.compareTo(B));
        if(x>0) System.out.println("Yes");
        else System.out.println("No");

        for(int i = 0; i < s.length; i++){
            s[i] = s[i].substring(0, 1).toUpperCase() + s[i].substring(1);
        }

        System.out.println(s[0] + " " + s[1]);    }
}
