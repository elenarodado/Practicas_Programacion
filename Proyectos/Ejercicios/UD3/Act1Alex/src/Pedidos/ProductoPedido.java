package Pedidos;

public class ProductoPedido {
    private String id;
    private int cantidad;

    public ProductoPedido(String id, int cantidad) {
        this.id = id;
        this.cantidad = cantidad;
    }

    public String getId() {
        return this.id;
    }

    public int getCantidad() {
        return this.cantidad;
    }
}
