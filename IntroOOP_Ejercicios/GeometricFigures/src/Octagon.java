public class Octagon extends Shapes{
    int num, num2;
    public Octagon(int num){
        super("Octagono");
        this.num=num;
        setArea();
        setPerimeter();
    }
    public void setArea(){
        System.out.println("ingresa un lado del Octagono");
        num = InputData.getInt();
        System.out.println("ingresa el perimetro del Rectangulo");
        num2 = InputData.getInt();
        this.area = ((num2*8)*num)/2;
    }
    public void setPerimeter(){
        System.out.println("ingresa un lado del Octagono");
        num = InputData.getInt();
        this.perimeter = (num*8);
    }
}
