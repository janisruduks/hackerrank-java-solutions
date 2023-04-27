import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IfElse {
    public static void ifelse() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        if(N % 2 == 1){
            System.out.print("Weird");
        }else if(N < 6 && N > 1){
            System.out.print("Not Weird");
        }else if(N < 21 && N > 5){
            System.out.print("Weird");
        }else if(N > 21){
            System.out.print("Not Weird");
        }
        bufferedReader.close();
    }
}
