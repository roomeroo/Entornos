import org.junit.Assert;
import org.junit.Test;
public class TestEjercicio02 {
    @Test
    public void test() {
        Ejercicio02 service = new Ejercicio02();
        Assert.assertTrue(service.esPar(12));
        Assert.assertTrue(service.esPar(28));
        Assert.assertFalse(service.esPar(11));
    }
}
