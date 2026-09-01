/**
 * Clase principal para ejecutar el programa de la cafetería.
 * @author Paula
 * @version 1.0
 */
public class Main {

    /**
     * Ejecuta el programa principal de la cafetería.
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Laura Martín", "600123456");
        Camarero camarero = new Camarero("Jorge", "C01");
        Bebida cafe = new Bebida("Café", 1.80, "Bebida", "Mediano");
        Comida bocadillo = new Comida("Bocadillo", 3.50, "Comida", true);
        Bebida zumo = new Bebida("Zumo", 2.20, "Bebida", "Grande");
        Ticket ticket = new Ticket(cliente, camarero);

        ticket.agregarProducto(cafe);
        ticket.agregarProducto(bocadillo);
        ticket.agregarProducto(zumo);

        ticket.mostrarTicket();

        Descontable productoConDescuento = cafe;

        double precioFinal = productoConDescuento.aplicarDescuento(10);

        System.out.println("Descuento aplicado al café: 10%");
        System.out.printf("Precio final del café: %.2f €%n", precioFinal);
    }


}