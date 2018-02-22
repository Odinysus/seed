package com.odinysus.seed.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(DaoException.class)
    public Map daoErrorHandler(DaoException e) {
        Map map = new HashMap();
        map.put("code", 100);
        map.put("msg", e.getMessage());
        return map;
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(NoHandlerFoundException.class)
    public Map notFoundHandler(Exception e) {
        Map map = new HashMap();
        map.put("code", 404);
        map.put("msg", e.getMessage());
        return map;
    }

    @ExceptionHandler(Exception.class)
    public Map otherErrorHandler(Exception e) {
        Map map = new HashMap();
        map.put("code", 500);
        map.put("msg", e.getMessage());
        return map;
    }


}
