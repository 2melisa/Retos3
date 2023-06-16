package RetoIII.Principal;
import RetoIII.Salud.*;

public class Inicio {
    public static void main(String[] args) {
    
    //definir objetos
    Persona per=new Persona();
    Empleado emp = new Empleado();

    //declarar variales
    double totalR;

    //invocar métodos
    per.pedirDatos();
    emp.pedirDatos();
    totalR=emp.calcularHonorarios();
    emp.mostrarDatos(totalR);

    }
}
