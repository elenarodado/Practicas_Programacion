public class MainMultidimensional {
    static void main() {
        Sudoku sudoku = new Sudoku();
        // ahora mismo en la variable sudoku tengo un int array de 3x3
        sudoku.empezarJuego();
        /*
        int[][] matriz = new int[][]{{4,7,9},{14,17,19},{13,4,7}};
        int[][] matriz2 = new int[][]{{4,7},{14,17,19,8},{13}}; //-> tambien nos podemos encontrar esto, son diferentes columnas cada fila, no suele ser lo normal pero nos lo podemos encontrar
        // 3 filas
        // 3 columnas
        // 4 7 9
        // 14 17 19
        // 13 4 7
        // matriz[0] -> si solo pongo uno hago ref. a fila, esto es la fila posicion 0 = [0,0,0]
        // matriz [2][1] -> segunda fila, primera columna
        // COMO SE CUANTAS FILAS TENGO? POR LA LONGITUD DE LA MATRIZ
        System.out.println("El tamaño de las filas es de "+matriz.length);

        // CUANTAS COLUMNAS TIENE LA PRIMERA FILA
        System.out.println("El tamaño de las columnas de la primera fila es "+matriz[0].length);

        // OBTENER UN ELEMENTO CONCRETO
        matriz[2][0] = 6;
        System.out.println("El elemento buscado es "+matriz[2][0]);

        //SACAR TODOS LOS ELEMENTOS -> for anidado


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]%2==0){
                System.out.println(matriz[i][j]+"\t");
                }
            }
            System.out.println();
        }
          // esto es con for

        for (int[] fila : matriz) {
            for (int item : fila){
                System.out.print(item+"\t");
            }
            System.out.println();
        }

         */
    }
}
