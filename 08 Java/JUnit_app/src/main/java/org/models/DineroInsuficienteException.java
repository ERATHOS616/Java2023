package org.models;

public class DineroInsuficienteException extends RuntimeException{

    public DineroInsuficienteException(String message) {
        super(message);
    }
}
