package ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        EJERCICIO 1 DEL PDF EJERCICIOST3
        Crea un programa de adivinación de números. El programa genera de manera
        aleatoria un número entre 1 y 50. El usuario debe adivinar el número en un
        máximo de 7 intentos. Después de cada intento, indica si el número es mayor
        o menor que el elegido. Si el usuario acierta, mostrar un aviso con el número
        de intentos utilizado; si no, mostrar un aviso de que debe introducir
        nuevamente un número.
         */
        Scanner scanner = new Scanner(System.in);
        int numeroSistema = (int) (Math.random()*50)+1; // 1-50
        System.out.println("El número del sistema es el "+numeroSistema);

        int intentos = 7;
        boolean acierto = false;

        int numeroUsuario;
        do {
            System.out.println("Indica el número con el que juegas");
            numeroUsuario = scanner.nextInt();
            intentos--;
            if (numeroSistema==numeroUsuario){
                System.out.println("Has acertado el número");
                acierto = true;
                break;
            } else {
                if (numeroSistema<numeroUsuario){
                    System.out.println("Número demasiado grande");
                } else {
                    System.out.println("Número demasiado pequeño");
                }
            }
            System.out.println("Has consumido "+(7-intentos));
            // vas a pedir el numero max7 veces minimo 1
        } while (intentos>0);

        // has perdido
        if (!acierto){ // esto se llaman semáforos
            System.out.println("Has perdido");
        }

        System.out.println("Número acertado");
    }


}
