import java.util.Scanner;

public class StringTokens {
    public static void tokens(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        if(s.trim().equals("")){
            System.out.println(0);
            return;
        }

        String[] tokens = s.trim().split("[ !,?._'@]+");
        System.out.println(tokens.length);

        for(String token: tokens){
            System.out.println(token);
        }
    }
}
