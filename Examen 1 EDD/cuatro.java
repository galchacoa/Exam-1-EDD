Ejercicio 4

public class MyClass {
    public static void main(String[] args) {
        int[][] matriz = {{1, 0, 0}, {2, 3, 0}, {4, 5, 6}}; // Ejemplo de matriz triangular inferior

        if (esTriangularInferior(matriz)) {
            System.out.println("La matriz es triangular inferior.");
        } else {
            System.out.println("La matriz no es triangular inferior.");
        }
    }

    public static boolean esTriangularInferior(int[][] matriz) {
        int n = matriz.length;

        // Verificar si la matriz es cuadrada
        if (n != matriz[0].length) {
            return false;
        }

        // Verificar si todos los elementos por encima de la diagonal principal son cero
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}