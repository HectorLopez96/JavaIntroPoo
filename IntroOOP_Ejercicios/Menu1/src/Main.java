import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
        System.out.println("*** Opciones a Seleccionar ***");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Salir");
        System.out.println("---* Ingrese el numero de la opcion *---");
        option = scanner.nextInt();
        switch(option) {
            case 1 -> AskNumber.Number();
            case 2 -> ThreeNumbers.NumberProm();
            case 3 -> Rectangle.AreaPerimeter();
            case 4 -> Randomizer.RanNumb();
            default -> System.out.println("Gracias por su atencion");
             }
        } while(option != 5);
    }
}