package practica.tdd.calculator;

import org.junit.Test;
import org.mockito.Mockito;
import practica.tdd.calculator.ICalculator;

import static org.junit.Assert.*;

public class ICalculatorTest {

    @Test
    public void give_two_integers_when_addition_ok() {
        //con Mockito se simula la interacción
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.addition(2, 3)).thenReturn(5);
        //Mockito obedece los parametros con el orden en que se envían
        assertEquals(5, c.addition(2, 3));
    }
    @Test
    public void give_two_integers_when_substraction_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.substraction(4, 2)).thenReturn(2);
        assertEquals(2, c.substraction(4, 2));
    }
    @Test
    public void give_two_integers_when_division_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.division(6, 2)).thenReturn(3);
        assertEquals(3, c.division(6, 2));
    }
    @Test
    public void give_two_integers_when_multiplicacion_ok() {
        ICalculator c = Mockito.mock(ICalculator.class);
        Mockito.when(c.multiplication(2, 3)).thenReturn(6);
        assertEquals(6, c.multiplication(2, 3));
    }
}

