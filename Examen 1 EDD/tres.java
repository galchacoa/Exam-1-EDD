Ejercicio 3

import java.util.Scanner;
public class MyClass {
    public static void main(String[] args) {
        int[][] matriz = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}}; // matriz a evaluar

        if (esMatrizIdentidad(matriz)) {
            System.out.println("La matriz es una matriz identidad.");
        } else {
            System.out.println("La matriz no es una matriz identidad.");
        }
    }

    public static boolean esMatrizIdentidad(int[][] matriz) {
        int n = matriz.length;

        // Verificar si la matriz es cuadrada
        if (n != matriz[0].length) {
            return false;
        }

        // Verificar si la diagonal principal es toda unos y el resto son ceros
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j && matriz[i][j] != 1) {
                    return false;
                } else if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }
}