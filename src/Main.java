import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mxn = leerDimensiones();
        validarDimensiones(mxn);
        int[][] matriz = crearMatriz(mxn);
        llenarMatriz(matriz);
        mostrarMatriz(matriz);
        mostrarFila(matriz);
    }

    public static int[] leerDimensiones() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa las dimensiones de la matriz: ");

        int m = input.nextInt();
        int n = input.nextInt();
        return (new int[]{m, n});
    }

    public static boolean validarDimensiones(int[] mxn) {
        int filas = mxn[0];
        int columnas = mxn[1];

        if (filas > 0 && columnas > 0) {
            System.out.print("Entrada válida. Matriz:");
            return true;
        } else {
            System.out.print("Entrada inválida.\n");
            return false;
        }
    }

    public static int[][] crearMatriz(int[] mxn) {
        int filas = mxn[0];
        int columnas = mxn[1];

        return new int[filas][columnas];
    }

    public static void mostrarMatriz(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                System.out.print(matriz[filas][columnas] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] llenarMatriz(int[][] matriz) {
        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                matriz[filas][columnas] = (int) Math.floor(Math.random() * 10);
            }
            System.out.println();
        }
        return matriz;
    }

    public static void mostrarFila(int[][] matriz) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa la fila que deseas visualizar: ");
        int fila = input.nextInt();

        for (int columnas = 0; columnas < matriz[fila - 1].length; columnas++) {
            System.out.print(matriz[fila - 1][columnas] + " ");
        }
    }
}



