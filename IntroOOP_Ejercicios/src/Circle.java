public class Circle extends Shapes{
    int num;
    public Circle(int num){
        super("Circulo");
        this.num=num;
        setArea();
        setPerimeter();
    }
    public void setArea(){
        System.out.println("ingresa el area del Circulo");
        num = InputData.getInt();
        this.area = (2*Math.PI*num*num);
    }
    public void setPerimeter(){
        System.out.println("ingresa el Perimetro del Circulo");
        num = InputData.getInt();
        this.perimeter = (2*Math.PI*num);
    }

}

