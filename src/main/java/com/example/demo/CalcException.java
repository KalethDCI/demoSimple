package com.example.demo;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Bartosz on 2018-02-17.
 */
@Getter
@Setter
public class CalcException extends Exception {

    private int errorCore = 0;
    private String errorMsg = "test";

    public CalcException(String message) {
        super(message);
    }

}
