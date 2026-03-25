/*
Realizar el juego de bonoloto.
Para ello el sistema contará con dos cadenas de números
    - numeros del sistema
    - numeros del user
De primeras, el sistema guardará 5 num aleatorios entre 1-20
El sistema pedirá al user que introduzca sus numeros
El sistema deberá decidir si he ganado un premio, Para ello los premios se reparaten de la sigueinte forma:
    5 aciertos -> 1 millon de euros
    4 aciertos -> 10.000 euros
    3 aciertos -> 10.00 euros
    1/2 -> 10 euros
    0 -> prueba suerte la siguiente vez
 */

import java.util.Scanner;

public class Bonoloto {
    private int[] numeroSistema = new int [5];
    
    private int[] numeroUsuario = new int [5];

    private Scanner scanner = new Scanner(System.in);

    public void generarNumSistema() {
        for (int i = 0; i < numeroSistema.length; i++) {
            int numero;
            boolean repetido;
            do {
                repetido = false;
                numero = (int)(Math.random() * 20) + 1;
                for (int j = 0; j < i; j++) {
                    if (numeroSistema[j] == numero) {
                        repetido = true;
                    }
                }
            } while (repetido);
            numeroSistema[i] = numero;
        }
    }

    public void pedirNumUsuario(){
        for (int i = 0; i < numeroUsuario.length; i++) {
            int numero;
            do {
                System.out.println("Introduce un valor entre el 1 y el 20");
                numero = scanner.nextInt();
                if (numero<1 || numero>20){
                    System.out.println("Este número no es válido.");
                }
            } while (numero<1 || numero>20);

            numeroUsuario[i] = numero;
        }
    }

    public void comprobarPremio(){
        int aciertos = 0;

        for (int i = 0; i < numeroUsuario.length; i++) {
            for (int j = 0; j < numeroSistema.length; j++) {
                if (numeroUsuario[i] == numeroSistema[j]){
                    aciertos++;
                }
            }
        }

        switch (aciertos){
            case 5:
                System.out.println("¡Has ganado 1.000.000 euros!");
                break;
            case 4:
                System.out.println("¡Has ganado 10.000 euros!");
                break;
            case 3:
                System.out.println("¡Has ganado 1.000 euros!");
                break;
            case 2:
                System.out.println("¡Has ganado 10 euros!");
                break;
            case 1:
                System.out.println("¡Has ganado 10 euros!");
                break;
            default:
                System.out.println("¡Prueba suerte la próxima vez!");
        }

        System.out.print("Los numeros del sistema son: ");
        for (int i = 0; i < numeroSistema.length; i++) {
            if (i == numeroSistema.length - 1) {
                System.out.print(numeroSistema[i]); // último número, sin coma
            } else {
                System.out.print(numeroSistema[i] + ", "); // el resto, con coma
            }
        }
    }
    


    // comprobar cuantos aciertos tiene el usuario y luego decidir cuanta pasta he ganado
}
