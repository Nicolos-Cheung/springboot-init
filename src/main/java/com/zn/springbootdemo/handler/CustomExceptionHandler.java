package com.zn.springbootdemo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ning on 10/8/18.
 */
@ControllerAdvice
public class CustomExceptionHandler {

    private static final Logger LOG = LoggerFactory.getLogger(CustomExceptionHandler.class);


    //捕获全局异常，处理所有不可知异常
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    Object handleException(Exception e, HttpServletRequest request) {

        LOG.error("url {} , msg {}", request.getRequestURL(), e.getMessage());

        Map<String, Object> map = new HashMap<>();
        map.put("errorcode", 123);
        map.put("errormsg", e.getMessage());
        map.put("url", request.getRequestURL());
        return map;

    }
}
