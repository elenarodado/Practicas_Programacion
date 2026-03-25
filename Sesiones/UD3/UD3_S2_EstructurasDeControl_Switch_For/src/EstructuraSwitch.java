import java.util.Scanner;

public class EstructuraSwitch {

    public void estructuraTradicional(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la nota");
        int nota = scanner.nextInt();
        switch (nota){
            case 1:
                System.out.println("La nota vale 1, has suspendido con honores");
                break;
            case 5:
                System.out.println("Has aprobado raspado");
                break;
            case 8:
                System.out.println("Has aprobado de forma correcta");
                break;
            case 10:
                System.out.println("Lo has bordado");
                break;
            default:
                System.out.println("Esta nota no es analizable");
        }

        System.out.println("Terminando de analizar notas");
    }

    public void estructuraLambda(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indícame tu nombre");

        String nombre = scanner.next();

        String apellido = "";
        switch(nombre.toLowerCase()){ // tambn se puede poner .toUpperCase
           case "borja" ->{
               System.out.println("Nombre introducido borja");
               apellido = "asd";
           }
           case "maria" ->{
               System.out.println("Nombre introducido maria");
               apellido = "asd";
           }
           case "juan" ->{
               System.out.println("Nombre introducido juan");
               apellido = "asd";
           }
           case "marcos" ->{
               System.out.println("Nombre introducido marcos");
               apellido = "asd";
           }
            default -> {
                System.out.println("Caso no contemplado");
                apellido = "asd";
            }
        }
    }

    public void estructuraChar(){
        char letra = 'a';
        switch(letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("Consonante");
        }
    }

    public void menuOpciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor selecciona la opción a realizar");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Módulo");
        System.out.println("6 - Salir");
        System.out.println("¿Qué quieres hacer?");
        int opcion = scanner.nextInt();
        int operando1=0, operando2=0;

        if (opcion>=1 && opcion<6){
            System.out.println("Introduce operando 1");
            operando1 = scanner.nextInt();
            System.out.println("Introduce operando 2");
            operando2 = scanner.nextInt();
        }

        double resultado = 0;

        switch (opcion){
            case 1->{
                System.out.println("Vas a sumar");
                resultado=operando1+operando2;
            }
            case 2-> {
                System.out.println("Vas a restar");
                resultado=operando1-operando2;
            }
            case 3-> {
                System.out.println("Vas a multiplicar");
                resultado=operando1*operando2;
            }
            case 4-> {
                System.out.println("Vas a dividir");
                if (operando2!=0){
                    resultado=(double) operando1/operando2;
                }
            }
            case 5-> {
                System.out.println("Vas a modular");
                resultado=operando1%operando2;
            }
            case 6-> {
                System.out.println("Saliendo");
            }
            default ->{
                System.out.println("Opción no contemplada");
            }
        }
        System.out.println("El resultado obtenido es: "+resultado);
    }

    public void estructuraFor(){
        Scanner scanner = new Scanner(System.in);

        //CHULETA: rango inicial;final;incremento
        // el rango inicial sería donde empieza la i
        for(int i=0; i<5; i++){
            System.out.println("Introduce un número en posición: "+i);
            int numero = scanner.nextInt();
        }
        System.out.println("Saliendo del for");
    }

    public void ejercicioClaseFor(){
        Scanner scanner = new Scanner(System.in);
        //EJERCICIO: pide por teclado 10 num y di de todos ellos cuantos son pares, impares, numero medio introducido

        int contadorPares = 0, contadorImpares = 0;
        int sumatorio=0;

        for (int i=0; i<5; i++){

            System.out.println("Introduce un numero en posición "+i);
            int numero = scanner.nextInt();

            if (numero%2==0){
                contadorPares++;
            } else {
                contadorImpares++;
            }
            sumatorio +=numero;
        }
        System.out.println("El numero de pares es "+contadorPares);
        System.out.println("El numero de impares es "+contadorImpares);
        System.out.println("El numero medio introducido es "+sumatorio/5);
    }

    public void ejercicioClaseForNegativo(){
        Scanner scanner = new Scanner(System.in);

        for (int i=10; i>=0; i-=2){ // i-=2 así decrementas de 2 en 2
            System.out.println("Ejecución de líneas repetidas "+i);
        }
    }

    public void ejercicioTablaMultiplicar(){

        for (int i=0; i<11; i++){
            System.out.printf("%d * %d = %d%n", 5, i, 5 * i);
        }
    }
}
