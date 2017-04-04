package com.shearf.demo.springboot.advice;

import com.shearf.demo.springboot.controller.FooController;
import com.shearf.demo.springboot.controller.HomeController;
import com.shearf.demo.springboot.domain.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by xiahaihu2009@gmail on 2017/4/4.
 */
@ControllerAdvice(basePackageClasses = HomeController.class)
public class FooControllerAdvice extends ResponseEntityExceptionHandler {

//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
//    ResponseEntity<?> handleControllerException(HttpServletRequest request, Throwable ex) {
//        HttpStatus status = getStatus(request);
//        Response response = new Response();
//        response.setCode(HttpStatus.BAD_REQUEST.value());
//        response.setMessage("Bad Requeset");
//        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
//    }
//    private HttpStatus getStatus(HttpServletRequest request) {
//        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
//        if (statusCode == null) {
//            return HttpStatus.INTERNAL_SERVER_ERROR;
//        }
//        return HttpStatus.valueOf(statusCode);
//    }

}
