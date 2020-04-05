import java.util.ArrayList;
import java.util.List;

public class Operacion {
    private int precioFinal;
    List<Item> items = new ArrayList<Item>();
    private boolean cerrado;

    public Operacion(){
        this.precioFinal = 0;
        this.cerrado = false;
    }

    public void agregarItem(Item nuevoItem){
        this.items.add(nuevoItem);
    }

    public int obtenerValor(){
        return this.cerrado?precioFinal:this.items.stream().mapToInt(item -> item.precio).sum();
    }

    public void cerrar(){
        precioFinal = this.obtenerValor();
        this.cerrado = true;
    }

    public Documento comprar(){
        return this.items.stream().allMatch(item -> item.tipo == TipoItem.ARTICULO)?new Documento():null;
    }
}