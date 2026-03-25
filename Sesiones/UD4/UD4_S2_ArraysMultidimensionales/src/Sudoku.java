public class Sudoku {
    private int [][] sudoku = new int[3][3];

    public void empezarJuego(){
        // 1- Se rellena la matriz con numeros aleatorios
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                int aleatorio;
                do {
                    aleatorio = (int) (Math.random()*21); //0-20
                } while (estaNumero(aleatorio));
                // preguntar
                sudoku[i][j] = aleatorio;
            }
        }

        // 2- Recorremos el array
        for (int[] fila:sudoku){
            for (int item:fila){
                System.out.print(item+"\t");
            }
            System.out.println();
        }
        System.out.println("Mostrando los numeros de una columna concreta");
        numeroColumna(0);
        System.out.println("Mostrando los numeros de una fila concreta");
        numeroFila(0);
    }

    private boolean estaNumero(int numero){
        for (int[] fila:sudoku){
            for (int item:fila){
                if (item==numero){
                    return true;
                }
            }
        }
        return false;
    }

    //¿Cómo consigo solo los numeros de la primera columna?
    public void numeroColumna(int nColumna){
        for (int i = 0; i < sudoku.length; i++) {
            System.out.println(sudoku[i][nColumna]);
        }
    }

    public void numeroFila(int nFila){
        for (int i = 0; i < sudoku[nFila].length; i++) {
            System.out.println(sudoku[nFila][i]);
        }
    }
}
