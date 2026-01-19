public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ejercicio 10 - Conversión de temperaturas");

        int gradosCelsius = 25;
        System.out.println("Temperatura en Celsius: "+gradosCelsius);

        Operaciones conversionTemperaturas = new Operaciones();
        conversionTemperaturas.multiplicar(+gradosCelsius,9,5,32);
    }
}
