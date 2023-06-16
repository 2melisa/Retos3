package Introduccion;
import java.util.Scanner;
import java.util.Random;

public class Caraysello implements Juego{

    //atributos
    private int moneda;
    private String jugador;
    private int eleccion;
    
    //metodo constructor vacío
    public Caraysello() {
    }

    //método constructor con parámetros
    public Caraysello(int moneda, String jugador, int eleccion) {
        this.moneda = moneda;
        this.jugador = jugador;
        this.eleccion = eleccion;
    }

    Scanner entrada=new Scanner(System.in);

    //métodos
    public void Iniciar(){
        System.out.println("Ingrese el nombre del jugador");
        jugador=entrada.next();

    }

    public void Jugar(){
        System.out.println(jugador+" realice su eleccion \n 1. Cara \n 2. Sello");
        eleccion=entrada.nextInt();
        Random aleatorio=new Random();
        moneda =aleatorio.nextInt(2)+1;
        System.out.println("Moneda Girando");
    }

    public void Finalizar(){
        if(moneda==1 && eleccion==1){
            System.out.println("Cayó cara, Ganaste "+jugador);
        }else if(moneda==2 && eleccion==2){
            System.out.println("Cayó sello, Ganaste "+jugador);
        }else if(moneda==1 && eleccion==2){
            System.out.println("Cayó cara, Perdiste "+jugador);
        }
    }
}
