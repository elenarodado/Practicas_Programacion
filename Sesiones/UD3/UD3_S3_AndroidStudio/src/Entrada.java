import java.util.Scanner;

public class Entrada {
    public static void main (String[] args){

        // Hacemos ejercicios en clase para practicar el for

        // EJERCICIO 1 -> Calcular base * altura de un cuadrado
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indica el tamaño del cuadrado");
        int tamanio = scanner.nextInt();
        for (int i = 0; i < tamanio; i++) { // esto quiere decir que pinte tantas veces como te pida
            for (int j = 0; j < tamanio; j++) {
                if (i==0 || i==tamanio-1){
                    System.out.print(" * ");
                } else if (j==0 || j==tamanio-1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // EJERCICIO 2 -> Calcular el factorial de un numero, y esto quiere decir:
        /*
        4! = a la multiplicacion del numero hasta el 1 = 4*3*2*1
        De este mismo ejemplo se calcularía así:
        1*1=1
        1*2=2
        2*3=6
        6*4=24
        4! = 24
        Calculamos el resultado de las op multiplicandolas por el factorial

        En los factoriales nunca se llega a 0, incluso el factorial de 0 es 1
        0! = 1
         */
        int factorial = 1;
        for (int i = 1; i <=4; i++) {
            factorial = factorial*i; // esta op hace que se multiplique el factorial por el numero y guarde el resultado para despues multiplicarlo por otro factorial
        }
        System.out.println("El factorial del numero 4 es: "+factorial);

        System.out.println("Indica el tamaño del corazon (numero impar recomendado): ");
        int tamanio2 = scanner.nextInt();

        for (int i = 0; i < tamanio2; i++) {
            for (int j = 0; j < tamanio2; j++) {

                // Parte superior del corazón
                if ((i == 0 && j % (tamanio2/2) != 0) ||
                    (i == 1 && j % (tamanio2/2) == 0) ||

                // Parte inferior (forma de V)
                   (i - j == tamanio2/2) ||
                   (i + j == tamanio2 + tamanio2/2 - 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        // PALABRA PALÍNDROMO
        // palíndormo -> palabra que se puede leer igual de izq a der o viceversa, p.ej: ana, oso
        //¿Cómo compruebo que una palabra es palíndroma?
        // recordemos que para sacar la letra de una palabra en concreto es: palabra.charAt(0)
        // si la primera letgra de una palabra la quiero comparar con la ultima y ver si son la misma sería: palabra.charAt(0) == palabra.charAt(palabra.length()-1)
        System.out.println("Indica la palabra para ver si cumple");
        scanner = new Scanner(System.in);

        String palabra = scanner.nextLine(); // nextLine porque quiero leer espacios
        boolean esPalindromo = true;
        for (int i = 0; i < palabra.length()/2; i++) { //palabra.length()/2 -> quiere decir que recorre el largo de la palabra hasta la mitad
            //System.out.println(palabra.charAt(i));
            // i=0 -> a != a
            // i=0 -> l != l
            // i=2 -> l != l
            if (palabra.charAt(i) != palabra.charAt(palabra.length()-1-i)){ //la ultima palabra se representa como palabra.length()-1
                esPalindromo=false;
                break; // el estamento break rompe la ejecución del bucle repetitivo
            }
        }
        if (esPalindromo){
            System.out.println("La palabra es palíndromo");
        } else {
            System.out.println("La palabra NO es palíndromo");
        }

        /*
        Las variables que hemos visto hasta ahora gurdan un solo valor, en el sigueinte tema veremos las Estructuras de Datos, que hacen referencia
        a cuando una variavble guarda más de un dato. Esa definición se llama array.
         */
        // ARRAYS
        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        // para coger estos elementos se suelen utilizar posiciones, Lunes es posicion 0, siempre se empieza por 0
        System.out.println(diasSemana[0]); // así saco un valor

        for (int i = 0; i < 7; i++) { // así saco todos los valores
            System.out.println(diasSemana[i]);
        }

        for (int i = 0; i < 7; i++) { // así saco los valores pares
            if (i % 2 == 0) {
                System.out.println(diasSemana[i]);
            }
        }

        // For each -> no le dices donde empieza y donde termina una colección, sino que tu le dices la coleccion y la recorre completa
        // si antes la formula era inicio; final; incremento ahora es _: coleccionARecorrer
        // se suele utilizar cuando quieres preguntar cosas del elemento y recorrer, no me vale para modificar
        for (String item : diasSemana){
            System.out.println(item); //de esta forma item toma el valor de la coleccion, por lo que llamará de lunes a domingo
        }
    }
}
