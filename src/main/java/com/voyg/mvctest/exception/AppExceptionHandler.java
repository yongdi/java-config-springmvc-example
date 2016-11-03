package com.voyg.mvctest.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * <strong>handle controller exceptions</strong><br>
 *
 * @author voyg.net
 * @since 16-11-3
 */
@ControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(Exception.class)
    public String all() {  // handle all exception
        return "error/error";
    }
}
