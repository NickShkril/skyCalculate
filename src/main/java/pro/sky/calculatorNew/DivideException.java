package pro.sky.calculatorNew;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideException extends IllegalArgumentException {
    public DivideException() {
        super("Нельзя делить на ноль");
    }
}
//