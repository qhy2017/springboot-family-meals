package qhy.example.web.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class ControllerException {

    @ExceptionHandler(value =RuntimeException.class)
    public Object runtimeException(RuntimeException  e){
        String message = e.getMessage();
        log.info(message);
        return ResponseEntity.ok();
    }

    @ExceptionHandler(value =Exception.class)
    public Object exception(Exception e){
        String message = e.getMessage();
        log.info(message);
        return null;
    }

 class Result {

 }
}
