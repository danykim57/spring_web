package com.dan.book.springboot.web;

public class NoItemError extends Exception {
    public NoItemError(String message) {
        super(message);
    }
}
