import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionTest {
    Operacion operacion;
    Item libro;
    Item computadora;
    Item internet;

    @Before
    public void init(){
        operacion = new Operacion();
        libro = new Item(3,TipoItem.ARTICULO);
        computadora = new Item(40,TipoItem.ARTICULO);
        internet = new Item(15,TipoItem.SERVICIO);
    }

    @Test
    public void valorOperacionConArticulos(){
        operacion.agregarItem(libro);
        operacion.agregarItem(computadora);
        operacion.agregarItem(internet);

        Assert.assertEquals(58,operacion.obtenerValor());
    }

    @Test
    public void valorOperacionSinArticulos(){
        Assert.assertEquals(0,operacion.obtenerValor());
    }

    @Test
    public void operacionAbierta(){
        operacion.agregarItem(libro);
        operacion.agregarItem(computadora);
        operacion.agregarItem(internet);
        libro.setPrecio(10);

        Assert.assertEquals(65,operacion.obtenerValor());
    }

    @Test
    public void operacionCerrada(){
        operacion.agregarItem(libro);
        operacion.agregarItem(computadora);
        operacion.agregarItem(internet);
        operacion.cerrar();
        libro.setPrecio(10);

        Assert.assertEquals(58,operacion.obtenerValor());
    }

    @Test
    public void operacionComprarTodosArticulos(){
        operacion.agregarItem(libro);
        operacion.agregarItem(computadora);

        Assert.assertNotNull(operacion.comprar());
    }

    @Test
    public void operacionComprarNoTodosArticulos(){
        operacion.agregarItem(computadora);
        operacion.agregarItem(internet);

        Assert.assertNull(operacion.comprar());
    }
}
