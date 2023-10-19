import java.util.InputMismatchException;
import java.util.Scanner;
public class TallerPalindromo {
    public static void main(String[] args) {
        palindromo();
    }

    public static boolean esPalindromo(String cadena) {
        cadena = cadena.replaceAll("\\s", "").toLowerCase();
        return cadena.contentEquals(new StringBuilder(cadena).reverse());
    }
    public static String leerCadena() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cadena a analizar: ");
        return sc.nextLine();
    }
    public static String verificarCadena(String cadena) {
        if (cadena.isEmpty()) {
            return null;
        } else {
            return cadena;
        }
    }
    public static void palindromo() {
        try {
            if (esPalindromo(verificarCadena(leerCadena()))) {
                System.out.print("La cadena ingresada es un palíndromo.");
            } else {
                System.out.print("La cadena ingresada no es un palíndromo.");
            }
        } catch (NullPointerException e){
            System.out.print("El argumento ingresado no es válido\n");
            throw e;
        }
    }





    public static void menu() {
        Scanner input = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Ingresar array.");
            System.out.println("2. Salir");
            System.out.print("Ingrese su elección: ");

            opcion = input.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.println("Ingresar array: ");
                    System.out.print("El resultado es: " + arrayEnteros(verificarArray(creacionArray())));
                }
                case 2 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while (opcion != 2);
    }
    public static int creacionArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el largo del array (mínimo 4 y par): ");
        return input.nextInt();
    }
    public static int[] verificarArray(int largo) {
        Scanner input = new Scanner(System.in);
        if (largo >= 4 && largo % 2 == 0) {
            int[] arreglo = new int[largo];

            for (int i = 0; i < largo; i++) {
                System.out.print("A continuación, ingrese el número #" + (i + 1) + ": ");
                arreglo[i] = input.nextInt();
            }
            return arreglo;
        } else {
            throw new IllegalArgumentException("El número ingresado no es válido.");
        }
    }
    public static double arrayEnteros(int[] arr) {
        double resultado = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            resultado += (double) arr[i] / arr[arr.length - i - 1];
        }
        return resultado;
    }
}