import java.util.Random;
public class Randomizer {
    public static void RanNumb(){
        Random rand = new Random();
        int maxSize = 200;
        int aleatory = rand.nextInt(maxSize);
        double increase = aleatory * 1.30;
        System.out.println("Numero aleatorio generado de entre 0 a 200 es: "+ aleatory +"\nNumero aleatorio con incremento del 30%: "+increase);
    }
}
