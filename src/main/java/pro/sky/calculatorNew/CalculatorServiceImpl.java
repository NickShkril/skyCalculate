package pro.sky.calculatorNew;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Integer sum(Integer sum1, Integer sum2) {
        return sum1 + sum2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }
///
    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideException();
        }
        return num1 / num2;

    }


}
