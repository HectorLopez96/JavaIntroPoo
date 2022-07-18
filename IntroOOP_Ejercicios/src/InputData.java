import java.util.Scanner;

public class InputData {

    public static int getInt(){
        int sc;
        Scanner scanner = new Scanner(System.in);
        sc = scanner.nextInt();
        return sc;
    }

    public static void printTitle(String title){
        System.out.println("**************");
        System.out.println(title);
        System.out.println("**************");
    }
    public static void printText(String text){
        System.out.println(text);
    }
}
