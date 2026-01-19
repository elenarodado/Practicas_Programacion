public class Entrada {
    public static void main(String[] args) {
        System.out.println("Ejercicio 6 - Operaciones aritméticas simples");

        int operando1 = 10;
        System.out.println("Número 1: "+operando1);

        int operando2 = 5;
        System.out.println("Número 2: "+operando2);

        Operaciones operacionesAritmeticas = new Operaciones();
        operacionesAritmeticas.sumar(10,5);
        operacionesAritmeticas.restar(10,5);
        operacionesAritmeticas.multiplicar(10, 5);
        operacionesAritmeticas.dividir(10,5);
    }
}
