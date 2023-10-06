import java.util.Date;

public class Transferencia extends Pago {

    private String banco;
    private String numCuenta;

    public Transferencia(float m, Date f, String banco, String numCuenta) {
        super(m, f);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    public String getBanco() {
        return banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    @Override
    public String toString() {
        return "Transferencia {" +
                "Monto: " + getMonto() +
                ", Fecha: " + getFecha() +
                ", Banco: " + banco +
                ", Número de transacción: " + numCuenta +
                '}';
    }
}
