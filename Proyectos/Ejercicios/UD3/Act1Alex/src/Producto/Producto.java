package Producto;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() {
        return this.id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getValorTotalInventario() {
        return this.getStock() * this.getPrecio();
    }

    public String describirProducto() {
        return "\nProducto: " + this.getNombre()
                + "\nPrecio: " + this.getPrecio()
                + "\nStock: " + this.getStock()
                + "\n";
    }

    public void restarStock(int cantidad) {
        this.setStock(this.getStock() - cantidad);
    }
}
