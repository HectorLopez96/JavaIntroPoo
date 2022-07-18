public class Capicua {
    public static void getCapicua(){
        int number;
        boolean capicua = false;
        System.out.println("Ingrese un numero de 5 digitos, porfavor");
        number = InputData.Data();
        if (number >= 10000) {
            if (((number / 10000) == (number % 10) ) && ((((number / 1000) % 10)) == ((number / 10) % 10))) {
                capicua = true;
            }
        }
        if (capicua) {
            System.out.println("El numero introducido es capicua.");
        } else {
            System.out.println("El numero introducido no es capicua.");
        }
    }
}
