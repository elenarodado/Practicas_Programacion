import java.util.Scanner;

public class MainWhile {
    static void main() {
        /*

         */
        Scanner scanner = new Scanner(System.in);

        int numero = 7;
        while (numero<10){
            System.out.println("El núm es inferior a 10");
            numero++; // así lo ejecuto 3 veces
        }

        //Ejercicio: pedirle al user que introduzca numero hasta tener un negativo
        int numero2 = 0;
        while (numero2>=0){
            System.out.println("Por favor, introduce un numero");
            numero2 = scanner.nextInt();
        }
        System.out.println("Sistema detenido");

        //Ejercicio pin movil
        int intentos = 3;
        int pin = 1234;
        int pinUsuario = 0;
        boolean bloqueado = false;
        while (intentos>=0 && pinUsuario!=pin){
            System.out.println("Por favor, introduce tu pin");
            pinUsuario = scanner.nextInt();
            intentos--;
            if (intentos==0 && pinUsuario!=pin){
                bloqueado=true;
            }
        }
        if (bloqueado){
            System.out.println("Teléfono bloqueado");
        } else {
            System.out.println("Teléfono desbloqueado");
        }
        System.out.println("Sistema detenido");


        /*
        DO-WHILE -> estructura que repite un cuerpo siempre que una condición sea TRUE
        ¿Cuántas ejecuciones garantizo/mínimo tiene este estamento? -> 1 o N, si o si ejecuta una condicion
        Para que el cuerpo no sea infinito -> break o cambiar la condicion para que sea falso y deje de ejecutarse
        Se suele utilizar para hacer menus reiterativos
         */
        int number = 10;
        do {
            System.out.println("Líneas del cuerpo del bucle");
            System.out.println("Introduce un nuevo valor para numero");
            number = scanner.nextInt();
        } while (number >= 10);

        // Vamos a hacer un Menú
        int opcion;
        do {
            System.out.println("Las opciones del menu son: ");
            System.out.println("1 - sumar");
            System.out.println("2 - restar");
            System.out.println("3 - salir");
            System.out.println("Que opcion quieres hacer");
            opcion = scanner.nextInt();
            switch (opcion){
                case 1->{
                    System.out.println("Vamos a sumar");
                }
                case 2->{
                    System.out.println("Vamos a restar");
                }
                case 3->{
                    System.out.println("Saliendo...");
                }
                default ->{
                    System.out.println("Caso no contemplado");
                }
            }
        } while (opcion != 3);
    }
}
