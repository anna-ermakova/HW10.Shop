package sky.pro.hw10.shop.handler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import sky.pro.hw10.shop.controllers.ShopController;

@RestControllerAdvice(basePackageClasses = ShopController.class)
public class ShopExceptionHandler {
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleMethodArgumentTypeMismatchException() {
        return "Некорректный парамерт запроса";
    }
}
