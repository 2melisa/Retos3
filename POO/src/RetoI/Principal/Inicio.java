package RetoI.Principal;
import RetoI.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
    
    //definir objetos
    Persona salud = new Persona();

    //invocar métodos
    salud.pedirDatos();
    salud.mostrarDatos();
    salud.calcularImc();
    salud.mayorEdad();

    }
}
