import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class TicketTest {
    @Test
    public void testCalcularTotal() {

        Cliente cliente = new Cliente("Ana", "García");
        Camarero camarero = new Camarero("Carlos", "C001");
        Ticket ticket = new Ticket(cliente, camarero);
        Producto producto = new Producto("Tostada", 3.50, "Comida");

        ticket.agregarProducto(producto);
        double total = ticket.calcularTotal();
        assertEquals(3.50, total);

    }
    @Test
    public void testCalcularTotalVacio() {

        Cliente cliente = new Cliente("Ana", "García");
        Camarero camarero = new Camarero("Carlos", "C001");
        Ticket ticket = new Ticket(cliente, camarero);
        double total = ticket.calcularTotal();

        assertEquals(0.0, total);
    }
}
