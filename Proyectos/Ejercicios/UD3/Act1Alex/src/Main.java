import Producto.Producto;
import Producto.CafeEspecial;
import Pedidos.ProductoPedido;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear lista de productos
        List<Producto> productos = new ArrayList<>();

        // Crear productos regulares
        productos.add(new Producto("CAFE1", "Ristretto", 4.90, 100));
        productos.add(new Producto("CAFE2", "Vaniglia", 5.70, 150));
        productos.add(new Producto("CAFE3", "Arpeggio", 4.90, 80));

        // Crear productos especiales
        productos.add(new CafeEspecial("CAFE4", "Freddo Delicatto", 6.50, 40, "Arábico", 9.5));
        productos.add(new CafeEspecial("CAFE5", "Festive Collection Espresso", 6.50, 25, "Arábico", 9.8));

        // Establecer los productos en la clase Operaciones
        Operaciones.setProductos(productos);

        // Mostrar información de productos disponibles
        System.out.println("----- PRODUCTOS DISPONIBLES -----");
        for (Producto producto : productos) {
            System.out.println(producto.describirProducto());
        }

        // Realizar pedidos
        System.out.println("----- REALIZANDO PEDIDOS -----\n");

        try {
            // Pedido 1 producto
            List<ProductoPedido> pedido1 = new ArrayList<>();
            pedido1.add(new ProductoPedido("CAFE1", 10));
            System.out.println("Realizando pedido...");
            Operaciones.realizarPedido(pedido1);
            System.out.println("Pedido realizado correctamente.\n");
        } catch (Exception e) {
            System.out.println("Error al realizar el pedido 1: " + e.getMessage());
        }

        try {
            // Pedido múltiples productos
            List<ProductoPedido> pedido2 = new ArrayList<>();
            pedido2.add(new ProductoPedido("CAFE2", 5));
            pedido2.add(new ProductoPedido("CAFE4", 2));
            System.out.println("Realizando pedido...");
            Operaciones.realizarPedido(pedido2);
            System.out.println("Pedido realizado correctamente.\n");
        } catch (Exception e) {
            System.out.println("Error al realizar el pedido 2: " + e.getMessage());
        }

        try {
            // Pedido multiples productos con Café Especial
            List<ProductoPedido> pedido3 = new ArrayList<>();
            pedido3.add(new ProductoPedido("CAFE5", 3));
            pedido3.add(new ProductoPedido("CAFE1", 3));
            System.out.println("Realizando pedido...");
            Operaciones.realizarPedido(pedido3);
            System.out.println("Pedido realizado correctamente.\n");
        } catch (Exception e) {
            System.out.println("Error al realizar el pedido 3: " + e.getMessage());
        }


        // Mostrar estado final del inventario
        System.out.println("----- INVENTARIO FINAL -----");
        for (Producto producto : productos) {
            System.out.println(producto.describirProducto());
        }
    }
}
