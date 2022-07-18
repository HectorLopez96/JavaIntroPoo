import java.util.Arrays;

public class FourNumbers {
    public static void sumNumbers(){
        int sum = 0, number = 0;
        System.out.println("ingrese un numero");
        number = InputData.Data();
        String digits = Integer.toString(number);
        int[] data = new int[digits.length()];
        for (int i = 0; i < data.length; i++){
            data[i] = digits.charAt(i)-'0';
        }
        sum = Arrays.stream(data).sum();
        System.out.println("D1 = "+data[0]+ ", D2 = "+data[1]+", D3 = "+data[2]+", D4 = "+data[3] +"\nsumatoria de los 4 numeros: "+sum);
    }
}
