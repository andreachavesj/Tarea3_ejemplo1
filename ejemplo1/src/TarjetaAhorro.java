import java.time.LocalDate;

public class TarjetaAhorro extends Tarjeta{

    public TarjetaAhorro(String cedula, int numeroCuenta, double saldo, LocalDate apertura) {
        super(cedula, numeroCuenta, saldo, apertura);
    }
}
