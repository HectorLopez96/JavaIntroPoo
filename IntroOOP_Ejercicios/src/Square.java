public class Square extends Shapes{
    int num;
    public Square(int num){
        super("Cuadrado");
        this.num=num;
        setArea();
        setPerimeter();
    }
    public void setArea(){
        System.out.println("ingresa el area del cuadrado");
        num = InputData.getInt();
        this.area = num*num;
    }
    public void setPerimeter(){
        System.out.println("ingresa el Perimetro del cuadrado");
        num = InputData.getInt();
        this.perimeter = num*4;
    }
}
