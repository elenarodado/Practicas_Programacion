import java.util.Scanner;

public class Operacion {
    Scanner lecturaTeclado = new Scanner(System.in);

    public void ejercicio1T2(){
        /* EJERCICIO 1
        Crea un programa que pida al usuario dos números enteros
        por consola y muestre el resultado de las cinco operaciones aritméticas básicas:
        suma, resta, multiplicación, división y módulo (resto).
         */
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = lecturaTeclado.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = lecturaTeclado.nextInt();

        // OPERACIONES
        int resultadoSuma = numero1+numero2;
        System.out.println("Suma: "+resultadoSuma);

        int resultadoResta = numero1-numero2;
        System.out.println("Resta: "+resultadoResta);

        int resultadoMultiplicacion = numero1*numero2;
        System.out.println("Multiplicación: "+resultadoMultiplicacion);

        double resultadoDivision = (double) numero1/numero2;
        System.out.printf("División: %.2f%n",resultadoDivision);

        int resultadoResto = numero1%numero2;
        System.out.println("Módulo: "+resultadoResto);

        lecturaTeclado.close();
    }

    public void ejercicio2T2(){
        /* EJERCICIO 2
        Escribe un programa que pida dos números al usuario y
        muestre el resultado de todas las comparaciones relacionales
        entre ellos (mayor que, menor que, igual, diferente, mayor o igual, menor o igual).
         */
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = lecturaTeclado.nextInt();

        System.out.println("Introduce el segundo número:");
        int numero2 = lecturaTeclado.nextInt();

        boolean resultado1 = numero1>numero2;
        System.out.println("¿"+numero1+" es mayor que "+numero2+"?: "+resultado1);

        boolean resultado2 = numero1<numero2;
        System.out.println("¿"+numero1+" es menor que "+numero2+"?: "+resultado2);

        boolean resultado3 = numero1==numero2;
        System.out.println("¿"+numero1+" es igual a "+numero2+"?: "+resultado3);

        boolean resultado4 = numero1!=numero2;
        System.out.println("¿"+numero1+" es diferente de "+numero2+"?: "+resultado4);

        boolean resultado5 = numero1>=numero2;
        System.out.println("¿"+numero1+" es mayor o igual que "+numero2+"?: "+resultado5);

        boolean resultado6 = numero1<=numero2;
        System.out.println("¿"+numero1+" es menor o igual que "+numero2+"?: "+resultado6);

        lecturaTeclado.close();
    }

    public void ejercicio3T2(){
        /* EJERCICIO 4
        Crea un programa que declare una variable con valor inicial 100
        y aplique diferentes operadores de asignación compuesta (+=, -=, *=, /=).
        Muestra el valor de la variable después de cada operación.
         */
        lecturaTeclado = new Scanner(System.in);

        int valorInicial = 100;
        System.out.println("Valor inicial: "+valorInicial);

        valorInicial += 50;
        System.out.println("Después de sumar 50: "+valorInicial);
        valorInicial -= 30;
        System.out.println("Después de restar 30: "+valorInicial);
        valorInicial *= 2;
        System.out.println("Después de multiplicar por 2: "+valorInicial);
        valorInicial /= 4;
        System.out.println("Después de dividir entre 4: "+valorInicial);

        lecturaTeclado.close();
    }

    public void ejercicio4T2 (){
        /* EJERCICIO 4
        Desarrolla un programa que pida un número al usuario
        y determine si es par o impar usando el operador módulo.
        Muestra el resultado por consola.
         */
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Dime que numero quieres evaluar");
        int numero = lecturaTeclado.nextInt();
        if (numero%2==0){
            System.out.printf("El número %d es par%n",numero);
        } else {
            System.out.printf("El número %d es impar%n",numero); // el num se sustituye por %d
        }
        lecturaTeclado.close();
    }

    public void ejercicio5T2(){
        /* EJERCICIO 5
        Crea un programa que pida la edad del usuario y si tiene carnet de conducir (true/false).
        Usa operadores lógicos para determinar si puede alquilar un coche
        (debe tener 21 años o más Y tener carnet).
         */
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = lecturaTeclado.nextInt();

        System.out.println("¿Tienes carnet de conducir? (true/false): ");
        boolean carnetConducir = lecturaTeclado.nextBoolean();

        System.out.println("¿Eres mayor de 21 años? (true/false): ");
        boolean edadLegalConduccion = lecturaTeclado.nextBoolean();

        boolean permisoAlquilerCoche = edadLegalConduccion && carnetConducir;
        System.out.println("¿Puedes alquilar un coche? "+permisoAlquilerCoche);

        lecturaTeclado.close();
    }

