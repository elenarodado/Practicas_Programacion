import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos(){
        System.out.println("Explicación de los operadores aritméticos");

        //UNARIOS: solo necesitan un operando -> Tipo INCREMENTO
        int operandoUno = 5;
        operandoUno++; // operandoUno = operandoUno + 1 = 5+1 =6
        //TODO operandoUno = 6
        System.out.println("Este es un operando unario de incremento: "+operandoUno);

        //UNARIOS: solo necesitan un operando -> Tipo DECREMENTO
        int operandoDos = 5;
        operandoDos--; // operandoDos = operandoDos - 1 = 5-1 =4
        //TODO operandoDos = 4
        System.out.println("Este es un operando unario de decremento: "+operandoDos);

        //BINARIOS: más de 1 operando -> Tipo SUMA
        int suma = operandoUno+operandoDos;
        System.out.println("El resultado de la suma es "+suma);
        System.out.println("Si meto en sout los operandos juntos, se concatenan, es decir el cuatro se junta al 6= "+operandoUno+operandoDos);
        System.out.println("Si le pongo un paréntesis a los operandos sí que hace la suma, 6+4= "+(operandoUno+operandoDos));

        //BINARIOS: más de 1 operando -> Tipo RESTA
        int resta = operandoUno-operandoDos;
        System.out.println("El resultado de la resta es "+resta);

        //BINARIOS: más de 1 operando -> Tipo MULTIPLICACIÓN
        int multiplicacion = operandoUno*operandoDos;
        System.out.println("El resultado de la multiplicación es "+multiplicacion);

        //BINARIOS: más de 1 operando -> Tipo DIVISIÓN
        double division = (double)operandoUno/operandoDos;
        System.out.println("El resultado de la division es "+division);
        // si divides dos int el resultado va a ser int (entero)
        // solucion = pasar uno de los operandos a double temporalmente (casteo)
        int modulo = operandoUno%operandoDos; // el modulo es el resto de una division
        System.out.println("El modulo de dividir 6/4 = "+modulo);

        //NUEVO CONCEPTO -> printf: impresión por consola formateada
        System.out.printf("El resultado de la division es %.2f \n",division);
        // para poner el numero de decimales que queremos se pone %.xf (x = núm. requerido)

        //Para convertir el número en NEGATIVO  o POSITIVO
        operandoUno=-operandoUno;
        System.out.println("Ahora este número es negativo= "+operandoUno);
        operandoUno=-operandoUno;
        System.out.println("Ahora este número es positivo (- x - = +)= "+operandoUno);
    }

    public void operadoresAsignacion(){
        int operandoUno = 6; // Este sería un operador de asignacion normal
        operandoUno += 6; // Es lo mismo que decir: operandoUno = operandoUno + 6 = 12;
        operandoUno -= 3; // Teníamos 12 y ahora sería: 12 - 3 = 9
        operandoUno *= 2; // Ahora 9 se multiplica por 2 = 9x2 = 18
        operandoUno /= 2; // Ahora sería 18 / 2 = 9
        operandoUno %= 3; // El resto de 9/3 es 0.
    }

    public void operadoresRelacional(){
        int numeroUno = 4;
        int numeroDos = 8;

        boolean resultado = numeroUno>numeroDos; // false
        System.out.println("El resultado > es: "+resultado);
        resultado = numeroUno>=numeroDos; // false
        System.out.println("El resultado >= es: "+resultado);
        resultado = numeroUno<numeroDos; // true
        System.out.println("El resultado < es: "+resultado);
        resultado = numeroUno<=numeroDos; // true
        System.out.println("El resultado <= es: "+resultado);
        resultado = numeroUno==numeroDos; // false
        System.out.println("El resultado == es: "+resultado);
        resultado = numeroUno!=numeroDos; // true
        System.out.println("El resultado != es: "+resultado);
    }

    public void operadoresLogicos(){
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

        // AND (&&)
        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2!=0; // true
        System.out.println("Este booleano de AND es: "+resultadoLogicoAND);

        // OR (||)
        boolean resultadoLogicoOR = numeroUno!=1 || numeroDos>10 || numeroTres<numeroDos || numeroDos%2!=0; //
        System.out.println("Este booleano de OR es: "+resultadoLogicoOR);

        // AND Y OR
        boolean resultadoCombinado = numeroUno<10 || numeroTres>0 || numeroDos!=9 && numeroUno>0;
        System.out.println("Este booleano combinado con AND y OR es: "+resultadoCombinado);

        boolean resultadoCombinado2 = (numeroUno>0 || numeroTres<0) && (numeroDos!=9 && numeroUno<0);
        System.out.println("Este booleano combinado con AND y OR es: "+resultadoCombinado2);

        numeroUno = 0;
        numeroDos = 10;
        numeroTres = 20;
        boolean resultadoTotal = numeroUno>= 0 && numeroDos<20 &&false; // false
        boolean resultadoTotalInv = !resultadoTotal; // con la excalamción delante cambias el booleano
        System.out.println("Este booleano invertido es: "+resultadoTotalInv);

        // NOT
    }

    public void evaluarCandidato(){

        // CREACIÓN DE ENTRADA POR SCANNER
        Scanner lectorTeclado = new Scanner(System.in); // variable compleja

        System.out.println("Dime tu nombre y apellido");
        String nombreApellido = lectorTeclado.nextLine(); //el nextLine es para leer un String con espacios

        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();

        System.out.println("¿Qué salario quieres cobrar?");
        double expectativaSalario = lectorTeclado.nextDouble();

        System.out.println("¿Tienes experiencia?");
        boolean experiencia = lectorTeclado.nextBoolean();

        boolean evaluacionCandidato = edad<40 && expectativaSalario<=40000 && experiencia;
        System.out.println("El resultado de la evaluación es que el candidato es: "+evaluacionCandidato);

        lectorTeclado.close();
    }

    public void cambiosTipo(){

        // CASTEO (de int -> char)
        int letraAscii = 75;
        System.out.println((char)letraAscii);

        // CASTEO (de char -> int)
        char letra = 'w';
        System.out.println((int)letra);

        // PARSEO (de String a -> X)
        /* Este ejemplo NO ES POSIBLE, Hola NO SE PUEDE traducir a numero
        String palabra = "Hola";
        System.out.println(Integer.parseInt(palabra));
        */
        String palabra = "7";
        System.out.println(Integer.parseInt(palabra)+10); // si String es un numero se puede pasar a int desde la clase envolvente de int -> Integer

        // PARSEO (de String a -> boolean)
        String palabraB = "true";
        System.out.println(Boolean.parseBoolean(palabraB));

        // PARSEO (de boolean -> String)
        boolean cierto = true;
        System.out.println(String.valueOf(cierto)+"asd");

        //PARSEO (de int -> String)
        int numero = 123;
        System.out.println(String.valueOf(numero)+1); // este resultado será 1231

        // PARSEO (de cahr -> String)
        char letra1 = 'a';
        System.out.println(String.valueOf(letra1));
    }
}
