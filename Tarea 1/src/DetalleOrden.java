public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;

    public DetalleOrden(Articulo articulo, int cantidad) {

        this.cantidad = cantidad;
        this.articulo = articulo;
    }

    public float calcPrecio(){

        return cantidad * articulo.getPrecio();
    }

    public float calcPrecioSinIVA(){

        return cantidad * articulo.getPrecio() * 100/119;
    }

    public float calcIVA(){

        return cantidad * articulo.getPrecio() * 19/119;
    }

    public float calcPeso(){

        return cantidad * articulo.getPeso();
    }



    public int getCantidad() {
        return cantidad;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "DetalleOrden {" +
                "Articulo: " + articulo.getNombre() +
                ", Cantidad: " + cantidad +
                " unidades}";
    }
}
