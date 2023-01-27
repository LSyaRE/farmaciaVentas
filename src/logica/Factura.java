package logica;

import java.util.List;

public class Factura {

    private String codigo;
    private Cliente cliente;
    private List<Producto> productos;
    // El final es utilizado pra que la persona solo pueda utilizarlo una vez y no se puede cambiar
    private final double IVA;

    public Factura(String codigo, Cliente cliente, List<Producto> productos) {
        // colocamos el valor en IVA
        this.IVA = 1.12;
        this.codigo = codigo;
        this.cliente = cliente;
        this.productos = productos;
    }

    public double calcularSubtotal() {
        double precioTotal = 0;
        // Obtiene de la lista los productos y lo suma
        for (Producto p : productos) {
            precioTotal += p.getPrecio();
        }
        return precioTotal;
    }

    public double calcularTotal() {
        return this.calcularSubtotal() * IVA;
    }

}
