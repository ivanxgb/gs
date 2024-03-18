package day4;

public class Producto {
    private String nombreProducto;
    private int precio;

    public Producto(String nombreProducto, int precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return this.nombreProducto;
    }

    public int getPrecio() {
        return  this.precio;
    }
}
