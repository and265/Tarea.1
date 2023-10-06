import java.util.Date;

public class Tarjeta extends Pago{

    private String tipo;
    private String numTransaccion;
    public Tarjeta(float m, Date f, String tipo, String numTransaccion) {
        super(m, f);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }

    @Override
    public String toString() {
        return "Tarjeta {" +
                "Monto: " + getMonto() +
                ", Fecha: " + getFecha() +
                ", Tipo: " + tipo +
                ", Número de transacción: " + numTransaccion +
                '}';
    }
}
