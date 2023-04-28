import java.util.Scanner;

public class StaticInitializerBlock {
    static int B;
    static int H;
    static Boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        scanner.close();
        flag = B > 0 && H > 0;

        if(!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void staticInitializerBlock(){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
