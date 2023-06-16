package RetoII.Principal;
import RetoII.Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
    
    //definir objetos
    Persona salud = new Persona();

    //declarar variables
    String imc;

    //invocar métodos
    salud.pedirDatos();
    salud.mostrarDatos();
    imc=salud.calcularImc("El peso está por debajo de lo ideal.", "El peso es ideal.", "Tiene sobrepeso");
    System.out.println(imc);
    salud.mayorEdad();

    }
}
