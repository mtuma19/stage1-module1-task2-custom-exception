package com.epam.mjc;

import java.sql.SQLException;

public class StudentNotFoundException extends IllegalArgumentException {
    public StudentNotFoundException(String message, Throwable e){
        super(message, e);
    }
}
