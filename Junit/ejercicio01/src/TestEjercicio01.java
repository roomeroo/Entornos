import org.junit.Test;
import org.junit.Assert;
public class TestEjercicio01 {
    @Test
    public void test () {
        Ejercicio01 service = new Ejercicio01();
        Assert.assertTrue(service.esPositivo(12));
        Assert.assertTrue(service.esPositivo(15));
        Assert.assertTrue(service.esPositivo(2147483647));
    }
}
