import org.junit.Test;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

public class InventarioTest {
    @Test
    public void testEliminarProducto() {
        RepositorioInventario repositorioMock = mock(RepositorioInventario.class);
        when(repositorioMock.contieneProducto("producto1")).thenReturn(true);
        Inventario inventario = new Inventario(repositorioMock); 
        inventario.eliminarProducto("producto1");
        verify(repositorioMock).eliminarProducto("producto1"); 
        when(repositorioMock.contieneProducto("producto1")).thenReturn(false);
        assertFalse(inventario.contieneProducto("producto1"));
    }
}