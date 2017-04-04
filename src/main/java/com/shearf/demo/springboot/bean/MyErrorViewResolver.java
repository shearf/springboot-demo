package com.shearf.demo.springboot.bean;

import org.springframework.boot.autoconfigure.web.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by xiahaihu2009@gmail on 2017/4/3.
 */
//@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest httpServletRequest, HttpStatus httpStatus, Map<String, Object> map) {

        if (HttpStatus.NOT_FOUND == httpStatus) {
            return new ModelAndView("404");
        }
        return null;
    }
}
