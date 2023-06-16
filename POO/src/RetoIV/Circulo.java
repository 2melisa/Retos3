package RetoIV;
import java.util.Scanner;
public class Circulo extends Figura {
    Scanner entrada=new Scanner (System.in);
    private double radio;
    private double area;

    

    public Circulo() {
    }

    

    public Circulo(double radio, double area) {
        this.radio = radio;
        this.area = area;
    }



    public void calcularArea(){
        System.out.println("Ingrese el radio del circulo");
        radio=entrada.nextDouble();
        area=3.1416*radio;
        System.out.println("El area del circulo es:"+area);
    }
}
