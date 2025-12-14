package com.odam1.ud3_poo_ejercicio1.EjerciciosNumerados.exception;

public class TextTooShortException extends RuntimeException {

    private int difference;

    public TextTooShortException(String message) {
        super(message);
    }

    public TextTooShortException(String message,int difference) {
        super(message);
        this.difference = difference;
    }

    public int getDifference() {
        return difference;
    }

    public void setDifference(int difference) {
        this.difference = difference;
    }
}
