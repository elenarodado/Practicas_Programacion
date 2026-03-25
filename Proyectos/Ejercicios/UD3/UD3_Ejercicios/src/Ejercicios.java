import java.util.Scanner;

public class Ejercicios {

    Scanner lectorTeclado = new Scanner(System.in);

    public void ejercicio1T3(){
        /*
        EJERCICIO 1 T3 - MAYOR DE EDAD
        Crea un programa que pida la edad del usuario y determine si es mayor de edad (18 años o más).
        Muestra un mensaje indicando si puede votar o no.
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        if(edad>=18){
            System.out.println("Eres mayor de edad. Puedes votar.");
        } else {
            System.out.println("No eres mayor de edad. No puedes votar.");
        }
        lectorTeclado.close();
    }

    public void ejercicio2T3(){
        /*
        EJERCICIO 2 T3 - Número positivo o negativo
        Desarrolla un programa que pida un número al usuario
        y determine si es positivo, negativo o cero.
        Muestra el resultado por consola.
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        int numero = lectorTeclado.nextInt();

        if (numero > 0){
            System.out.println("El número es positivo.");
        } else if (numero < 0){
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
        lectorTeclado.close();
    }

    public void ejercicio3T3(){
        /*
        EJERCICIO 3 T3 - Aprobado o suspenso
        Escribe un programa que pida la nota de un examen (entre 0 y 10)
        y determine si el alumno ha aprobado (nota mayor o igual a 5) o ha suspendido.
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu nota: ");
        double nota = lectorTeclado.nextDouble();

        if (nota>=0 && nota<=10){
            if (nota<5){
                System.out.println("El alumno ha suspendido");
            } else if (nota>=5) {
                System.out.println("El alumno ha aprobado");
            }
        } else {
            System.out.println("Rango no válido, pruebe con números del 0 al 10.");
        }
        lectorTeclado.close();
    }

    public void ejercicio4T3(){
        /*
        EJERCICIO 4 T3 - Descuento por compra
        Crea un programa que pida el importe de una compra.
        Si el importe es mayor o igual a 100€, aplica un descuento del 10%.
        Muestra el importe original y el importe final a pagar.
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el importe de la compra: ");
        double importeCompra = lectorTeclado.nextDouble();

        double descuento = 0;
        if (importeCompra>=100){
            descuento = importeCompra*0.10;
        }

        double importeFinal = importeCompra-descuento;

        System.out.println("Importe original: " + importeCompra + "€");
        System.out.println("Descuento aplicado: " + descuento + "€");
        System.out.println("Importe final: " + importeFinal + "€");

        lectorTeclado.close();
    }

    public void ejercicio5T3(){
        /*
        EJERCICIO 5 T3 - Número par o impar con mensaje
        Desarrolla un programa que pida un número entero y determine si es par o impar
        usando el operador módulo. Muestra un mensaje personalizado para cada caso.
         */

        System.out.println("Introduce un número: ");
        int numero = lectorTeclado.nextInt();

        if (numero%2==0){
            System.out.println("El número "+numero+"es par");
        } else {
            System.out.println("El número "+numero+"es impar");
        }
        lectorTeclado.close();
    }

    public void ejercicio6T3(){
        /*
        EJERCICIO 6 T3 - Número par o impar con mensaje
        Escribe un programa que pida la edad del usuario y determine si puede
        acceder a contenido para mayores de 16 años.
        Si tiene 16 o más años, muestra "Acceso permitido", si no, muestra "Acceso denegado".
         */

        System.out.println("Introduce tu edad: ");
        int edad = lectorTeclado.nextInt();

        if (edad>=0 && edad<=150) {
            if (edad > 16) {
                System.out.println("Acceso permitido.");
            } else if (edad < 16) {
                System.out.println("Acceso denegado, debes tener al menos 16 años.");
            }
        } else {
                System.out.println("Rango no válido (0-150) ");
        }
        lectorTeclado.close();
    }

