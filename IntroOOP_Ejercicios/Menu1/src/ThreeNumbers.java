import java.util.Scanner;
import java.util.Arrays;

public class ThreeNumbers {

    public static void NumberProm(){
        int[] numbers = new int[3];
        int prom, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Ingresar 3 numeros y mostrar su promedio**");
        for (int i = 0; i < numbers.length; i++){
            System.out.println("ingrese un numero");
            numbers[i] = scanner.nextInt();
        }
        sum = Arrays.stream(numbers).sum();
        prom = sum/3;
        System.out.println("El promedio de los 3 numeros es: " + prom);
    }
}