package practica.tdd.calculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import practica.tdd.calculator.Calculator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class CalculatorParametersTest {
    private int a, b, expected;

    @Parameterized.Parameters
    public static Iterable<Object[]> parameters(){
        List<Object[]> objects = new ArrayList<Object[]>();
        objects.add(new Object[]{2, 4, 6});
        objects.add(new Object[]{1, 8, 9});
        objects.add(new Object[]{2, 5, 7});
        objects.add(new Object[]{7, 3, 10});
        objects.add(new Object[]{22, 4, 26});
        objects.add(new Object[]{12, 14, 26});
        return objects;
    }

    public CalculatorParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_parameters_when_addition_then_summation() {
        Calculator c = new Calculator();
        int actual = c.addition(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Para el presente caso, la prueba será aprobada para la suma ya que los parámetros ingresados
     * estan enfocados para hacer pruebas de suma, en caso de querer realizar pruebas con
     * el resto de operaciones básicas, se debe reajustar los parámetros
     */
    @Test
    public void given_parameters_when_addition_then_substraction() {
        Calculator c = new Calculator();
        int actual = c.substraction(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void given_parameters_when_addition_then_division() {
        Calculator c = new Calculator();
        int actual = c.division(a, b);
        assertEquals(expected, actual);
    }
    @Test
    public void given_parameters_when_addition_then_multiplication() {
        Calculator c = new Calculator();
        int actual = c.multiplication(a, b);
        assertEquals(expected, actual);
    }
}