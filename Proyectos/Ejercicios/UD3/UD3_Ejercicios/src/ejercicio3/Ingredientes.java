package ejercicio3;

public enum Ingredientes {

    Queso(10), Jamon(12), Pina(8), Tomate(6), Pepperoni(10);

    int precio;
    Ingredientes(int precioP){
        precio = precioP;
    }
}
