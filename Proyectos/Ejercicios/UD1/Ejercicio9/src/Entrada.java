public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ejercicio 9 - Información de un producto");

        System.out.println("INFORMACIÓN DEL PRODUCTO");
        System.out.println("--------------------------");

        String nombreProducto = "Auriculares Bluetooth";
        float precioProducto = 29.99f;
        String codigoProducto = "AUR-2023";
        boolean stockProducto = true;

        System.out.println("Nombre: "+nombreProducto);
        System.out.println("Precio: "+precioProducto+"€");
        System.out.println("Código: "+codigoProducto);
        System.out.println("Disponible: "+stockProducto);
    }
}
