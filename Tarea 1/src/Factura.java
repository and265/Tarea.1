import java.util.Date;

public class Factura extends DocTributario{

    public Factura(String n, String r, Date f) {
        super(n, r, f);
    }

    @Override
    public String toString() {
        return "Factura {" +
                "Numero: " + getNumero() +
                ", RUT: " + getRut() +
                ", Fecha: " + getFecha() +
                '}';
    }

}
