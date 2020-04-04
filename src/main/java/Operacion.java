public class Operacion {
    int precio;

    public Operacion(int precio){
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }
}

/*

clase operacion
-dentro de esta clase habra una lista de items
-tendra un metodo comprar??, generaria un documento

-clase item
tiene un precio y un tipo

clase documento
-tiene asociada una operacion

import org.junit.Assert;
import org.junit.Test;

public class OperacionTest {

    @Test
    public void pruebaOperacion(){
        Operacion operacion = new Operacion(70);
        Assert.assertEquals(70,operacion.getPrecio());
    }
}

*/