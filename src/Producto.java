/**
 * Representa un producto de la cafetería.
 * @author Paula
 * @version 1.0
 */
public class Producto implements Descontable {
    private String nombre;
    private double precio;
    private String categoria;

    /**
     * Crea un producto con su nombre, precio y categoría.
     * @param nombre nombre del producto
     * @param precio precio del producto
     * @param categoria categoría del producto
     */
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    /**
     * Devuelve el nombre del producto.
     * @return nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del producto.
     * @param nombre nuevo nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    /**
     * Devuelve el precio del producto.
     * @return precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del producto.
     * @param precio nuevo precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la categoría del producto.
     * @return categoría del producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Modifica la categoría del producto.
     * @param categoria nueva categoría del producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Muestra por pantalla la información del producto.
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio + " €");
        System.out.println("Categoría: " + categoria);
    }

    /**
     * Aplica un descuento al precio del producto.
     * @param porcentaje porcentaje de descuento que se va a aplicar
     * @return precio del producto después de aplicar el descuento
     */
    @Override
    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);

    }
}