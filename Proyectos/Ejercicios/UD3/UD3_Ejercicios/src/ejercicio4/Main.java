package ejercicio4;

import java.util.Scanner;

public class Main {
    /*
    Crea un programa para jugar una partida virtual de dardos entre dos
    jugadores. El objetivo es que uno de los jugadores llegue exactamente a 0 puntos
    partiendo desde 301.
    Reglas:
        • Nada más empezar pide el nombre de cada jugador
        • Cada jugador comienza con 301 puntos.
        • En cada turno, un jugador lanza 3 dardos. Cada dardo genera un número
            aleatorio entre 0 y 60 (simulando puntuación en dardos).
        • La puntuación del turno es la suma de los 3 dardos.
        • Resta la puntuación del turno al total de puntos del jugador.
        • Si la puntuación restante es menor que 0, se considera que el jugador "se
            pasa" y su total no cambia ese turno.
        • El primer jugador que llegue exactamente a 0 gana la partida.
        • Después de cada turno, muestra las puntuaciones actuales y quién va
            ganando (el que tiene menos puntos).
        • Al finalizar, muestra el ganador y cuántos turnos tomó la partida.
     */
    static void main() {
        Scanner scanner = new Scanner(System.in);

        String[] jugadores = new String [2];
        for (int i = 0; i < jugadores.length; i++) {
            System.out.print("Introduce el nombre del jugador: ");
            jugadores[i] = scanner.nextLine();
        }

        for (int ronda = 1; ronda <= 3; ronda++) {
            System.out.println("--- Ronda " + ronda + " ---");
            for (int i = 0; i < jugadores.length; i++) {
                int numeroRonda = (int) (Math.random()*60);
                System.out.println(jugadores[i] + ": " + numeroRonda);
            }
            System.out.println();
        }

        scanner.close();
    }
}

