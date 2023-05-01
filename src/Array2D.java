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
        hourglass(arr);
    }

    public static void hourglass(List<List<Integer>> array){
        int sum = Integer.MIN_VALUE;
        for(int i = 0; i < 4; i++){
           for(int j = 0; j < 4; j++){
               int top = array.get(i).get(j) + array.get(i).get(j+1) + array.get(i).get(j+2);
               int middle = array.get(i+1).get(j+1);
               int bottom = array.get(i+2).get(j) + array.get(i+2).get(j+1) + array.get(i+2).get(j+2);
               int combined = top + middle + bottom;
               System.out.println(combined);
               if(sum < combined){
                   sum = combined;
               }
           }
        }
        System.out.println(sum);
    }
}
