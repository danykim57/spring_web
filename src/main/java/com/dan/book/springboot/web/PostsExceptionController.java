package com.dan.book.springboot.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.NoSuchElementException;

@ControllerAdvice
public class PostsExceptionController {

    @ExceptionHandler(NoItemError.class)
    public @ResponseBody NoItemError noItemErrorHandler(NoItemError e) {
        NoItemError noItem = new NoItemError("해당 포스트가 없습니다.");
        return noItem;
    }

    //TODO: url Error Exception
}
