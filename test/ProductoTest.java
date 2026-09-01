import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ProductoTest {
    @Test
    public void testAplicarDescuento() {
        Producto producto = new Producto("Café", 2.00, "Bebida");
        double precioConDescuento = producto.aplicarDescuento(10);

        assertEquals(1.80, precioConDescuento);

    }

    @Test
    public void testAplicarDescuentoCero() {
        Producto producto = new Producto("Café", 2.00, "Bebida");
        double precioSinDescuento = producto.aplicarDescuento(0);
        assertEquals(2.00, precioSinDescuento);
    }
}
