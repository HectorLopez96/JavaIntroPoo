import java.util.Scanner;

public class Rectangle {
    public static void AreaPerimeter(){
        Scanner scanner = new Scanner(System.in);
        double area, p;
        int b, h;

        System.out.println("Ingresa la base: ");
        b = scanner.nextInt();
        System.out.println("Ingresa la altura: ");
        h = scanner.nextInt();
        p  = 2 * (b + h) ;
        area = b * h;

        System.out.printf("El perimetro del rectangulo es: " + p +"\nEl area del rectangulo es: " + area+"\n");
    }
}
