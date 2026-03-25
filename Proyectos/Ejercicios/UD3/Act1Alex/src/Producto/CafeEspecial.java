package Producto;

public class CafeEspecial extends Producto {
    private String origen;
    private double notaDeCata;

    public CafeEspecial(String id, String nombre, double precio, int stock, String origen, double notaDeCata) {
        super(id, nombre, precio, stock);
        this.origen = origen;
        this.notaDeCata = notaDeCata;
    }

    public String getOrigen() {
        return origen;
    }

    public double getNotaDeCata() {
        return notaDeCata;
    }

    @Override
    public String describirProducto() {
        String descripcion = super.describirProducto();
        return descripcion + "Origen: " + this.getOrigen() + "\nNota de cata: " + this.getNotaDeCata() + "\n";
    }
}
