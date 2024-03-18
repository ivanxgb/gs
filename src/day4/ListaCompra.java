package day4;

import java.util.ArrayList;

public class ListaCompra{

    ArrayList<Producto> lista = new ArrayList<>();

    public void agregar(Producto producto) {
        this.lista.add(producto);
    }

    public void eliminar(Producto itemAEliminar) {
        for (int i = 0; i < lista.size(); i++) {
            if (this.lista.get(i).getNombreProducto().equalsIgnoreCase(itemAEliminar.getNombreProducto())) {
                this.lista.remove(i);
                return;
            }
        }
    }

    public void calcularPrecioTotal() {
        int precioTotal = 0;

        for (int i = 0; i < lista.size(); i++){
            precioTotal = precioTotal + lista.get(i).getPrecio();
        }

        System.out.println("El total es: " + precioTotal);
    }
}
