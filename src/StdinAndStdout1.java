import java.util.Scanner;

public class StdinAndStdout1 {
    public static void stdinAndStdout() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int firstInt = scan.nextInt();
        int secondInt = scan.nextInt();

        System.out.println(a);
        System.out.println(firstInt);
        System.out.println(secondInt);

        scan.close();
    }
}
