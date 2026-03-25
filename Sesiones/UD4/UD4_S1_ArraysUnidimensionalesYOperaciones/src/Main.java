import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // ARRAYS
        // 1. DEFINO EL ARRAY SEGÚN EL NÚMERO DE ELEMENTOS, cada ELEMETO es una POSICION (siempre empiezan en 0)

        int numero = 2;
        int [] numeros = new int[6];
        // new int[6] es lo mismo que decir: [0,0,0,0,0,0]

        boolean [] aciertos = new boolean[4];
        //new boolean[4] es lo mismo que decir: [false, false, false, false];

        String [] palabras = new String[3];
        //new String[3] es lo mismo que decir: [null, null, null]

        Object [] cosas = new Object[5];
        // se pueden guardar diferentes tipos, pk Object es el padre de los tipos en Java -> [1,false,"hola",9.1,'a']
        //new Object[5] es lo mismo que decir: [null, null, null, null, null]

        int [] numerosConcretos = new int[]{5,3,1,10,8};
        // Integer [] numerosConcretos2 = new Integer[]{5,3,1,10,8};
        boolean [] aciertosConcretos = new boolean[]{false, true, true};
        String [] palabrasConcretas = new String[]{"hola","programacion","array"};
        Object [] cosasConcretas = new Object[]{1,"programacion",false,0.0,'a'};

        // Cuando haces un array la funcionalidad de la variable pasa a ser compleja, aunque sea p.ej: un int
        // Sin embargo, los números dentro de la variable int serían primitivos

        //----------------------------------------------------------------------------------------------------

        // ACCIONES QUE PUEDO REALIZAR CON LOS ARRAY
        int [] numerosConcretos2 = new int[6]; // -> 6 = de 0-5 (se cuenta el 0)
        // 1. Saber la longitud del array -> cuantos elementos hay en el array, ejemplo:
        int longi = numerosConcretos2.length;
        System.out.println("El num. de elementos del array es: "+longi);
        // Modificar elementos
        numerosConcretos2[0] = 19;
        numerosConcretos2[numerosConcretos2.length-1] = 30; // -> la ultima posición se puede poner tambien como [numeros.length-1] == en este caso a 5
        // Acceder a uno de los elementos
        System.out.println("El elemento de la primera posicion es "+numerosConcretos2[0]);
        System.out.println("El elemento de la última posicion es "+numerosConcretos2[numerosConcretos2.length-1]);
        System.out.println("El elemento de la  posicion central es "+numerosConcretos2[numerosConcretos2.length/2]);
        // Mostrar todos lo elementos del array
        System.out.println(numerosConcretos2); // esto enseña el espacio en memoria

        //----------------------------------------------------------------------------------------------------

        // FOR:
        // Lo utilizamos para recorrer un array desde una posicion incial hasta una final
        // Lo utilizamos para modificar el valor de las posiciones
        // EJEMPLO FOR:
        /*
        for (int i = 0; i < numerosConcretos2.length; i++) {
            System.out.printf("El elemento en posición %d es %d%n",i,numerosConcretos2[i]);
        } */

        // FOR EACH
        // Lo utilizamos para recorrer el valor de las posiciones
        // EJEMPLO FOR EACH:
        /*
        int contador = 0;
        for (int item : numerosConcretos2){
            System.out.println("El elemento en iteracion es "+item+" en posición "+contador);
            contador++;
        }*/

        //----------------------------------------------------------------------------------------------------

        // EJEMPLO EJERCICIO ARRAY
        System.out.println("Cuántos números vas a querer guardar");
        int tamanio = scanner.nextInt();
        int[] numerosEjercicio = new int[tamanio];
        // Quiero guardar numeros aleatorio entre el 1 y el 10
        for (int i = 0; i < numerosEjercicio.length; i++) {
            numerosEjercicio[i] = (int) (Math.random() * 10) + 1; //1-10
        }

        //Ahora quiero que me busque si se ha impreso el num. que yo quería
        System.out.println("Qué numeros quieres buscar");
        int numeroBuscar = scanner.nextInt();
        int contador = 0;
        //boolean encontrado = false;
        int posicion = -1;

        // Pedir al ususario el num. buscado
        // El sistema deberá decirme en qué posición está el primer 23 encontrado. En caso de NO tener 23 me avisa.

        for (int i = 0; i < numerosEjercicio.length; i++) {
            if (numerosEjercicio[i]==numeroBuscar){
                System.out.println("La posición del num. buscado es "+i);
                posicion = i;
                break;
            }
        }

        if (posicion==-1){
            System.out.println("El número no se encuentra en la colección");
        } else {
            System.out.println("La posicion encontrada es "+posicion);
        }

        for (int item: numerosEjercicio) {
            System.out.println(item);
        }

        /*
        // Ahora quiero que se muestre el recorrido de las posiciones
        for (int item: numerosEjercicio){
            if (item == numeroBuscar){
                System.out.println(item);
                contador ++;
            }
        }
        System.out.println("El número de veces que está el número buscado es "+contador);

        for (int item: numerosEjercicio){
            System.out.println(item);*/

        //----------------------------------------------------------------------------------------------------
        // EJERCICIO CON OBJECT
        Object [] cosasConcretas2 = new Object[]{1,"adios",false, 6, 0.0, "hola", 'a'};
        for (Object item : cosasConcretas2){
            if (item instanceof Integer){
                if ((int)item>0){
                    System.out.println("El numero es mas grande que 0");
                }
            } else if (item instanceof String){
                System.out.println("La longitud de la palabra es "+item.toString().length());
            }
        }

        /*
        for (int i = 0; i < cosasConcretas2.length; i++) {
            System.out.println("El elemento es "+cosasConcretas2[i]);
        }*/
    }
}
