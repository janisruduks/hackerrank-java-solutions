import java.util.Scanner;

public class Array1D {
    public static void oneDArray(){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        scan.close();

    }
}
