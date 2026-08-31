/**
 * Representa una bebida de la cafetería.
 * @author Paula
 * @version 1.0
 */
public class Bebida extends Producto {

    private String tamanio;

    /**
     * Crea una bebida con su nombre, precio, categoría y tamaño.
     * @param nombre nombre de la bebida
     * @param precio precio de la bebida
     * @param categoria categoría de la bebida
     * @param tamanio tamaño de la bebida
     */
    public Bebida(String nombre, double precio, String categoria, String tamanio) {
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    /**
     * Devuelve el tamaño de la bebida.
     * @return tamaño de la bebida
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * Modifica el tamaño de la bebida.
     * @param tamanio nuevo tamaño de la bebida
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;

    }

    /**
     * Muestra por pantalla la información de la bebida.
     */
    @Override
    public void mostrarInformacion() {
        System.out.printf("%s %s - %.2f €%n", getNombre(), tamanio, getPrecio());
    }

}