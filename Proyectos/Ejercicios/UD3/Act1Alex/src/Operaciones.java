import Pedidos.Pedido;
import Pedidos.ProductoPedido;
import Producto.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Operaciones {
    private static List<Producto> productos;
    private static List<Pedido> pedidos = new ArrayList<>();

    public static void setProductos(List<Producto> nuevosProductos) {
        productos = nuevosProductos;
    }

    public static void realizarPedido(List<ProductoPedido> productosPedido) throws Exception {
        if (productosPedido == null || productosPedido.isEmpty()) {
            throw new Exception("El pedido no puede estar vacío");
        }
        for (ProductoPedido productoPedido : productosPedido) {
            realizarPedido(productoPedido);
        }
    }

    public static void realizarPedido(ProductoPedido productoPedido) throws Exception {
        Producto producto = getProducto(productoPedido.getId());
        if (producto == null) {
            throw new Exception("El producto no existe");
        }

        if (producto.getStock() < productoPedido.getCantidad()) {
            throw new Exception("No hay suficiente stock del producto para realizar el pedido");
        }

        producto.restarStock(productoPedido.getCantidad());
        crearPedido(producto, productoPedido.getCantidad());
    }

    private static Producto getProducto(String id) {
        Optional<Producto> optionalProducto = productos.stream().filter(p -> p.getId() == id).findFirst();
        return optionalProducto.isPresent() ? optionalProducto.get() : null;
    }

    private static void crearPedido(Producto producto, int cantidad) {
        double precioPedido = producto.getPrecio() * cantidad;
        Pedido pedido = new Pedido(producto.getId(), cantidad, precioPedido);
        pedidos.add(pedido);
    }
}
