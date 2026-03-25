package Pedidos;

public class Pedido {
    private String idProducto;
    private int cantidad;
    private double precioPedido;

    public Pedido(String idProducto, int cantidad, double precioPedido) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precioPedido = precioPedido;
    }
}
