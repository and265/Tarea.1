import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {

    private Date fecha;
    private String estado;
    private Cliente cliente;
    private float deuda;
    private ArrayList<DetalleOrden> dOrden;
    private DocTributario doct;

    public OrdenCompra(Cliente cliente, DocTributario doct, Date fecha) {

        dOrden = new ArrayList<DetalleOrden>();
        this.cliente = cliente;
        this.doct = doct;
        estado = "Compra en proceso";

    }

    public void addOrden(Articulo a, int cantidad) {

        if(estado == "Compra en proceso") {
            DetalleOrden dor = new DetalleOrden(a, cantidad);
            dOrden.add(dor);
            deuda = deuda + dor.calcPrecio();

        }

        else
            System.out.println("La orden de compra no está disponible para esta operación.");
    }

    public void pagarCompra(Pago p){

        if ( p.getMonto() >= deuda && estado != "Pago completado"){

            deuda = 0;
            estado = "Pago completado";
        }

        else if (p.getMonto() < deuda && estado != "Pago completado"){

            deuda = deuda - p.getMonto();
            estado = "Pago incompleto";
        }

    }

    public float calcPrecioSinIVA(){

        float total = 0;

        for(int i=0; i<dOrden.size(); i++){

            total = total + dOrden.get(i).calcPrecioSinIVA();
        }

        return total;

    }

    public float calcIVA(){

        float total = 0;

        for(int i=0; i<dOrden.size(); i++){

            total = total + dOrden.get(i).calcIVA();
        }

        return total;
    }

    public float calcPrecio(){

        float total = 0;

        for(int i=0; i<dOrden.size(); i++){

            total = total + dOrden.get(i).calcPrecio();
        }

        return total;
    }

    public float calcPeso(){

        float total = 0;

        for(int i=0; i<dOrden.size(); i++){

            total = total + dOrden.get(i).calcPeso();
        }

        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public float getDeuda() {
        return deuda;
    }

    public ArrayList<DetalleOrden> getdOrden() {
        return dOrden;
    }

    public DocTributario getDoct() {
        return doct;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public void setdOrden(ArrayList<DetalleOrden> dOrden) {
        this.dOrden = dOrden;
    }

    public void setDoct(DocTributario doct) {
        this.doct = doct;
    }

    @Override
    public String toString() {

        return "OrdenCompra: \n" + doct.toString() +
                "\nCliente: " + cliente.getNombre() +
                "\nEstado: " + estado +
                "\nMonto a pagar: $" + deuda;
    }
}
