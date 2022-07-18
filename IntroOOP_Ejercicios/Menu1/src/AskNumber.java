import java.util.Scanner;

public class AskNumber {
    public static void Number(){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Mostrar siguiente numero al ingresado***");
        System.out.println("ingrese un numero");
        number = scanner.nextInt();
        number++;
        System.out.println("El numero a mostrar es: " + number);
    }
}

