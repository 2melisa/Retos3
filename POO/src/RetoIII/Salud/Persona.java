package RetoIII.Salud;
import java.util.Scanner;
public class Persona {
    //declarar atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;

    //instanciamos clase scanner
    Scanner sc = new Scanner(System.in);

    //metodos
    public Persona() {
    }
    
    public Persona(String tipoDoc, int documento, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    
    //getters de la superclase persona
    public String getTipoDoc(){
        return tipoDoc;
    }

    public int getDocumento(){
        return documento;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
  

    //setters
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
  

    public void pedirDatos(){

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

    }

    

    

    

    
    
}
