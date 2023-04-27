import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loops1 {
    public static void loops1() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i < 11; i++){
            int sum = N * i;
            System.out.println(String.format("%s x %s = %s", N, i, sum));
        }
    }
}
