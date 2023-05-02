import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
    public static void arrayList() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int length = Integer.parseInt(bufferedReader.readLine());

            List<List<Integer>> numbers = new ArrayList<>();

            for(int i = 0; i < length; i++){
                String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> arrRowItems = new ArrayList<>();

                for(String arrRowTempItem : arrRowTempItems) {
                    int arrItem = Integer.parseInt(arrRowTempItem);
                    arrRowItems.add(arrItem);
                }
                numbers.add(arrRowItems);
            }

            bufferedReader.readLine();
            while(bufferedReader.ready()) {
                String[] xY = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
                int x = Integer.parseInt(xY[0]);
                int y = Integer.parseInt(xY[1]);

                try {
                    System.out.println(numbers.get(x - 1).get(y));
                } catch (IndexOutOfBoundsException error){
                    System.out.println("ERROR!");
                }
            }
        } catch (IOException error){
            System.out.println("Something went wrong " + error);
        }
    }
}
