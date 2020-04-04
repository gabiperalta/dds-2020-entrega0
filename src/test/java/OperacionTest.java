import org.junit.Assert;
import org.junit.Test;

public class OperacionTest {

    @Test
    public void pruebaOperacion(){
        Operacion operacion = new Operacion(70);
        Assert.assertEquals(70,operacion.getPrecio());
    }
}