    public void ejercicio7T3(){
        /*
        EJERCICIO 7 T3 - Calificación con letra
        Crea un programa que pida una nota numérica (0-10) y
        determine la calificación: Suspenso (0-4), Aprobado (5-6), Notable (7-8) o Sobresaliente (9-10).
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu nota: ");
        double nota = lectorTeclado.nextDouble();

        if (nota>=0 && nota<=10){
            if (nota<=4){
                System.out.println("Tu calificación es: Suspenso");
            } else if (nota<=6) {
                System.out.println("Tu calificación es: Aprobado");
            } else if (nota<=8) {
                System.out.println("Tu calificación es: Notable");
            } else if (nota>=9) {
                System.out.println("Tu calificación es: Sobresaliente");
            }
        } else {
            System.out.println("Rango no válido (0-10)");
        }
        lectorTeclado.close();
    }

    public void ejercicio8T3(){
        /*
        EJERCICIO 8 T3 - Comparar dos números
        Desarrolla un programa que pida dos números al usuario y
        determine cuál es mayor, o si son iguales. Muestra el resultado por consola.
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int numero1 = lectorTeclado.nextInt();

        System.out.println("Introduce el segundo número: ");
        int numero2 = lectorTeclado.nextInt();

        if (numero1>numero2){
            System.out.println("El número "+numero1+" es mayor que "+numero2+".");
        } else if (numero2>numero1) {
            System.out.println("El número "+numero2+" es mayor que "+numero1+".");
        } else if (numero1==numero2) {
            System.out.println("Los números son iguales.");
        }
        lectorTeclado.close();
    }

    public void ejercicio9T3(){
        /*
        EJERCICIO 9 T3 - Calculadora de IMC basica
        Escribe un programa que pida el peso (en kg) y la altura (en metros) del usuario.
        Calcula el IMC (peso / altura²) y determina si está en peso normal (IMC entre 18.5 y 24.9),
        por debajo del peso normal (IMC menor a 18.5) o por encima del peso normal (IMC mayor a 24.9).
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu peso en kg:");
        int peso = lectorTeclado.nextInt();

        System.out.println("Introduce tu altura en metros:");
        double altura = lectorTeclado.nextDouble();

        double imc = peso/(altura*altura);
        if (imc>=18.5 && imc<=24.9){
            System.out.println("Tienes un peso normal.");
        } else if (imc<18.5) {
            System.out.println("Tienes infrapeso.");
        } else if (imc>24.9){
            System.out.println("Tienes sobrepeso.");
        }
        System.out.printf("Tu IMC es: %.2f",imc);
        lectorTeclado.close();
    }

    public void ejercicio10T3(){
        /*
        EJERCICIO 10 T3 - Entrada a parque de atracciones
        Crea un programa que pida la altura del usuario (en cm) y determine si puede subir a una atracción.
        La altura mínima es 120 cm y la máxima es 200 cm.
        Si está dentro del rango, muestra "Puedes subir", si no, indica el motivo (demasiado bajo o demasiado alto).
         */

        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce tu altura en cm:");
        int cm = lectorTeclado.nextInt();

        int alturaMinima = 120;
        int alturaMaxima = 200;

        if (cm >= alturaMinima && cm <= alturaMaxima){
            System.out.println("Puedes subir a la atracción.");
        } else if (cm < alturaMinima){
            System.out.println("No puedes subir a la atracción. Altura mínima: "+alturaMinima+"cm");
        } else if (cm > alturaMaxima){
            System.out.println("No puedes subir a la atracción. Altura máxima: "+alturaMaxima+"cm");
        }
        lectorTeclado.close();
    }

