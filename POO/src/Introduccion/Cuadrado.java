package Introduccion;
import java.util.Scanner;
public class Cuadrado extends Figura{
    private int lado;

    public Cuadrado(){
    }

    public Cuadrado(int lado) {
        super();
        this.lado=lado;
    }

    public int getLado(){
        return lado;
    }

    public int setLado(){
        return lado;
    }

    public void registrarDatos(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el lado del cuadrado: ");
        lado=sc.nextInt();
    }

    public void calcularArea() {
        float area=lado*lado;
        System.out.println("El lado del cuadrado es "+lado+" y el área es "+area);
    }


}
