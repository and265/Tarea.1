import java.util.Date;

public class Pago {

    private float monto;
    private Date fecha;

    public Pago(float m, Date f) {

        monto = m;
        fecha = f;
    }

    public float getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pago {" +
                "Monto: " + monto +
                ", Fecha: " + fecha +
                '}';
    }
}
