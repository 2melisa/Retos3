package RetoIV;

import java.util.Scanner;
public class Trapecio extends Figura {
    Scanner entrada=new Scanner (System.in);
    private double baseMenor;
    private double baseMayor;
    private double altura;
    private double area;

    


    public Trapecio() {
    }


    public Trapecio(double baseMenor, double baseMayor, double altura, double area) {
        this.baseMenor = baseMenor;
        this.baseMayor = baseMayor;
        this.altura = altura;
        this.area = area;
    }




    public void calcularArea() {
        System.out.println("Digite la base mayor del trapecio: ");
        baseMayor=entrada.nextDouble();
        System.out.println("Digite la base menor del trapecio: ");
        baseMenor=entrada.nextDouble();
        System.out.println("Digite la altura del trapecio: ");
        altura=entrada.nextDouble();
        area=((baseMayor*baseMenor)*altura)/2;
        System.out.println("El area del trapecio es: "+area);
    }
}
