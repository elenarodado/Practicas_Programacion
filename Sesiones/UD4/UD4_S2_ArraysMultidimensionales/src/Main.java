import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        //esto son arrays que estan en una sola fila -> arrays unidimensionales
        int[] numeros = new int[]{8,12,5,45,2};
        String[] palabras = new String[]{"palabra1", "hola", "juego", "programación"};
        Arrays.sort(palabras, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()){
                    return -1;
                } else if(o1.length()<o2.length()){
                    return 1;
                }
                return 0;
            }
        });

        int[]numerosNuevos = Arrays.copyOf(numeros,10);
        /*Arrays.sort(numeros);
        for (int item : numeros) {
            System.out.println(item);
        }
         */

        for (int numero : numerosNuevos) {
            System.out.println(numero);
        }

        for (String item : palabras) {
            System.out.println(item);
        }

        /*
        Object[] cosas = new Object[]{"Borja", 42, "borja@gmail.com", true, 'A'};
        for (int i = 0; i < numeros.length; i++) {
            numeros [i] = (int) (Math.random()*21);
        }
        for (int item : numeros) {
            System.out.println(item);
        }
         */

        //todo ARRAYS MLTIDIMENSIONALES -> lista de elementos, tamaño fijo, en cada hueco puedo guardar multiples elementos


    }
}