    public void ejercicio6T2(){
        /* EJERCICIO 6
        Escribe un programa que pida el precio de un producto y
        el porcentaje de descuento. Calcula el precio final después
        del descuento usando operadores aritméticos y muestra todos los pasos del cálculo.
         */
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce el precio del producto: ");
        double precioProducto = lecturaTeclado.nextDouble();

        System.out.println("Introduce el porcentaje de descuento: ");
        int porcentajeDescuento = lecturaTeclado.nextInt();

        double precioOriginal = precioProducto;
        System.out.println("Precio original: "+precioOriginal+"€");

        double descuento = porcentajeDescuento;
        System.out.println("Descuento: "+descuento+"€");

        double precioFinal = precioOriginal-(precioOriginal*descuento/100);
        System.out.println("Precio final: "+precioFinal+"€");

        lecturaTeclado.close();
    }

    public void ejercicio7T2(){
        /* EJERCICIO 7
        Crea un programa que pida al usuario su edad y si es estudiante (true/false).
        Usa operadores lógicos (AND, OR, NOT) para determinar si puede acceder
        a diferentes descuentos: descuento joven (menor de 26 años),
        descuento estudiante, o descuento especial (menor de 26 Y estudiante).
         */
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Introduce tu edad: ");
        int edad = lecturaTeclado.nextInt();

        System.out.println("¿Eres estudiante? ");
        boolean estudiante = lecturaTeclado.nextBoolean();

        System.out.println("¿Eres menor de 26 años? ");
        boolean menorDe26 = lecturaTeclado.nextBoolean();

        System.out.println("¿No eres estudiante? "+!estudiante);

        boolean descuentoJoven = menorDe26;
        System.out.println("Accedes al descuento joven: "+descuentoJoven);

        boolean descuentoEstudiante = estudiante;
        System.out.println("Accedes al descuento de estudiante: "+descuentoEstudiante);

        boolean descuentoEspecial = menorDe26 && estudiante;
        System.out.println("Accedes al descuento especial: "+descuentoEspecial);

        lecturaTeclado.close();
    }

    public void ejercicio8T2(){
        /* EJERCICIO 8
        Desarrolla un programa que pida tres números al usuario y calcule:
        la suma de los tres, el promedio, el resultado de multiplicar el primero por el segundo
        y dividirlo entre el tercero. Usa paréntesis para controlar la precedencia de operadores.
         */
        lecturaTeclado=new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        int primerNumero = lecturaTeclado.nextInt();

        System.out.println("Introduce el segundo número: ");
        int segundoNumero = lecturaTeclado.nextInt();

        System.out.println("Introduce el tercer número: ");
        int tercerNumero = lecturaTeclado.nextInt();

        int sumaTresNumeros = primerNumero+segundoNumero+tercerNumero;
        System.out.println("La suma de los tres números es: "+sumaTresNumeros);

        double promedio = (double) sumaTresNumeros/3;
        System.out.printf("Promedio: %.2f%n",promedio);

        double multiplicacionDivision = (double) (primerNumero*segundoNumero)/tercerNumero;
        System.out.printf("El resultado de multiplicar los dos primeros números y dividir por el tercero es: %.2f%n",multiplicacionDivision);

        lecturaTeclado.close();
    }

    public void ejercicio9T2(){
        lecturaTeclado=new Scanner(System.in);

        System.out.println("Introduce la nota del primer examen: ");
        double notaPrimerExamen = lecturaTeclado.nextDouble();

        System.out.println("Introduce la nota del segundo examen: ");
        double notaSegundoExamen = lecturaTeclado.nextDouble();

        System.out.println("Introduce la nota del tercer examen: ");
        double notaTercerExamen = lecturaTeclado.nextDouble();

        double notaMedia = (notaPrimerExamen+notaSegundoExamen+notaTercerExamen)/3;
        System.out.println("Nota media: "+notaMedia);

        boolean aprobado = notaMedia>=5;
        System.out.println("¿Ha aprobado? "+aprobado);

        boolean notable = notaMedia>=7;
        System.out.println("¿Tiene notable? "+notable);

        boolean sobresaliente = notaMedia>=9;
        System.out.println("¿Tiene sobresaliente? "+sobresaliente);

        lecturaTeclado.close();
    }

    public void ejercicio10T2 (int horas){
        /* EJERCICIO 10
        Crea un programa que pida el salario base por hora, las horas trabajadas
        y si ha hecho horas extra (true/false). Si ha hecho horas extra y trabajó
        más de 40 horas, las horas que excedan de 40 se pagan al doble.
        Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
         */
        lecturaTeclado = new Scanner(System.in);

        System.out.println("Indica cuanto cobras por hora");
        int salarioHora = lecturaTeclado.nextInt();

        System.out.println("Indica cuantas horas has trabajado");
        int horasTrabajadas = lecturaTeclado.nextInt();

        System.out.println("¿Has trabajado horas extras?");
        boolean horasExtras = lecturaTeclado.nextBoolean();

        int salarioTotal = 0;

        if (horasExtras && horasTrabajadas > horas){
            int numeroHorasExtras = horasTrabajadas-horas;
            salarioTotal = numeroHorasExtras * (salarioHora*2);
        }
        salarioTotal += horasTrabajadas * salarioHora;
        System.out.println("El salario total este mes es "+salarioTotal+" euros");
        lecturaTeclado.close();
    }
}
