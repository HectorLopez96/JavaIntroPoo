public class Menu {
    private static Shapes shapes;

    private static void printMenu() {
        InputData.printTitle("Menu principal");
        InputData.printText("1) Crear Cuadrado");
        InputData.printText("2) Crear Circulo");
        InputData.printText("3) Crear Rectangulo");
        InputData.printText("4) Crear Octagono");
        InputData.printText("5) Imprimir Perimetro");
        InputData.printText("6) Imprimir Area ");
        InputData.printText("7) Imprimir tipo de figura");
        InputData.printText("8) salir");
    }

    public static void Selection(){
        int option;
        do{
            printMenu();
            System.out.println("Ingrese el numero de la opcion que desea seleccionar");
            option = InputData.getInt();
            switch(option){
                case 1 -> shapes = new Square(option);
                case 2 -> shapes = new Circle(option);
                case 3 -> shapes = new Rectangle(option);
                case 4 -> shapes = new Octagon(option);
                case 5 -> InputData.printTitle("Perimetro: " + shapes.getPerimeter());
                case 6 -> InputData.printTitle("Area: " + shapes.getArea());
                //case 7 -> ;
                default -> System.out.println("Gracias por su atencion");
            }
        }while(option !=8);
    }


}
