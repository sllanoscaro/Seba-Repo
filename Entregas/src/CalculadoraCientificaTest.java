import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraCientificaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void sumaNum() {
        double[] array = {0, 2.0};
        double resultado = CalculadoraCientifica.sumaNum(array);
        assertEquals(2.0, resultado, 0.001);
    }

    @Test
    void restaNum() {
        double[] array = {-7.0, -8.6};
        double resultado = CalculadoraCientifica.restaNum(array);
        assertEquals(1.6, resultado, 0.001);
    }

    @Test
    void multiplicarNum() {
        double[] array = {10, -8.6};
        double resultado = CalculadoraCientifica.multiplicarNum(array);
        assertEquals(-86.0, resultado, 0.001);
    }

    @Test
    void dividirNum() {
        double[] array = {17, 9};
        double resultado = CalculadoraCientifica.dividirNum(array);
        assertEquals(1.888, resultado, 0.001);
    }

    @Test
    void solucionesCuadratica() {
        double[] coeficientes = {1, 4 , 5};
        double discriminante = CalculadoraCientifica.solucionesCuadratica(coeficientes);
        assertEquals(-4, discriminante, 0.001);
    }

    @Test
    void perimetroRectangulo() {
        double[] lados = {4, 4};
        double resultado = CalculadoraCientifica.perimetroRectangulo(lados);
        assertEquals(16, resultado, 0.001);
    }

    @Test
    void areaRectangulo() {
        double[] lados = {4, 5};
        double resultado = CalculadoraCientifica.areaRectangulo(lados);
        assertEquals(20, resultado, 0.001);
    }

    @Test
    void perimetroCirculo() {
        double radio = 4;
        double resultado = CalculadoraCientifica.perimetroCirculo(radio);
        assertEquals(25.132, resultado, 0.001);
    }

    @Test
    void areaCirculo() {
        double radio = 7;
        double resultado = CalculadoraCientifica.areaCirculo(radio);
        assertEquals(153.938, resultado, 0.001);
    }

    @Test
    void areaEsfera() {
        double radio = 5;
        double resultado = CalculadoraCientifica.areaEsfera(radio);
        assertEquals(314.159, resultado, 0.001);
    }

    @Test
    void volumenEsfera() {
        double radio = 2;
        double resultado = CalculadoraCientifica.volumenEsfera(radio);
        assertEquals(33.510, resultado, 0.001);
    }

    @Test
    void areaCubo() {
        double largo = 5;
        double resultado = CalculadoraCientifica.areaCubo(largo);
        assertEquals(150, resultado, 0.001);
    }

    @Test
    void volumenCubo() {
        double largo = 2;
        double resultado = CalculadoraCientifica.volumenCubo(largo);
        assertEquals(8, resultado, 0.001);
    }

    @Test
    void areaCono() {
        double[] alturaradio = {10, 5};
        double resultado = CalculadoraCientifica.areaCono(alturaradio);
        assertEquals(665.400, resultado, 0.001);
    }

    @Test
    void volumenCono() {
        double[] alturaradio = {10, 5};
        double resultado = CalculadoraCientifica.volumenCono(alturaradio);
        assertEquals(523.598, resultado, 0.001);
    }

    @Test
    void resolverSistema() {
        int[][] matriz = {{1,2,3},{4,5,6}};
        double resultado = CalculadoraCientifica.resolverSistema(matriz);
        assertEquals(-3, resultado, 0.001);
    }

    @Test
    void calcularEcRecta() {
        double[] punto1 = {2,2};
        double[] punto2 = {1,1};
        double resultado = CalculadoraCientifica.calcularEcRecta(punto1,punto2);
        assertEquals(1, resultado, 0.001);
    }
}