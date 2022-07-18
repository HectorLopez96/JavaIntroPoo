
public class DivisibleNumb {
    public static void Divisible(){
        int num1, num2;
        System.out.println("*---Ingrese primer digito---*");
        num1 = InputData.Data();
        System.out.println("*---Ingrese segundo digito---*");
        num2 = InputData.Data();
        if(num1 % num2 == 0){
            System.out.println("Num1 es divisible");
        } else if (num2 % num1 == 0) {
            System.out.println("Num2 es divisible");
        }else{
            System.out.println("Ninguno es divisible entre si");
        }
    }
}
