import org.junit.Test;
import org.junit.Assert;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class ServicioLoginTest {
    @Test
    public void pruebaUsuarioExistente(){
        RepositorioUsuarios repositorio = mock(RepositorioUsuarios.class);
        when(repositorio.existeUsuario("Adrirome")).thenReturn(true);
        ServicioLogin ServicioLogin = new ServicioLogin(repositorio);
        Assert.assertTrue(ServicioLogin.login("Adrirome"));
    }
}
