public class Cliente {
    private String nombre;
    private String cedula;
    private String direccion;
    private int tarjetaAhorro;

    public Cliente(String nombre, String cedula, String direccion, int tarjetaAhorro) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.tarjetaAhorro = tarjetaAhorro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTarjetaAhorro() {
        return tarjetaAhorro;
    }

    public void setTarjetaAhorro(int tarjetaAhorro) {
        this.tarjetaAhorro = tarjetaAhorro;
    }
}
