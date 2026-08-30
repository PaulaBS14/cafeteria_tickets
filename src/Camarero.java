public class Camarero {

    private String nombre;
    private String codigoEmpleado;

    public Camarero(String nombre, String codigoEmpleado) {
        this.nombre = nombre;
        this.codigoEmpleado = codigoEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    public void mostrarInformacion() {
        System.out.println("Camarero: " + nombre);
        System.out.println("Código de empleado: " + codigoEmpleado);
    }
}