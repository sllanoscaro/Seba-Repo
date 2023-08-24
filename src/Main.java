import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] mxn = leerDimensiones();
        validarDimensiones(mxn);
        int[][] matriz = crearMatriz(mxn);
    }
    public static int[] leerDimensiones() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa las dimensiones de la matriz: ");

        int m = input.nextInt();
        int n = input.nextInt();
        return(new int[]{m,n});
    }
    public static boolean validarDimensiones(int[] mxn) {
        int filas = mxn[0];
        int columnas = mxn[1];

        if (filas > 0 && columnas > 0) {
            System.out.print("Entrada válida.");
            return true;
        }
        else {
            System.out.print("Entrada inválida.");
            return false;
        }
    }
    public static int[][] crearMatriz(int[] mxn) {
        int filas = mxn[0];
        int columnas = mxn[1];

        return new int[filas][columnas];
    }
    public static int[][] llenarMatriz(int[][] matriz) {
        for (int fila = 0; fila < matriz[fila].length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
