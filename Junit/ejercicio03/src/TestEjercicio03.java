import org.junit.Assert;
import org.junit.Test;
public class TestEjercicio03 {
    @Test
    public void test() {
        int a = 1;
        int b = 3;
        int c = 11;
        Ejercicio03 service = new Ejercicio03();
        Assert.assertEquals(a, service.charCount("Hello, World!", '!'));
        Assert.assertEquals(b, service.charCount("Papa frita", 'a'));
        Assert.assertNotEquals(c, service.charCount("     mamaa     ", ' '));
    }
}