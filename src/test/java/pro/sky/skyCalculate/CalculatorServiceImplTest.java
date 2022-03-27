package pro.sky.skyCalculate;

import org.junit.jupiter.api.Test;
import pro.sky.calculatorNew.CalculatorServiceImpl;
import pro.sky.calculatorNew.DivideException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.skyCalculate.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1And2() {
        assertEquals(THREE, out.sum(ONE, TWO));
    }

    @Test
    public void shouldReturn2WhenSum0And2() {
        assertEquals(TWO, out.sum(ZERO, TWO));
    }

    @Test
    public void shouldReturn0WhenMinus2And2() {
        assertEquals(ZERO, out.minus(TWO, TWO));
    }

    @Test
    public void shouldReturn1WhenMinus2And1() {
        assertEquals(ONE, out.minus(TWO, ONE));
    }

    @Test
    public void shouldReturn1WhenMultiply1And1() {
        assertEquals(ONE, out.multiply(ONE, ONE));
    }

    @Test
    public void shouldReturn2WhenMultiply2And1() {
        assertEquals(TWO, out.divide(TWO, ONE));
    }

    @Test
    public void shouldReturn0WhenDivide2And2() {
        assertEquals(ONE, out.divide(TWO, TWO));
    }

    @Test
    public void shouldReturn0WhenDivide2And1() {
        assertEquals(TWO, out.divide(TWO, ONE));
    }

    @Test
    public void shouldThrowDivideExceptionWhenDivideAnyNumAnd0() {
        assertThrows(DivideException.class, () -> out.divide(TWO, ZERO));
    }
//
}
