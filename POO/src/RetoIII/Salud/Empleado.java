package RetoIII.Salud;
import java.util.Scanner;

public class Empleado extends Persona{
    //atributos
    private String cargo;
    private double valorHora;
    private double horasTrabajadas;
    private String departamento;

    
    //instanciar clase scanner
    Scanner sc = new Scanner(System.in);

    //metodos
    

    public Empleado(){

    }

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,int edad, String sexo, String cargo, double valorHora, double horasTrabajadas, String departamento) {
        super(tipoDoc,documento,nombre,apellido);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    public void pedirDatos(){

        //solicitar y capturar datos
        System.out.println("Ingrese su cargo: ");
        cargo=sc.next();

        System.out.println("Ingrese el valor por hora: ");
        valorHora=sc.nextDouble();

        System.out.println("Ingrese las horas trabajadas: ");
        horasTrabajadas=sc.nextDouble();

        System.out.println("Ingrese el departamento: ");
        departamento=sc.next();

    }

    public double calcularHonorarios(){

        double total;
        double reteica;

        //calculo de reteica
        reteica=((valorHora*horasTrabajadas)*0.966)/100;

        //calculo total
        total=(valorHora*horasTrabajadas)-reteica;

        return total;
    }

    public void mostrarDatos(double total){
        System.out.print("Buenos días empleado" + getNombre() + " " + getApellido() + ".");
        System.out.print("El tipo de documento ingresado es "+getTipoDoc()+" con numero " + getDocumento() ); 
        System.out.print("El cargo ingresado es: "+cargo);
        System.out.print("El valor por hora ingresado es: "+valorHora);
        System.out.print("Las horas trabajadas ingresadas son: "+horasTrabajadas);
        System.out.print("El departamento ingresado es: "+departamento);
        System.out.print("El total a pagar es de: $" + total);
    }
    
}
