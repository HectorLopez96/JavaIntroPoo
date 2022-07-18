public class Rectangle extends Shapes{
    int num,num2;
    public Rectangle(int num){
        super("Rectangulo");
        this.num=num;
        setArea();
        setPerimeter();
    }
    public void setArea(){
        System.out.println("ingresa la base del Rectangulo");
        num = InputData.getInt();
        System.out.println("ingresa la altura del Rectangulo");
        num2 = InputData.getInt();
        this.area = (num*num2);
    }

    public void setPerimeter(){
        System.out.println("ingresa el base del Rectangulo");
        num = InputData.getInt();
        System.out.println("ingresa la altura del Rectangulo");
        num2 = InputData.getInt();
        this.perimeter = (num*2)+(num2*2);
    }
}
