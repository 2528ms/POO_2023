package Matrices;

public class MatrixMultiplication{
    public static void main(String[] args) {
        // Definir las matrices a multiplicar
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{5, 6}, {7, 8}};
        

        
        // Obtener las dimensiones de las matrices
        int numRowsA = matrixA.length;
        int numColsA = matrixA[0].length;
        int numRowsB = matrixB.length;
        int numColsB = matrixB[0].length;
        
        // Verificar si las matrices son multiplicables
        if (numColsA != numRowsB) {
            System.out.println("No se pueden multiplicar las matrices. El número de columnas de A debe ser igual al número de filas de B.");
            return;
        }
        
        // Crear la matriz resultante
        int[][] resultMatrix = new int[numRowsA][numColsB];
        
        // Crear un arreglo de hilos
        MatrixMultiplicationThread[] threads = new MatrixMultiplicationThread[numRowsA];
        
        // Crear y lanzar los hilos
        for (int i = 0; i < numRowsA; i++) {
            threads[i] = new MatrixMultiplicationThread(matrixA, matrixB, resultMatrix, i);
            threads[i].start(); //Ejecuta el codigo que se encuentra en la funcion run
            System.out.println("hilo " + i);
            
        }
        
        // Esperar a que todos los hilos terminen
        try {
            for (int i = 0; i < numRowsA; i++) {
                threads[i].join(); //El método join() se utiliza para esperar a que un hilo termine su ejecución 
                                   //antes de continuar con el flujo principal del programa
                System.out.println("Finalizo hilo "+i);
            }
        }catch (InterruptedException e) {
            e.getMessage();
        }

        // Imprimir la matriz resultante
        System.out.println("Matriz resultante:");
        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
            System.out.println("Resultados del hilo "+i);
        }
    }
}

