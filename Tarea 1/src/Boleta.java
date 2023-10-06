import java.util.Date;

public class Boleta extends DocTributario{

    public Boleta(String n, String r, Date f) {
        super(n, r, f);
    }

    @Override
    public String toString() {
        return "Boleta {" +
                "Numero: " + getNumero() +
                ", RUT: " + getRut() +
                ", Fecha: " + getFecha() +
                '}';
    }
}
