import java.util.Arrays;
import java.util.Scanner;

public class StringTokens {
    public static void tokens(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        String[] tokens = s.split(" !,?._'@");

        System.out.println(Arrays.toString(tokens));
    }
}
