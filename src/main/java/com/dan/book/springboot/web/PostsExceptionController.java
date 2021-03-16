package com.dan.book.springboot.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class PostsExceptionController {

    @ExceptionHandler(NoItemError.class)
    public @ResponseBody NoItemError noItemErrorHandler(NoItemError e) {
        NoItemError noItem = new NoItemError("해당 포스트가 없습니다.");
        return noItem;
    }

    //TODO: url Error Exception
    @ExceptionHandler(Exception.class)
    private ModelAndView errorModelAndView(Exception ex){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/error_common");
        modelAndView.addObject("exception", ex);

        return modelAndView;
    }
}

