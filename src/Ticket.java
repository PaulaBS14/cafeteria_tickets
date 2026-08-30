public class Ticket {

    private Cliente cliente;
    private Camarero camarero;
    private Producto[] productos;
    private int contadorProductos;

    public Ticket(Cliente cliente, Camarero camarero) {
        this.cliente = cliente;
        this.camarero = camarero;
        this.productos = new Producto[10];
        this.contadorProductos = 0;
    }

    public void agregarProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos++;
        } else {
            System.out.println("No se pueden añadir más productos.");
        }
    }

    public double calcularTotal() {
        double total = 0;

        for (int i = 0; i < contadorProductos; i++) {
            total = total + productos[i].getPrecio();
        }

        return total;
    }

    public void mostrarTicket() {
        System.out.println("CAFETERÍA JAVA");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Camarero: " + camarero.getNombre() + " - Código: " + camarero.getCodigoEmpleado());
        System.out.println("Productos:");

        for (int i = 0; i < contadorProductos; i++) {
            productos[i].mostrarInformacion();
        }

        System.out.printf("Total: %.2f €%n", calcularTotal());
    }
}
