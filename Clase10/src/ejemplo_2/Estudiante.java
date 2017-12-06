package ejemplo_2;

/**
 *
 * @author hp
 */
public class Estudiante {
    String nombre;
    String apellido;
    // Constructor
    /*public Estudiante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }*/
    // get y set nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // set y get apellido
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    // Metodo toString
    @Override
    public String toString() {
        String cadena = String.format("%s %s", getNombre(), getApellido());
        return cadena;
    }
}
