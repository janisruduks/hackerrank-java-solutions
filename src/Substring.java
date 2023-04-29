import java.util.Scanner;

public class Substring {
    public static void substring(){
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S.substring(start, end));
    }
}
