package com.revature.day6.exception;

public class InsufficientFundException extends Exception{
    public InsufficientFundException(){

    }

    public InsufficientFundException(String msg){

    }

    public InsufficientFundException(Throwable throwable){
        super(throwable);
    }

    public InsufficientFundException(String msg, Throwable throwable){
        super(msg, throwable);
    }
}
