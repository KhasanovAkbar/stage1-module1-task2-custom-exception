package com.epam.mjc;

public class StudentNotFoundException extends IllegalArgumentException {

    public StudentNotFoundException(){
        super();
    }


    public StudentNotFoundException(String message) {
        super(message);
    }
}
