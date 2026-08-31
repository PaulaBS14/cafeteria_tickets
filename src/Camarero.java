/**
 * Representa un camarero de la cafetería.
 * @author Paula
 * @version 1.0
 */
public class Camarero {

    private String nombre;
    private String codigoEmpleado;

    /**
     * Crea un camarero con su nombre y código de empleado.
     * @param nombre nombre del camarero
     * @param codigoEmpleado código del empleado
     */
    public Camarero(String nombre, String codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Devuelve el nombre del camarero.
     * @return nombre del camarero
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del camarero.
     * @param nombre nuevo nombre del camarero
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código de empleado del camarero.
     * @return código de empleado del camarero
     */
    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    /**
     * Modifica el código de empleado del camarero.
     * @param codigoEmpleado nuevo código de empleado del camarero
     */
    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    /**
     * Muestra por pantalla la información del camarero.
     */
    public void mostrarInformacion() {
        System.out.println("Camarero: " + nombre);
        System.out.println("Código de empleado: " + codigoEmpleado);
    }
}