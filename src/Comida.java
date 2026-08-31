/**
 * Representa una comida de la cafetería.
 * @author Paula
 * @version 1.0
 */
public class Comida extends Producto {

    private boolean esCaliente;

    /**
     * Crea una comida con su nombre, precio, categoría y si es caliente.
     * @param nombre nombre de la comida
     * @param precio precio de la comida
     * @param categoria categoría de la comida
     * @param esCaliente indica si la comida es caliente
     */
    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    /**
     * Indica si la comida es caliente.
     * @return true si la comida es caliente y false si no lo es
     */
    public boolean getEsCaliente() {
        return esCaliente;
    }

    /**
     * Modifica si la comida es caliente.
     * @param esCaliente indica si la comida es caliente
     */
    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    /**
     * Muestra por pantalla la información de la comida.
     */
    @Override
    public void mostrarInformacion() {
        if (esCaliente) {
            System.out.printf("%s caliente - %.2f €%n", getNombre(), getPrecio());
        } else {
            System.out.printf("%s frío - %.2f €%n", getNombre(), getPrecio());
        }
    }
}