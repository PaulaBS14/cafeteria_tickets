public class Bebida extends Producto {

    private String tamanio;

    public Bebida(String nombre, double precio, String categoria, String tamanio) {
        super(nombre, precio, categoria);
        this.tamanio = tamanio;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;

    }
    @Override
    public void mostrarInformacion() {
        System.out.printf("%s %s - %.2f €%n", getNombre(), tamanio, getPrecio());
    }

}