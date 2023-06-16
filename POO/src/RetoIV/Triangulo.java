package RetoIV;
import java.util.Scanner;
public class Triangulo extends Figura {
    static Scanner entrada=new Scanner(System.in);
    private double base;
    private double altura;
    private double area;
    
    
    public Triangulo() {
    }


    public Triangulo(double base, double altura, double area) {
        this.base = base;
        this.altura = altura;
        this.area = area;
    }


    public void calcularArea(){
        System.out.println("Ingrese la base del triangulo");
        base=entrada.nextDouble();
        System.out.println("Ingrese la altura del triangulo");
        altura=entrada.nextDouble();
        area=(base*altura)/2;
        System.out.println("El area del triangulo es:"+area);
    }
}