    public void ejercicio11T3(){
        /*
        EJERCICIO 11 T3 - Sistema de descuentos por niveles
        Desarrolla un programa que pida el importe de una compra y si el cliente es socio (true/false).
        Aplica descuentos según estas reglas: Si es socio Y la compra es mayor o igual a 200€, descuento del 20%.
        Si es socio Y la compra es menor de 200€, descuento del 10%.
        Si NO es socio pero la compra es mayor o igual a 300€, descuento del 5%.
        En cualquier otro caso, no hay descuento.
        Muestra el importe original, el descuento aplicado y el importe final.
         */

        lectorTeclado = new Scanner(System.in);

        System.out.println("Introduce el importe de tu compra:");
        double importeCompra = lectorTeclado.nextDouble();

        System.out.println("¿Eres socio? (true/false)");
        boolean socio = lectorTeclado.nextBoolean();

        double importeDescuento20 = importeCompra - (importeCompra * 0.2);
        double importeDescuento10 = importeCompra - (importeCompra * 0.1);
        double importeDescuento5 = importeCompra - (importeCompra * 0.05);

        if (socio==true && importeCompra >= 200){
            System.out.println("Obtienes un 20% por ser socia y tener una compra igual o mayor a 200€");
            System.out.println("Tu improte final con el descuento del 20% es de "+importeDescuento20+ "€");
        } else if (socio==true && importeCompra <200){
            System.out.println("Obtienes un 10% por ser socio");
            System.out.println("Tu improte final con el descuento del 10% es de "+importeDescuento10+ "€");
        } else if (socio==false && importeCompra >= 300){
            System.out.println("Obtienes un 5% de descuento por una compra igual o superior a 300€");
            System.out.println("Tu improte final con el descuento del 5% es de "+importeDescuento5+ "€");
        } else {
            System.out.println("No tienes ningún descuento disponible.");
        }
        lectorTeclado.close();
    }

    public void ejercicio12T3(){
        /*EJERCICIO 12
        Crea un programa que pida al usuario crear una contraseña.
        La contraseña debe cumplir estos requisitos: tener al menos 8 caracteres
        de longitud, contener al menos un número, y NO puede ser "12345678" o "password".
        El programa debe verificar cada condición por separado usando operadores lógicos
        y mostrar si la contraseña es válida o no, indicando qué requisitos no cumple.

        Nota: Para este ejercicio, asume que tienes funciones auxiliares como
        longitudCadena(texto), contienNumero(texto).
         */
        lectorTeclado = new Scanner(System.in);

        System.out.println("Introdice contraseña: ");
        String password = lectorTeclado.next();

        boolean nCaracteres = password.length()>=8;
        System.out.println("La contraseña tiene al menos 8 caracteres: "+nCaracteres);

        boolean esValida = !(password.equals("12345678") || password.equals("password"));
        System.out.println("La contraseña es prohibida: "+esValida);

        boolean contieneNumero = password.contains("1") || password.contains("2") || password.contains("3")
                || password.contains("4") || password.contains("5") || password.contains("6")
                || password.contains("7") || password.contains("8") || password.contains("9")
                || password.contains("0");
        System.out.println("La conntraseña contiene al menos 1 num: "+contieneNumero);

        boolean passValida = nCaracteres && esValida && contieneNumero;
        System.out.println("La contraseña es válida: "+passValida);

        lectorTeclado.close();
    }

    public void ejercicio13T3(){
        /*
        Escribe un programa para calcular el precio de entrada a un museo.
        Pide la edad del usuario y el día de la semana (1=Lunes, 2=Martes... 7=Domingo).
        Las reglas son: Menores de 12 años: entrada gratis.
        Entre 12 y 17 años: 5€ (pero gratis los martes).
        Entre 18 y 64 años: 10€ (pero 7€ los jueves). 65 años o más: 6€.
        Usa operadores lógicos para determinar el precio correcto y muestra el cálculo.
         */
        lectorTeclado=new Scanner(System.in);

        System.out.println("Indícame tu edad: ");
        int edad = lectorTeclado.nextInt();

        System.out.println("Indícame el día de la semana: ");
        int dia = lectorTeclado.nextInt();

        int calculoEntrada = 0;

        if(edad<12){
            calculoEntrada = 0;
        } else if (edad<17){
            if(dia==2){
                calculoEntrada=0;
            } else {
                calculoEntrada=5;
            }
        } else if (edad<64){
            if (dia == 4){
                calculoEntrada=5;
            } else{
                calculoEntrada=10;
            }
        } else {
            calculoEntrada=6;
        }

        String diaSemana = "";
        if (dia == 1){
            diaSemana="Lunes";
        } else if (dia == 2){
            diaSemana="Martes";
        } else if (dia == 3){
            diaSemana="Miércoles";
        } else if (dia == 4){
            diaSemana="Jueves";
        } else if (dia == 5){
            diaSemana="Viernes";
        } else if (dia == 6){
            diaSemana="Sábado";
        } else if (dia == 7){
            diaSemana="Domingo";
        }

        System.out.println("La entrada para la edad indicada es: "+calculoEntrada+" para el día "+diaSemana);

        lectorTeclado.close();
    }
}