package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * Created by Bartosz on 2018-02-17.
 */
@Service
public class CalcServiceImpl implements CalcService {
    public Double calc(Double a, Double b, Operation operation) throws CalcException {
        Double result = null;
        try {
            switch (operation) {
                case SUM:
                    result = a + b;
                    break;
                case MULTIPLY:
                    result = a * b;
                    break;
                case DIVIDE:
                    result = divide(a, b);
                    break;
                case MINUS:
                    result = a - b;
                    break;
                default:
                    throw new CalcException("Nie obsługiwane jeszcze działanie: " + operation);
            }  //test
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            throw new CalcException("Calc exception for " + operation + ", para, a="+a+", b="+b +" is: " + e.getMessage());
        }
    }

    private Double divide(Double a, Double b) throws Exception {
        if(b == 0) {
            throw new Exception("Divide by zero is illegal");
        }
        return a/b;
    }
}
