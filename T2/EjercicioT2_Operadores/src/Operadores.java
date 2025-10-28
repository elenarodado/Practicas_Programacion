import java.util.Scanner;

public class Operadores {

    // int numeroUno = 0;

    public void operadoresAritmeticos(){
        System.out.println("Explicación de los operadores aritméticos");
        // unarios: solo necesitan de 1 operando
        int operandoUno = 5;
        int operandoDos = 2;
        int operandoTres = 3;
        operandoUno++; //esto es lo mismo a operandoUno = operandoUno + 1
        System.out.println("Después de incrementar "+operandoUno);
        operandoUno--; // esto es lo mismo a operandUno = operandoUno - 1
        operandoUno--;
        // para convertir un numero en si inversa hacemos operandoUno = -operandoUno, que sería lo mismo que 8 = -8, de esta forma se convierten
        System.out.println("Después de decrementar "+operandoUno);
        int suma = operandoDos+operandoTres;
        System.out.println("El resultado de la operación aritmética con dos operadores es: "+suma);
        int resta = operandoDos-operandoTres;
        System.out.println("En este caso la operación aritmética de una resta es de: "+resta);
        int multiplicacion = operandoDos*operandoTres;
        System.out.println("Este es el resultado de una multiplicación: "+multiplicacion);
        double division = (double)operandoDos/operandoTres; //Se pone double debido a que una división produce decimales
        System.out.printf("El resultado de la división es %.2f",division);
        int modulo = operandoTres%operandoDos; // el resto de la division
        System.out.println("Este es el resto: "+modulo);
    }

    public void operadoresAsignacion() {
        int operandoUno = 6;
        operandoUno += 6;// sería como decir: operandoUno = operandoUno+6; // 12
        operandoUno -= 3;// ahora a 12 le quitaría 3 y quedaría 9.
        operandoUno *= 2;// Y ahora 9x2=18
        operandoUno /= 2;// 18/2=9
        operandoUno %= 3;// el resultado de 9/3 es 3 y si se lo restas al 3 es 0
    }

    public void operadoresRelacional(){
        int numeroUno = 4;
        int numeroDos =7;

        boolean resultado = numeroUno>numeroDos; // false
        resultado = numeroUno>=numeroDos; // false
        resultado = numeroUno<numeroDos; // true
        System.out.println("El boleano será: "+resultado);
        resultado = numeroUno<=numeroDos; // true
        resultado = numeroUno==numeroDos; // false
        resultado = numeroUno!=numeroDos; // true

        //System.out.println(this.numeroUno);//con el this estoy llamando a la variable más general, sino estoy llamando a la del mismo ámbito
    }

    public void operadoresLogicos(){
        int numeroUno=4;
        int numeroDos=10;
        int numeroTres=17;

        // AND (&&): es true si todas son true, si hay 1 false es false
        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos!=numeroTres && numeroTres%2==0;
                                    // true && true && true && false --> false
        System.out.println("El resultado lógico del AND es: "+resultadoLogicoAND);

        // OR (||): es true si alguna es true, si todas son false es false
        boolean resultadoLogicoOR = numeroUno!=10 || numeroDos>10 || numeroTres<numeroDos || numeroDos%2!=0;
                                    // true || false || false || false --> true
        System.out.println("El resultado lógico de OR es: "+resultadoLogicoOR);

        // AND y OR combinados
        boolean resultadoCombinado = (numeroUno>0 || numeroTres<0) && (numeroDos!=9 && numeroUno<0);
                                    // (true || false) && (true && false)
        System.out.println("El resultado lógico cominado de AND y OR es: "+resultadoCombinado);

        // BOLEANO INVERTIDO

        numeroTres=20;
        numeroDos=10;
        numeroUno=0;

        boolean resultadoTotal = numeroUno>=0 && numeroDos<20&&false; // false
        boolean resultadoTotalInvertido = !resultadoTotal; // la ! le cambia el boleano a la inversa
        System.out.println("El resultado total inverso es: "+resultadoTotalInvertido);
    }

    public void evaluarCandidatos(){
        Scanner lectorTeclado = new Scanner(System.in); //Scanner es una variable compleja
        System.out.println("Dime tu nombre y apellido");
        String nombreApellido = lectorTeclado.nextLine();
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Dime el salario que quieres cobrar");
        double expectativaSalario = lectorTeclado.nextDouble();
        System.out.println("¿Tienes experiencia?");
        boolean experiencia = lectorTeclado.nextBoolean();

        //edad inferior a 40 y suelo <40000 y experiencia
        boolean resultadoEvaluacion = edad<40 && expectativaSalario<40000 && experiencia;
        System.out.println("El resultado de la evaluación es que el candidato es: "+resultadoEvaluacion);

        lectorTeclado.close();
    }
}
