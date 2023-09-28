package Matrices;
//Esta clase extiende de la clase Thread
class MatrixMultiplicationThread extends Thread {
    private int[][] matrixA;
    private int[][] matrixB;    //declaramos atributos de la clase
    private int[][] resultMatrix;
    private int row;

    //creamos el constructor de la clase
    public MatrixMultiplicationThread(int[][] matrixA, int[][] matrixB, int[][] resultMatrix, int row) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        this.resultMatrix = resultMatrix;
        this.row = row;
    }

    //Sobreescribimos la funcion "run" de la clase Thread
    //es donde puedes colocar la lógica que deseas que el hilo ejecute de manera concurrente.
    // Se ejecutará en el contexto del hilo cuando se invoque el método start
    @Override
    public void run() {
        int numColsA = matrixA[0].length; //obtenemos el numero de columnas de cada matriz
        int numColsB = matrixB[0].length;

        for (int j = 0; j < numColsB; j++) {
            for (int k = 0; k < numColsA; k++) {
                resultMatrix[row][j] += matrixA[row][k] * matrixB[k][j]; //aplicamos la formula de multiplicacion de matrices
            }
        }
    }
}
