package com.company.exeption;

/**
 * @author Arman Karapetyan
 */

public class IncorrectValueException extends RuntimeException {

    public IncorrectValueException(String message) {
        super(message);
    }

}
