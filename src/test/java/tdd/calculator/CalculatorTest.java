package tdd.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = null;

    @Before //crea la instancia y ejecuta el metodo antes que los test
    public void setUp() {
        c = new Calculator();
        System.out.println("Test SetUp");
    }

    @Test //Identifica como test
    public void given_two_integers_when_addition_then_ok() {
        assertEquals(6, c.addition(4, 2));
        System.out.println("Test 1");
    }

    @Test
    public void given_two_integers_when_substraction_thne_ok() {
        assertEquals(2, c.substraction(4, 2));
        System.out.println("Test 2");
    }

    @Test(expected = ArithmeticException.class) //espera una excepcion de tipo ArithmeticException.class
    public void given_two_integers_when_division_then_exception(){
        assertEquals(3, c.division(6, 0));
        System.out.println("Test 3");
    }

    @Test(timeout = 50)//espera solo 50ms para ejecutar, caso contrario se considera que estan hackeando(como ejemplo)
    public void given_two_integers_multiplication_then_timeout(){
        assertEquals(8, c.multiplication(4, 2));
        System.out.println("Test 4");
    }
}