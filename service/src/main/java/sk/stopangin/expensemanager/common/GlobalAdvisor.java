package sk.stopangin.expensemanager.common;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.validation.ConstraintViolationException;

/**
 * Created by martin.cuchran on 12/18/2018.
 */
@ControllerAdvice
public class GlobalAdvisor {
    @ExceptionHandler(ConstraintViolationException.class)
    protected ResponseEntity<Object> hanldeConstraintViolation(
            ConstraintViolationException ex) {
        return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.SERVICE_UNAVAILABLE);
    }
}
