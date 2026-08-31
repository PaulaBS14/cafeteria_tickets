/**
 * Representa un cliente de la cafetería.
 * @author Paula
 * @version 1.0
 */
public class Cliente {

    private String nombre;
    private String telefono;

    /**
     * Crea un cliente con su nombre y teléfono.
     * @param nombre nombre del cliente
     * @param telefono teléfono del cliente
     */
    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    /**
     * Devuelve el nombre del cliente.
     * @return nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre del cliente.
     * @param nombre nuevo nombre del cliente
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el teléfono del cliente.
     * @return teléfono del cliente
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Modifica el teléfono del cliente.
     * @param telefono nuevo teléfono del cliente
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Muestra por pantalla la información del cliente.
     */
    public void mostrarInformacion() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}