import java.util.InputMismatchException;
import java.util.Scanner;
public class CalculadoraCientifica {
    public static void main(String[] args) {
        sumaNum(entradaNum());
        //restaNum(entradaNum());
        //multiplicarNum(entradaNum());
        //dividirNum(entradaNum());
        //solucionesCuadratica(entradaCoeficientes());
        //resolverSistema(creacionSistema());

        //double[] punto1 = coordenadasPunto();
        //double[] punto2 = coordenadasPunto();
        //calcularEcRecta(punto1, punto2);
    }

    public static double[] entradaNum() {
        Scanner entrada = new Scanner(System.in);
        double[] array = new double[2];
        System.out.println("Ingrese los números a operar: ");
        try {
            array[0] = entrada.nextDouble();
            array[1] = entrada.nextDouble();
            return array;
        } catch (InputMismatchException e) {
            System.out.print("Se han ingresado parámetros incorrectos, intente de nuevo.\n");
            throw e;
        }
    }

    public static double sumaNum(double[] array) {
        double suma = array[0] + array[1];
        System.out.print("La suma de ambos números es: " + suma);
        return suma;
    }

    public static double restaNum(double[] array) {
        double resta = array[0] - array[1];
        System.out.print("La resta de ambos números es: " + resta);
        return resta;
    }

    public static double multiplicarNum(double[] array) {
        double multiplicacion = array[0] * array[1];
        System.out.print("La multiplicación de ambos números es: " + multiplicacion);
        return multiplicacion;
    }

    public static double dividirNum(double[] array) {
        while (true) {
            if (array[1] != 0) {
                double division = array[0] / array[1];
                System.out.print("La división de ambos números es: " + division);
                return division;
            } else {
                System.out.println("El divisor debe ser distinto de 0.");
                array = entradaNum();
            }
        }
    }

    public static double[] entradaCoeficientes() {
        Scanner entrada = new Scanner(System.in);
        double[] array = new double[3];
        System.out.println("Ingrese los coeficientes de la ecuación: ");
        try {
            array[0] = entrada.nextDouble();
            array[1] = entrada.nextDouble();
            array[2] = entrada.nextDouble();
            return array;
        } catch (InputMismatchException e) {
            System.out.print("Se han ingresado parámetros incorrectos, intente de nuevo.\n");
            throw e;
        }
    }

    public static double solucionesCuadratica(double[] coeficientes) {
        double discriminante = (coeficientes[1] * coeficientes[1]) - 4 * (coeficientes[0] * coeficientes[2]);

        if (discriminante < 0) {
            System.out.print("La ecuación no tiene soluciones en los reales.");
        } else if (discriminante == 0) {
            double resultado = -coeficientes[1] / (2 * coeficientes[0]);
            System.out.print("La ecuación tiene una única solución. Resultado: " + resultado);
        } else {
            double resultado1 = (-coeficientes[1] + Math.sqrt(discriminante)) / (2 * coeficientes[0]);
            double resultado2 = (-coeficientes[1] - Math.sqrt(discriminante)) / (2 * coeficientes[0]);
            System.out.println("Las soluciones de la ecuación son: ");
            System.out.println("X1 = " + resultado1);
            System.out.print("X2 = " + resultado2);
        }
        return discriminante;
    }

    public static double perimetroRectangulo(double[] array) {
        double resultado = 2 * (array[0] + array[1]);
        System.out.print("El perímetro del rectángulo es: " + resultado);
        return resultado;
    }

    public static double areaRectangulo(double[] array) {
        double resultado = array[0] * array[1];
        System.out.print("El área del rectángulo es: " + resultado);
        return resultado;
    }

    public static double perimetroCirculo(double radio) {
        double resultado = 2 * Math.PI * radio;
        System.out.print("El perímetro del circulo es: " + resultado);
        return resultado;
    }

    public static double areaCirculo(double radio) {
        double resultado = Math.PI * radio * radio;
        System.out.print("El área del circulo es: " + resultado);
        return resultado;
    }

    public static double areaEsfera(double radio) {
        double resultado = 4 * Math.PI * radio * radio;
        System.out.print("El área de la esfera es: " + resultado);
        return resultado;
    }

    public static double volumenEsfera(double radio) {
        double resultado = ((double) 4 / 3) * Math.PI * radio * radio * radio;
        System.out.print("El volumen de la esfera es: " + resultado);
        return resultado;
    }

    public static double areaCubo(double largo) {
        double resultado = 6 * largo * largo;
        System.out.print("El área del cubo es: " + resultado);
        return resultado;
    }

    public static double volumenCubo(double largo) {
        double resultado = largo * largo * largo;
        System.out.print("El volumen del cubo es: " + resultado);
        return resultado;
    }

    public static double areaCono(double[] array) {
        double resultado = Math.PI * array[0] * array[0] + Math.PI * array[0] * Math.sqrt(array[1] * array[1] + array[0] * array[0]);
        System.out.print("El área del cono es: " + resultado);
        return resultado;
    }

    public static double volumenCono(double[] array) {
        double resultado = ((double) 1 / 3) * Math.PI * array[0] * array[0] * array[1];
        System.out.print("El volumen del cono es: " + resultado);
        return resultado;
    }

    public static int[][] creacionSistema() {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese el elemento en la posición [" + i + "][" + j + "]: ");
                try {
                    matriz[i][j] = entrada.nextInt();
                } catch (InputMismatchException e) {
                    System.out.print("Se han ingresado parámetros incorrectos, intente de nuevo.\n");
                    throw e;
                }
            }
        }

        return matriz;
    }

    public static double resolverSistema(int[][] matriz) {
        double determinante = matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1];

        if (determinante == 0) {
            System.out.print("El sistema no tiene solución.");
        } else {
            double solucionX = (matriz[0][2] * matriz[1][1] - matriz[1][2] * matriz[0][1]) / determinante;
            double solucionY = (matriz[0][0] * matriz[1][2] - matriz[1][0] * matriz[0][2]) / determinante;
            System.out.println("Las soluciones del sistema son: ");
            System.out.println("X = " + solucionX);
            System.out.print("Y = " + solucionY);
        }
        return determinante;
    }

    public static double[] coordenadasPunto() {
        Scanner entrada = new Scanner(System.in);
        double[] coordenada = new double[2];
        System.out.println("Ingrese el par de coordenadas del punto: ");
        try {
            coordenada[0] = entrada.nextDouble();
            coordenada[1] = entrada.nextDouble();
            return coordenada;
        } catch (InputMismatchException e) {
            System.out.print("Se han ingresado parámetros incorrectos, intente de nuevo.\n");
            throw e;
        }
    }
    public static double calcularEcRecta(double[] punto1, double[] punto2) {
        double pendiente = (punto2[1] - punto1[1]) / (punto2[0] - punto1[0]);
        double termino_independiente = punto1[1] - pendiente * punto1[0];
        System.out.print("La ecuación de la recta es: y = " + pendiente + "x + " + termino_independiente);
        return pendiente;
    }

}