import java.util.Scanner;

public class EndOfFile {
    public static void endOfFile(){
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        while(scanner.hasNextLine()) {
            System.out.println(count + " " + scanner.nextLine());
            count++;
        }
    }
}
