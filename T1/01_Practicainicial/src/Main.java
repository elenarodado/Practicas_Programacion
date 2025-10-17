public class Main {

    //VARIABLE Clase-global
    int edadGlobal =12;

    // esto es un comentario
    /*
    este comentario
    se puede dividir en
    varias lineas de codigo
     */
    // TODO me falta esto

    public static void main(String[] args) {
        System.out.println("Esta es la primera línea del programa\n");
        System.out.print("Este es otra línea del programa");
        System.out.println("Si utilizo print se escribe al lado");
        // la /n me mete un salto de línea

        //VARIABLES
        String miNombreprueba; //Ahora tiene un valor null (nulo), si creamos esto no se guarda en memoria pk todavia no se le ha asignado un valor
        String miNombre = "Elena"; //Esta variable ahora tiene un valor
        miNombre = "Elena Rodado Bauzá"; //De esta forma estoy cambiando el valor a la variable pero no la he redefinnido (que sería volver a escribirla de nuevo con String)
        char letraDNI = 'A';
        letraDNI = 73; //No da error porque el ordenador entiende los números como un significado del asci core. P, ej: la I es el número 73, la K el número 75.
        int edad = 22; //No puede tener decimales ni comas flotantes
        edad++; //Este comando le suma a edad 1 año más, por lo tanto ahora edad sería = 23
        double altura = 1.70; //Aquí se pueden encontrar todos los decimales que tenga capacidad de almacenar la máquina.
        float peso = 90.8f; //Aquí hay un límite para poder poner decimales, se diferencia del double poniendo una f al final.
        boolean experiencia = true;
        experiencia = false;

        //VARIABLE NO MUTABLE
        final String DNI = "123123A"; // de esta forma DNI no puede cambiar de valor.

        //CLASES ENVOLVENTES: Son la evolución de las variables primitivas
        // Interesan cuando las necesites, sino estás ocupando memoria innecesaria
        // La segunda palabra de la variable tiene que ir en mayus. Ej: letraCompleja

        // 1. De char a Character
        Character letracompleja = 'A';

        // 2. De int a Integer
        Integer edadCompleja = 12;

        // 3. De double a Double
        Double alturaCompleja = 21.76;

        // 4. De float a Float
        Float pesoCompleja = 21.12f;

        // 5. De boolean a Boolean
        Boolean experienciaCompleja = false;



        System.out.println("Mi nombre es: "+miNombre); //Puedo escribir solo la variable (miNombre) pero tambien puedo añadir con la doble llave ("") el texto que quiera.
        System.out.println("La letra de mi DNI es la: "+letraDNI);
        System.out.println("Mi edad es: "+edad+" años"); //concatenar se hace añadiendo un símbolo + detrás de la variable
        System.out.println("Mi altura es: "+altura);
        System.out.println("Mi peso es de: "+peso);
        System.out.println("Mi experiencia es: "+experiencia);
        System.out.println("El valor del número PI es: "+Math.PI);
        System.out.println("El valor del número E es: "+Math.E);
        System.out.println("El valor máximo de un int es: "+Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int es: "+Integer.MIN_VALUE);
    }

    public void nombreMetodo() {
        int edadGlobal =12;
        int edadMetodo = 12;
        System.out.println(edadMetodo);
        System.out.println(this.edadGlobal);
    }

    public void nombreMetodo1(){
        int edadMetodo = 123; // esta es una excepción de volver a llamar de la misma forma una variable, y se puede llamar de nuevo porque no comparten ámbito (ámbito = a que no está dentro de los mismos {})
        System.out.println(edadMetodo);
        System.out.println(edadGlobal);
    }

    // TODO esto tambien esta pendiente

}