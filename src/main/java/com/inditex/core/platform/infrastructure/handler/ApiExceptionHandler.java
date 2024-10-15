package com.inditex.core.platform.infrastructure.handler;

import com.inditex.core.platform.domain.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(value = {NotFoundException.class})
    public final ResponseEntity<Void> handleException() {
        return ResponseEntity.notFound().build();
    }

}
