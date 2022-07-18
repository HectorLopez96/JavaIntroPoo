public class Main {
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("*** Opciones a Seleccionar ***");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Salir");
            System.out.println("---* Ingrese el numero de la opcion *---");
            option = InputData.Data();
            switch(option) {
                case 1 -> DivisibleNumb.Divisible();
                case 2 -> FourNumbers.sumNumbers();
                case 3 -> Capicua.getCapicua();
                default -> System.out.println("Gracias por su atencion");
            }
        } while(option != 4);
    }
}
