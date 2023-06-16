package RetoII.Salud;
import java.util.Scanner;
public class Persona {
    //declarar atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    //metodos    

    public Persona() {
    }

    public void pedirDatos(){
        //instanciamos clase scanner
        Scanner sc = new Scanner(System.in);

        //solicitamos datos
        System.out.print("Ingrese el tipo de documento: ");
        //capturamos 
        tipoDoc = sc.next();

        System.out.print("Ingrese su documento: ");
        documento = sc.nextInt();

        System.out.print("Ingrese su nombre: ");
        nombre = sc.next();

        System.out.print("Ingrese su apellido: ");
        apellido = sc.next();

        System.out.print("Ingrese su peso: ");
        peso = sc.nextDouble();

        System.out.print("Ingrese su estatura: ");
        estatura = sc.nextDouble();

        System.out.print("Ingrese edad: ");
        edad = sc.nextInt();

        System.out.print("Ingrese su sexo: ");
        sexo = sc.next();

        sc.close();

    }

    public void mostrarDatos(){
        System.out.println("Buenos días " + nombre + " " + apellido + ".");
        System.out.println("El tipo de documento ingresado es "+tipoDoc+" con numero " + documento );  
        System.out.println("El peso ingresado es de " + peso + "kg, y una estatura de " + estatura + "m^2"); 
        System.out.println("La edad ingresada es de " + edad + " años" + " y el sexo ingresado es " + sexo + "."); 
    }



    public String calcularImc(String pesoD, String pesoI, String pesoS){
        //declarar variables
        double pesoActual;
        
        //calculo de imc
        pesoActual=(peso)/(estatura);

        if (pesoActual<20) {
            return pesoD;
        }else if(pesoActual>=20  && pesoActual<= 25){
            return pesoI;
        }else{
            return pesoS;
        }
    }

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("Usted es menor de edad");
        }
    }

    
    
}
