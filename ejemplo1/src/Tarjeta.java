import java.time.LocalDate;

public class Tarjeta {
    private String cedula;
    private int numeroCuenta;
    private double saldo;
    private LocalDate apertura;

    public Tarjeta(String cedula, int numeroCuenta, double saldo, LocalDate apertura) {
        this.cedula = cedula;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.apertura = apertura;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getApertura() {
        return apertura;
    }

    public void setApertura(LocalDate apertura) {
        this.apertura = apertura;
    }
}
