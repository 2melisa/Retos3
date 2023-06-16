package RetoIV;

import java.util.Scanner;

public class Rombo {
    Scanner entrada=new Scanner(System.in);
    private double diagonalMayor;
    private double diagonalMenor;
    private double area;

    

    public Rombo() {
    }

    public Rombo(double diagonalMayor, double diagonalMenor, double area) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.area = area;
    }



    public void calcularArea(){
        System.out.println("Ingrese la diagonal mayor del rombo: ");
        diagonalMayor=entrada.nextDouble();
        System.out.println("Ingrese la diagonal menor del rombo: ");
        diagonalMenor=entrada.nextDouble();
        area=(diagonalMayor*diagonalMenor)/2;
        System.out.println("El area del rombo es:"+area);
    }
}
