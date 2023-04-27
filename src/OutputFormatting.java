import java.util.Scanner;

public class OutputFormatting {
    public static void outputFormatting(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for(int i = 0; i < 3; i++){
            String s1=sc.next();
            int x=sc.nextInt();

            String zero = "";

            if(x < 10){
                zero = "00";
            }else if(x < 100){
                zero = "0";
            }

            System.out.println(String.format("%s%s%s%s", s1, " ".repeat(15 - s1.length()), zero, x));
        }
        sc.close();
        System.out.println("================================");
    }
}
