package pro.sky.skyCalculate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculatorNew.CalculatorServiceImpl;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.skyCalculate.CalculatorServiceImplTestConstants.*;

class CalculatorServiceImplParametrTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @MethodSource("provideArgumentsForCalculatorService")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSum(int num1, int num2) {
        assertEquals(num1 + num2, out.sum(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorService")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMinus(int num1, int num2) {
        assertEquals(num1 - num2, out.minus(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorService")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiply(int num1, int num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @MethodSource("provideArgumentsForCalculatorService")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivide(int num1, int num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }

    private static Stream<Arguments> provideArgumentsForCalculatorService() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ZERO, TWO),
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO));
    }
///
}
