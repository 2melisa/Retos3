package Introduccion;
import java.util.Scanner;
public class Subasta {
    //creamos atributos con su debido modificador de acceso(private, public, protect o default)
    private int idProducto;
    private String producto;
    private int propuestaMayor;
    private int propuestaMenor;

    //instanciar clase scanner
    Scanner sc = new Scanner(System.in);

    //metodo constructor vacio
    public Subasta() {
    }

    //creamos métodos
    public void registrarSubasta(){

        //solicitamos codigo de la subasta
        System.out.print("Ingresa el número de subasta: ");

        //capturamos en el atributo
        idProducto = sc.nextInt();

        //solicitamos nombre del producto a subastar
        System.out.print("Ingresa el producto a subastar: ");

        //capturamos en el atributo
        producto = sc.next();

        //solicitamos la propuesta mayor hecha en la subasta
        System.out.print("Ingresa la propuesta mayor hecha en la subasta: ");

        //capturamos en el atributo
        propuestaMayor = sc.nextInt();

        //solicitamos la propuesta menor hecha en la subasta
        System.out.print("Ingresa la propuesta menor hecha en la subasta: ");

        //capturamos en el atributo
        propuestaMenor = sc.nextInt();
    }



    public void mostrarSubasta(){
        System.out.println("El número de subasta es: " + idProducto);
        System.out.println("El producto subastado fué: " + producto);
        System.out.println("La propuesta mayor a la subasta fue de: $" + propuestaMayor);
        System.out.println("Y la propuesta menor fue de: $" + propuestaMenor);
    }

    public void calcularEdad(int añoN){

        //declarar variables
        int año;
        //solicitamos edad
        System.out.println("Ingrese su año de nacimiento: ");

        //capturamos
        añoN = sc.nextInt();

        //solicitamos año actual
        System.out.println("Ingrese el año actual: ");

        //capturamos
        año = sc.nextInt();

        //calculamos edad
        int edad = año - añoN;

        //mostramos edad
        System.out.println("Su año de nacimiento es " + añoN + " y el año actual es " + año + " por tanto usted tiene " + edad + " años.");

    }

    public void calcularEdad(){

        //declarar variables
        int año, añoN;
        //solicitamos edad
        System.out.println("Ingrese su año de nacimiento: ");

        //capturamos
        añoN = sc.nextInt();

        //solicitamos año actual
        System.out.println("Ingrese el año actual: ");

        //capturamos
        año = sc.nextInt();

        //calculamos edad
        int edad = año - añoN;

        //mostramos edad
        System.out.println("Su año de nacimiento es " + añoN + " y el año actual es " + año + " por tanto usted tiene " + edad + " años.");
    }

}
