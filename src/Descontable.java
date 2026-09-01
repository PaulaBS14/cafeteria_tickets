/**
 * Define el comportamiento de los elementos a los que se puede aplicar un descuento.
 * @author Paula
 * @version 1.0
 */
public interface Descontable {

    /**
     * Calcula el precio después de aplicar un descuento.
     * @param porcentaje porcentaje de descuento que se va a aplicar
     * @return precio después de aplicar el descuento
     */
    double aplicarDescuento(double porcentaje);

}
