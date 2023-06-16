package prueba;
//si vamos a uttilizar metodos de otro paquete invocamos el paquete y la clase de ese metodo
import Introduccion.Subasta;

public class Ejecucion {
    public static void main(String[] args) {
        Subasta peluche = new Subasta();

        peluche.registrarSubasta();
    }
}
