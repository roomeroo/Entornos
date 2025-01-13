public class SistemaOrdenes {
    private ProveedorDescuentos proveedorDescuentos;

    // Constructor
    public SistemaOrdenes(ProveedorDescuentos proveedorDescuentos) {
        this.proveedorDescuentos = proveedorDescuentos;
    }

    // Método que calcula el total después de aplicar el descuento
    public int calcularTotal(int precioOriginal) {
        int descuento = proveedorDescuentos.calcularDescuento();
        int total = precioOriginal - (precioOriginal * descuento / 100);
        return total;
    }
}