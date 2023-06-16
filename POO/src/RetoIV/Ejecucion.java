package RetoIV;

import java.util.Scanner;
public class Ejecucion {
    static Scanner entrada=new Scanner(System.in);
    public static void main(String[] args) {
        Circulo ejecucion1=new Circulo();
        Trapecio ejecucion2=new Trapecio();
        Triangulo ejecucion3=new Triangulo();
        Rombo ejecucion4=new Rombo();

        int op1,op2=1;

        while (op2==1){
            System.out.println("Elija \n1. Area circulo\n2.Area triangulo\n3.Area trapecio\n4 Area rombo\n");
            op1=entrada.nextInt();
            if(op1==1){
                ejecucion1.calcularArea();
            }
            else if(op1==2){
                ejecucion2.calcularArea();
            }
            else if (op1==3){
                ejecucion3.calcularArea();
            }
            else if (op1==4){
                ejecucion4.calcularArea();
            }
            System.out.println("¿Desea calcular de nuevo el area de alguna figura? 1.si 2.no");
            op2=entrada.nextInt();
        }
    }
    
        
}
