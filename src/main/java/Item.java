public class Item {
    int precio;
    TipoItem tipo;
    // otra alternativa es crear una intefaz Item, o que esta clase herede articulos

    public Item(int precio,TipoItem tipo){
        this.precio = precio;
        this.tipo = tipo;
    }

    public void setPrecio(int nuevoPrecio){
        this.precio = nuevoPrecio;
    }
}
