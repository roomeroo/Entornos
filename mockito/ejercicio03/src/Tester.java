import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class Tester {
    @Test
    public void testCalcularTotal() {
        ProveedorDescuentos mockProveedor = mock(ProveedorDescuentos.class);
        
        when(mockProveedor.calcularDescuento()).thenReturn(10);
        
        SistemaOrdenes sistemaOrdenes = new SistemaOrdenes(mockProveedor);
        
        int precioOriginal = 100;
        
        int total = sistemaOrdenes.calcularTotal(precioOriginal);
    
        assertEquals(90, total);
    }
}