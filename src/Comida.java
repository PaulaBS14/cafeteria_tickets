public class Comida extends Producto {

    private boolean esCaliente;

    public Comida(String nombre, double precio, String categoria, boolean esCaliente) {
        super(nombre, precio, categoria);
        this.esCaliente = esCaliente;
    }

    public boolean getEsCaliente() {
        return esCaliente;
    }

    public void setEsCaliente(boolean esCaliente) {
        this.esCaliente = esCaliente;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();

        if (esCaliente) {
            System.out.println("Comida caliente: Sí");
        } else {
            System.out.println("Comida caliente: No");
        }
    }
}