package RetoV;
import java.util.Scanner;

public class Ppt implements Juego{
    //atributos
    private String jugador;
    private int eleccionU;
    private int eleccionA;
    

    //método constructor vacío
    public Ppt() {
    }

    //método constructor con parámetros
    public Ppt(String jugador, int eleccionU, int eleccionA){
        this.jugador=jugador;
        this.eleccionU=eleccionU;
        this.eleccionA=eleccionA;
    }

    //instanciar scanner
    Scanner sc=new Scanner(System.in);

    //métodos
    public void Iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        jugador=sc.next();
    }

    public void Finalizar(){

        //declarar variables
        int numAle;

        System.out.println(jugador+" realice su eleccion \n 1. Piedra \n 2. Papel \n 3. Tijera");
        eleccionU=sc.nextInt();

        //creamos variable numAle para llamar al método ramdom de la clase Math para asi egenerar un número aleatorio de 0 a 2
        numAle = (int)(Math.random()*3);
        System.out.println("En juego");

        if (eleccionU==1||eleccionU==2||eleccionU==3) {
                switch (numAle) {
                    case 0:
                        eleccionA = 1;

                        //piedra vs piedra
                        if (eleccionU==eleccionA) {
                            System.out.println("¡Empate! La máquina también sacó " + eleccionA);
                            
                        }

                        //papel vs piedra
                        else if(eleccionU==eleccionA){
                            System.out.println("¡Perdiste! La máquina sacó " + eleccionA);
                        }

                        //tijera vs piedra
                        else {
                            System.out.println("¡Ganaste! la máquina sacó " + eleccionA);
                        }
                    
                        break;
                    
                    case 1:
                        eleccionA = 2;

                        if (eleccionU==eleccionA) {
                            System.out.println("¡Empate! La máquina también sacó " + eleccionA);
                            
                        }else if (eleccionU==eleccionA) {
                            System.out.println("¡Perdiste! La máquina sacó " + eleccionA);
                        }

                        else {
                            System.out.println("¡Ganaste! La máquina sacó " + eleccionA);
                        }
                        break;
                    
                    case 2:
                        eleccionA= 3;

                        if (eleccionU==eleccionA) {
                            System.out.println("¡Empate! La máquina también sacó " + eleccionA);
                            
                        }else if (eleccionU==eleccionA){
                            System.out.println("¡Perdiste! la máquina sacó " + eleccionA);
                        }

                        else {
                            System.out.println("¡Ganaste! La máquina sacó " + eleccionA);
                        }
                        break;
                
                    default:
                        break;
                }
            } 
            else {
                System.out.println("La opción ingresada no existe.");
            }

        System.out.println("¡Hasta luego!");
    }

}
