import java.util.ArrayList;

public class Banco {
    private String nombreBanco;
    private ArrayList<Tarjeta> Tarjetas;
    private int idBanco;
    private ArrayList<Cliente> Clientes;

    public Banco(String nombreBanco, ArrayList<Tarjeta> tarjetas, int idBanco, ArrayList<Cliente> clientes) {
        this.nombreBanco = nombreBanco;
        Tarjetas = tarjetas;
        this.idBanco = idBanco;
        Clientes = clientes;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public ArrayList<Tarjeta> getTarjetas() {
        return Tarjetas;
    }

    public void setTarjetas(ArrayList<Tarjeta> tarjetas) {
        Tarjetas = tarjetas;
    }

    public int getIdBanco() {
        return idBanco;
    }

    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }

    public ArrayList<Cliente> getClientes() {
        return Clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        Clientes = clientes;
    }
}
