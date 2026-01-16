public class Main {
    int edadGlobal = 12;

    public static void main (String[] args){

        // VARIABLE STRING
        System.out.println("Este es mi primer programa en Java");
        // String miNombre; // ahora tiene el valor nulo, null
        String miNombre = "Elena";
        System.out.println(miNombre);
        // Para concatenar se le pone un +, por ejemplo:
        System.out.println ("Mi nombre es " +miNombre);
        // Para cambiarle el valor a la varuable (miNombre) reescribimos su nombre como por ejemplo:
        miNombre = "Elena Rodado";
        System.out.println ("Mi nombre es " +miNombre);

        // VARIABLE char
        // si yo pongo numeros me lo detecta como caracteres la maquina, por ejemplo el numero 118 es la v, se denomina código ascii
        char letraDNI = 'A';
        System.out.println("La letra de mi DNI es "+letraDNI);
        char letraDNI2 = 118;
        System.out.println("El 118 en código ascii es "+letraDNI2);
        Character letraCompleja = 'A';

        //VARIABLE int
        // se puede sumar 1 aadiendo el ++, por ejemplo:
        int edad = 22;
        edad++;
        System.out.println("Mi edad es de "+edad);
        Integer edadCompleja = 10;

        //VARIABLE double y float
        double altura = 1.695854946382564368496489468964897892352789;
        Double alturaCompleja = 21.76;
        float peso = 100.23f;
        Float pesoComplejo = 21.12f;
        System.out.println("Mi altura es de "+altura);
        System.out.println("Mi peso es de "+peso);

        //VARIABLE boolean
        boolean experiencia = false;
        Boolean experienciaCompleja = false;
        System.out.println("¿Tengo experiencia como programadora? "+experiencia);

        // Cada variable primitiva tiene una variable envolvente.

        //VARIABLE final
        //No se le puede cambiar el valor a la variable final --> Tipo NO MUTABLE
        final String DNI = "123123A";

        //VARIABLES no mutables:
        System.out.println("El valor del numero PI es "+Math.PI);
        System.out.println("El valor maximo de un int es "+Integer.MAX_VALUE);
        System.out.println("El valor minimo de un int es "+Integer.MIN_VALUE);
    }


    // esto es un comentario de una linea, es lo unico que puedo poner fuera del metodo y no se ejecuta

    /* este es un comentario
    para varias lineas de
    codigo
     */

    //TODO--> con este TODO se me recalca el comentario

    public void nombreMetodo1(){
        int edadMetodod = 12;
        int edadGlobal = 12;
        System.out.println(edadMetodod);
        System.out.println(this.edadGlobal); //this. es lo que utilizamos para llamar a la variable global, sin ello llamas a la del propio metodo
     }

    public void nombreMetodo2(){
        int edadMetodo = 12;
        System.out.println(edadGlobal);
    }
}
