import org.junit.Test;
import static org.mockito.Mockito.*;
public class ServicioNotificacionesTest {
    @Test

    public void servicioNotificacionesTest(){
        ProveedorNotificaciones mockProvee = mock(ProveedorNotificaciones.class);
        ServicioNotificacion miServ = new ServicioNotificacion(mockProvee);

        miServ.notificar("holea");
        verify(mockProvee).enviarNotificacion("holea");
    }

}
