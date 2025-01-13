import org.junit.Assert;
import org.junit.Test;

public class Ejercicio04Test {
    @Test
    public void test() {
        int x = 0;
        Ejercicio04 service = new Ejercicio04();
        Assert.assertEquals(x, service.sumar(-2, +2)); 
        x = 3;
        Assert.assertNotEquals(x, service.sumar(1, 1));
        x = 12;
        Assert.assertEquals(x, service.restar(2, -10));
        x = -1;
        Assert.assertNotEquals(x, service.restar(-5, -9));
        x = 3;
        Assert.assertNotEquals(x, service.multiplicar(3, 12));
        x = 10;
        Assert.assertEquals(x, service.multiplicar(2, 5));
        Assert.assertNotEquals((float)x, service.dividir(-5, 3),0.001);
        x = 4;
        Assert.assertEquals((float)x, service.dividir(16, 4),0.001);

    }   
}
