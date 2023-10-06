import java.util.Date;

public class Efectivo extends Pago{
    public Efectivo(float m, Date f) {
        super(m, f);
    }

    public float calcDevolucion(OrdenCompra oc){

        if ( getMonto() > oc.getDeuda()){

            return getMonto() - oc.calcPrecio();
        }

        else
            return 0;

    }

    @Override
    public String toString() {
        return "Efectivo {" +
                "Monto: " + getMonto() +
                ", Fecha: " + getFecha() +
                '}';
    }

}
