Ejercicio 1

public class MyClass {
   public static void main(String[] args) {
        // Ejemplo de matrices
        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{2, 1}, {4, 3}};
        int[][] matriz3 = {{1, 1}, {1, 1}};

        int[][] resultado = multiplicarYSumar(matriz1, matriz2, matriz3);

        // Imprimir la matriz resultante
        imprimirMatriz(resultado);
    }

    public static int[][] multiplicarYSumar(int[][] matriz1, int[][] matriz2, int[][] matriz3) {
        // Verificar si las dimensiones permiten las operaciones
        if (matriz1[0].length != matriz2.length || matriz2[0].length != matriz3[0].length) {
            System.out.println("Las dimensiones de las matrices no son compatibles para estas operaciones.");
            return null;
        }

        // Multiplicar matriz1 y matriz2
        int[][] multiplicacion = multiplicarMatrices(matriz1, matriz2);

        // Sumar el resultado de la multiplicación con matriz3
        int[][] resultado = sumarMatrices(multiplicacion, matriz3);

        return resultado;
    }

    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int columnas2 = matriz2[0].length;

        int[][] resultado = new int[filas1][columnas2];

        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        return resultado;

    }

    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] resultado = new int[filas][columnas];


        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();

        }
    }
}