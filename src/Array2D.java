import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Array2D {
    public static void TwoDArray() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        bufferedReader.close();
    }

    public static int hourglass(List<List<Integer>> array){
        // in our 2d array we have 6x6 and we can fit 4 hourglasses inside side by side
        // need to read 4 sections by 3 for hourglass head
        // 4 sections by 1
        int tempValue = 0;
        for(int i = 0; i < 6; i++){
           for(int j = 0; j < 4; j++){
               int topAndBottom = array.get(i).get(j) + array.get(i+1).get(j+1) + array.get(i+2).get(j+2);
           }
        }

        return 0;
    }
}
