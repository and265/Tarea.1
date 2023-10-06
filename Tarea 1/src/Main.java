import java.util.Date;
public class Main {

    public static void main(String[] args) { //El peso de los artículos utilizados estarán en la unidad de medida de kilogramos (por ahora solo se utilizarán artículos que posean esa unidad de medida). El precio estará en peso chileno.

        Direccion dr1 = new Direccion("Esmeralda #542, Talcahuano");
        Direccion dr2 = new Direccion("Suiza #1020, Hualpén");

        Cliente c1 = new Cliente("Antonio Bustamante", "12.222.112-4",dr1);
        Cliente c2 = new Cliente("Carolina Sánchez", "17.211.643-9",dr2);

        Articulo pan = new Articulo(1,"Pan", "Alimento horneado, basado en harina de trigo y otros ingredientes.", 1700);
        Articulo manzana = new Articulo(1, "Manzana", "Fruto proveniente del manzano, color verde, posee un sabor dulce o ácido.", 1500);
        Articulo mancuerna = new Articulo(5, "Mancuerna", "Aparato gimnástico formado por una barra de metal con una o más piezas pesadas en cada extremo, que se usa para hacer ejercicios musculares.", 20000);
        Articulo televisor = new Articulo(15, "Televisor", "Aparato tecnológico cuya principal función es emitir material audiovisual por medio de su pantalla. Dimensión: 50 pulgadas.", 300000);
        Articulo refrigerador = new Articulo(50,"Refrigerador", "Electrodoméstico que sirve para refrigerar y mantener en buen estado los alimentos",250000);

        DocTributario dt1 = new DocTributario("1","12.222.112-4",new Date(2023,10,14));
        DocTributario dt2 = new DocTributario("2", "17.211.643-9", new Date(2023,10,21));
        DocTributario dt3 = new DocTributario("3", "12.222.112-4", new Date(2023, 10,24));

        OrdenCompra oc1 = new OrdenCompra(c1,dt1,new Date(2023,10,14));
        oc1.addOrden(televisor,1);
        System.out.println(oc1.toString());
        Pago p1 = new Tarjeta(300000, new Date(2023,10,14),"Débito", "1002999223233331");
        oc1.pagarCompra(p1);
        System.out.println("\n"+oc1.toString());
        System.out.println(p1.toString());

        OrdenCompra oc2 = new OrdenCompra(c2,dt2,new Date(2023,10,21));
        oc2.addOrden(mancuerna,2);
        System.out.println("\n"+oc2.toString());
        oc2.addOrden(manzana, 3);
        oc2.addOrden(pan,1);
        System.out.println("\n"+oc2.toString());
        Efectivo p2 = new Efectivo(50000, new Date(2023,10,21));
        System.out.println("\n"+oc2.toString());
        System.out.println("\nMonto de devolución: "+p2.calcDevolucion(oc2));
        oc2.pagarCompra(p2);
        System.out.println("\n"+oc2.toString());

        OrdenCompra oc3 = new OrdenCompra(c1,dt3,new Date(2023,10,24));
        oc3.addOrden(refrigerador,2);
        System.out.println("\n"+oc3.toString());
        Pago p3 = new Transferencia(500000,new Date(2023,10,24),"Banco Estado","12.222.112-4");
        oc3.pagarCompra(p3);
        System.out.println("\n"+oc3.toString());
        System.out.println(p3.toString());

    }
}
