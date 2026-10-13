package co.umariana;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Pruebas de los ejercicios de calentamiento.
 * NO MODIFIQUE ESTE ARCHIVO: haga que pasen escribiendo código en Calculadora.java.
 */
class CalculadoraTest {

    Calculadora calc;

    @BeforeEach
    void crearCalculadora() {
        calc = new Calculadora();
    }

    // ---------------- sumar ----------------
    @Test
    @DisplayName("sumar: números positivos")
    void sumarPositivos() {
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(100, calc.sumar(40, 60));
    }

    @Test
    @DisplayName("sumar: con cero y negativos")
    void sumarConCeroYNegativos() {
        assertEquals(7, calc.sumar(7, 0));
        assertEquals(-1, calc.sumar(2, -3));
        assertEquals(-8, calc.sumar(-5, -3));
    }

    // ---------------- restar ----------------
    @Test
    @DisplayName("restar: resultado positivo y negativo")
    void restarBasico() {
        assertEquals(6, calc.restar(10, 4));
        assertEquals(-6, calc.restar(4, 10));
    }

    @Test
    @DisplayName("restar: con cero y negativos")
    void restarConCeroYNegativos() {
        assertEquals(9, calc.restar(9, 0));
        assertEquals(0, calc.restar(5, 5));
        assertEquals(8, calc.restar(5, -3));
    }
}
